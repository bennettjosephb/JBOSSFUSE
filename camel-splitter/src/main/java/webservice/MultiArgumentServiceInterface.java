package webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "MultiArgumentServiceInterface", targetNamespace = "http://webservice/")
public interface MultiArgumentServiceInterface {

	@WebMethod(operationName = "multiArgumentMethod", action = "urn:MultiArgumentMethod")
	@RequestWrapper(className = "webservice.jaxws.MultiArgumentMethod", localName = "multiArgumentMethod", targetNamespace = "http://webservice/")
	@ResponseWrapper(className = "webservice.jaxws.MultiArgumentMethodResponse", localName = "multiArgumentMethodResponse", targetNamespace = "http://webservice/")
	@WebResult(name = "return")
	public ResponseBean multiArgumentMethod(@WebParam(name = "arg0") List<RequestBean> requestBeanList);

}