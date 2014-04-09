package org.fusesource.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class RequestHeaderProcessor implements Processor {

	static int count = 0;

	public void process(Exchange exchange) throws Exception {

		// System.out.println("LINE NO 1");
		count++;

		// Add add = exchange.getIn().getBody(Add.class);

		MessageContentsList messageContentsList = (MessageContentsList) exchange
				.getIn().getBody();

		System.out.println(count + "Count Value" + (count % 3));
		if (count % 3 != 0) {
			System.out.println(count + "Count Value");
			// Fault fault = new Fault();
			// fault.setFaultcode(value)

			// fault.setFaultstring("SIMPLE FAULT");
			exchange.setException(new Exception("THIS IS SAMPLE EXCEPTION"));
			// throw new Exception();
		}

		// messageContentsList.get(0);

		// for (Iterator iterator = messageContentsList.iterator(); iterator
		// .hasNext();) {
		// Object object = (Object) iterator.next();
		// System.out.println(object);
		//
		// }

		// System.out.println("ADD VALUE" + add);
		// System.out.println("ADD VALUE" + add.getArgumentOne());
		// System.out.println("ADD VALUE" + add.getArgumentTwo());

		// System.out.println(exchange.getIn().getHeader("operationNamespace"));
		// System.out.println(exchange.getOut().getHeader("operationNamespace"));
		// System.out.println(exchange.getIn().getHeader("operationName"));
		// System.out.println(exchange.getOut().getHeader("operationName"));

		exchange.getIn().setHeader(
				"operationNamespace",
				"http://example/wrapped/"
						+ exchange.getIn().getHeader("operationName"));
		exchange.getOut().setHeader(
				"operationNamespace",
				"http://example/wrapped/"
						+ exchange.getIn().getHeader("operationName"));
		exchange.getOut().setHeader("operationName",
				exchange.getIn().getHeader("operationName"));

		exchange.getOut().setBody(
				new Object[] { messageContentsList.get(0),
						messageContentsList.get(1) });
		System.out.println(exchange.getIn().getHeader("operationNamespace"));
		System.out.println(exchange.getOut().getHeader("operationNamespace"));
		System.out.println(exchange.getIn().getHeader("operationName"));
		System.out.println(exchange.getOut().getHeader("operationName"));

	}
}