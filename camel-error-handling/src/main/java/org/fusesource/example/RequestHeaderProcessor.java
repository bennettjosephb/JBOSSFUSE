package org.fusesource.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class RequestHeaderProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {

		// System.out.println("LINE NO 1");

		// Add add = exchange.getIn().getBody(Add.class);

		MessageContentsList messageContentsList = (MessageContentsList) exchange
				.getIn().getBody();

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