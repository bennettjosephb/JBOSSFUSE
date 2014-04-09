package example.wrapped.subtract;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-30T10:04:53.431+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://example/wrapped/subtract", name = "subtract")
@XmlSeeAlso({org.example.subtractresponse.ObjectFactory.class, org.example.subtract.ObjectFactory.class})
public interface Subtract {

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/subtractResponse")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://www.example.org/subtract", className = "org.example.subtract.Subtract")
    @WebMethod(action = "http://example/wrapped/subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://www.example.org/subtractResponse", className = "org.example.subtractresponse.SubtractResponse")
    public int subtract(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/subtract")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/subtract")
        int argumentTwo
    );
}
