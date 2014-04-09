package example.wrapped.addlist;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-30T20:23:41.633+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://example/wrapped/addList", name = "addList")
@XmlSeeAlso({org.example.addlistresponse.ObjectFactory.class, org.example.addlist.ObjectFactory.class})
public interface AddList {

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/addListResponse")
    @RequestWrapper(localName = "addList", targetNamespace = "http://www.example.org/addList", className = "org.example.addlist.AddList")
    @WebMethod(action = "http://example/wrapped/addList")
    @ResponseWrapper(localName = "addListResponse", targetNamespace = "http://www.example.org/addListResponse", className = "org.example.addlistresponse.AddListResponse")
    public java.lang.Integer addList(
        @WebParam(name = "arguments", targetNamespace = "http://www.example.org/addList")
        java.util.List<java.lang.Integer> arguments
    );
}
