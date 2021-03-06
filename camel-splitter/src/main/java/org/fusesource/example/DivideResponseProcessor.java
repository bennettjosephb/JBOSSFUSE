package org.fusesource.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import webservice.InvokeMe;
import webservice.RequestDataResponse;

public class DivideResponseProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {

		System.out.println("LINE NO 1");

		System.out.println(exchange.getIn().getBody());
		System.out.println(exchange.getIn().getBody(String.class));

		// System.out.println(requestData);
		// System.out.println(requestData.getNo());
		// System.out.println(requestData.getSalary());

		// System.out.println(exchange.getIn().getBody().getClass().getName());
		//
		// MessageContentsList msgList =
		// (MessageContentsList)exchange.getIn().getBody();

		System.out.println("================");
		// for(int i=0; i < msgList.size(); i++){
		// System.out.println(msgList.get(i));
		// }

		// msgList.remove(0);

		System.out.println("================");

		// RequestData temp = exchange.getIn().getBody(RequestData.class);

		System.out.println("LINE NO 2");

		System.out.println(exchange.getIn().getHeader("operationName"));
		System.out.println("LINE NO 3");
		System.out.println(exchange.getIn().getHeader("operationNamespace"));
		System.out.println("LINE NO 4");
		// exchange.getIn().setHeader("operationName", "invokeMe");

		/*
		 * String SOAPContent =
		 * "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
		 * + "<soap:Body>"+
		 * "<ns2:sampleMethod xmlns:ns2=\"http://webservice/\">"+ "<arg0>"+
		 * "<name>" +temp.getName()+" PROXY CONTENT</name>"+
		 * "<no>"+temp.getNo()+"</no>"+
		 * "<salary>"+temp.getSalary()+" PROXY CONTENT</salary>"+ "</arg0>"+
		 * "</ns2:sampleMethod>"+ "</soap:Body>"+ "</soap:Envelope>";
		 */System.out.println("LINE NO 5");

		// String SOAPContent =
		// "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"+
		// "<soap:Body>" + "<ns2:invokeMe xmlns:ns2=\"http://webservice/\">" +
		// "<arg0>" + exchange.getIn().getBody(String.class) +
		// " SIMPLE CONTENT EXTRA</arg0></ns2:invokeMe></soap:Body></soap:Envelope>";

		InvokeMe invokeMe = new InvokeMe();
		System.out.println("LINE NO 6");

		// invokeMe.setArg0("AS DF AS DF");
		System.out.println("LINE NO 7");

		// exchange.getOut().setBody(invokeMe);
		System.out.println("LINE NO 8");

		// RequestData requestData1 = new RequestData();

		// msgList.add(requestData1);

		RequestDataResponse requestDataResponse = new RequestDataResponse();

		requestDataResponse.setStatus(true);
		requestDataResponse.setReply(exchange.getIn().getBody(String.class)
				+ " RESPONSE FROM REMOTE");

		// requestDataResponse

		exchange.getOut().setBody(new Object[] { requestDataResponse });

		// System.out.println(exchange.getIn().getBody());

		exchange.getIn().setHeader("operationName", "sampleMethod");
		exchange.getOut().setHeader("operationName", "sampleMethod");
		exchange.getIn().setHeader("operationNamespace", "http://webservice/");

		System.out.println("LINE NO 9");

	}
}