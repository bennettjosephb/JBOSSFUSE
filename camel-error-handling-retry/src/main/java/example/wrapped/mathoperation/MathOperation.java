package example.wrapped.mathoperation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T14:17:22.323+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://example/wrapped/mathoperation", name = "mathOperation")
@XmlSeeAlso({org.example.multiply.ObjectFactory.class, org.example.addlistresponse.ObjectFactory.class, ObjectFactory.class, org.example.subtractresponse.ObjectFactory.class, org.example.divide.ObjectFactory.class, org.example.add.ObjectFactory.class, org.example.multiplyresponse.ObjectFactory.class, org.example.addlist.ObjectFactory.class, org.example.divideresponse.ObjectFactory.class, org.example.subtract.ObjectFactory.class, org.example.addresponse.ObjectFactory.class})
public interface MathOperation {

    @WebResult(name = "sum", targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.subtract.Subtract")
    @WebMethod
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.subtractresponse.SubtractResponse")
    public int subtract(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/subtract")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/subtract")
        int argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/addResponse")
    @RequestWrapper(localName = "add", targetNamespace = "http://www.example.org/add", className = "org.example.add.Add")
    @WebMethod(action = "http://example/wrapped/mathoperation")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://www.example.org/addResponse", className = "org.example.addresponse.AddResponse")
    public java.lang.Integer add(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/add")
        java.lang.Integer argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/add")
        java.lang.Integer argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.multiply.Multiply")
    @WebMethod
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.multiplyresponse.MultiplyResponse")
    public int multiply(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/multiply")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/multiply")
        int argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.divide.Divide")
    @WebMethod
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://example/wrapped/mathoperation", className = "org.example.divideresponse.DivideResponse")
    public int divide(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/divide")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/divide")
        int argumentTwo
    );
}
