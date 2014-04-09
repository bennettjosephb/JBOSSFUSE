package org.example.aggregate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "MathOperationInterface", targetNamespace = "http://aggregate.example.org/")
public interface MathOperationInterface {

	@WebMethod(operationName = "addList", action = "urn:AddList")
	@RequestWrapper(className = "org.example.aggregate.jaxws.AddList", localName = "addList", targetNamespace = "http://aggregate.example.org/")
	public java.lang.Integer addList(@WebParam(name = "arg0") java.util.List<java.lang.Integer> arguments);

	@WebMethod(operationName = "add", action = "urn:Add")
	@RequestWrapper(className = "org.example.aggregate.jaxws.Add", localName = "add", targetNamespace = "http://aggregate.example.org/")
	public java.lang.Integer add(@WebParam(name = "arg0") java.lang.Integer argumentOne,
			@WebParam(name = "arg1") java.lang.Integer argumentTwo);

	@WebMethod(operationName = "subtract", action = "urn:Subtract")
	@RequestWrapper(className = "org.example.aggregate.jaxws.Subtract", localName = "subtract", targetNamespace = "http://aggregate.example.org/")
	public int subtract(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

	@WebMethod(operationName = "multiply", action = "urn:Multiply")
	@RequestWrapper(className = "org.example.aggregate.jaxws.Multiply", localName = "multiply", targetNamespace = "http://aggregate.example.org/")
	public int multiply(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

	@WebMethod(operationName = "divide", action = "urn:Divide")
	@RequestWrapper(className = "org.example.aggregate.jaxws.Divide", localName = "divide", targetNamespace = "http://aggregate.example.org/")
	public int divide(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

}