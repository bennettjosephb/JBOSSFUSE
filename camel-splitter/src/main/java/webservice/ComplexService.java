package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-28T12:09:43.191+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://webservice/", name = "ComplexService")
@XmlSeeAlso({ObjectFactory.class})
public interface ComplexService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sampleMethod", targetNamespace = "http://webservice/", className = "webservice.SampleMethod")
    @WebMethod(action = "urn:SampleMethod")
    @ResponseWrapper(localName = "sampleMethodResponse", targetNamespace = "http://webservice/", className = "webservice.SampleMethodResponse")
    public webservice.RequestDataResponse sampleMethod(
        @WebParam(name = "arg0", targetNamespace = "")
        webservice.RequestData arg0
    );
}
