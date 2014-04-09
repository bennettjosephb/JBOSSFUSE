package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "SplitService", targetNamespace = "http://webservice/")
public interface SplitService {

	@WebMethod(operationName = "splitService", action = "urn:SplitService")
	@RequestWrapper(className = "webservice.jaxws.SplitService", localName = "splitService", targetNamespace = "http://webservice/")
	@ResponseWrapper(className = "webservice.jaxws.SplitServiceResponse", localName = "splitServiceResponse", targetNamespace = "http://webservice/")
	@WebResult(name = "return")
	public ResponseBean splitService(@WebParam(name = "arg0") RequestBean requestBean);

}