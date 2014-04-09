package a.b.c.d;

import java.util.Iterator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://d.c.b.a/", endpointInterface = "a.b.c.d.MathInterface", portName = "MathOperationImplPort", serviceName = "MathOperationImplService")
public class MathOperationImpl implements MathInterface {

	public java.lang.Integer addList(java.util.List<java.lang.Integer> arguments) {
		int sum = 0;

		for (Iterator iterator = arguments.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();

			sum += integer;

		}

		return sum;
	}

	public java.lang.Integer add(java.lang.Integer argumentOne,
			java.lang.Integer argumentTwo) {
		return argumentOne + argumentTwo;
	}

	public int subtract(int argumentOne, int argumentTwo) {
		return argumentOne - argumentTwo;

	}

	public int multiply(int argumentOne, int argumentTwo) {
		return argumentOne * argumentTwo;

	}

	public int divide(int argumentOne, int argumentTwo) {
		return argumentOne / argumentTwo;

	}
}
