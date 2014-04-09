package a.b.c.d;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

@WebService(name = "MathInterface", targetNamespace = "http://d.c.b.a/")
public interface MathInterface {

	@WebMethod(operationName = "addList", action = "urn:AddList")
	@RequestWrapper(className = "a.b.c.d.jaxws.AddList", localName = "addList", targetNamespace = "http://d.c.b.a/")
	public java.lang.Integer addList(@WebParam(name = "arg0") java.util.List<java.lang.Integer> arguments);

	@WebMethod(operationName = "add", action = "urn:Add")
	@RequestWrapper(className = "a.b.c.d.jaxws.Add", localName = "add", targetNamespace = "http://d.c.b.a/")
	public java.lang.Integer add(@WebParam(name = "arg0") java.lang.Integer argumentOne,
			@WebParam(name = "arg1") java.lang.Integer argumentTwo);

	@WebMethod(operationName = "subtract", action = "urn:Subtract")
	@RequestWrapper(className = "a.b.c.d.jaxws.Subtract", localName = "subtract", targetNamespace = "http://d.c.b.a/")
	public int subtract(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

	@WebMethod(operationName = "multiply", action = "urn:Multiply")
	@RequestWrapper(className = "a.b.c.d.jaxws.Multiply", localName = "multiply", targetNamespace = "http://d.c.b.a/")
	public int multiply(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

	@WebMethod(operationName = "divide", action = "urn:Divide")
	@RequestWrapper(className = "a.b.c.d.jaxws.Divide", localName = "divide", targetNamespace = "http://d.c.b.a/")
	public int divide(@WebParam(name = "arg0") int argumentOne, @WebParam(name = "arg1") int argumentTwo);

}