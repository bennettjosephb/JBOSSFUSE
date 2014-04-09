package example.wrapped.multiply;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-30T10:05:01.876+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://example/wrapped/multiply", name = "multiply")
@XmlSeeAlso({org.example.multiply.ObjectFactory.class, org.example.multiplyresponse.ObjectFactory.class})
public interface Multiply {

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/multiplyResponse")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://www.example.org/multiply", className = "org.example.multiply.Multiply")
    @WebMethod(action = "http://example/wrapped/multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://www.example.org/multiplyResponse", className = "org.example.multiplyresponse.MultiplyResponse")
    public int multiply(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/multiply")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/multiply")
        int argumentTwo
    );
}
