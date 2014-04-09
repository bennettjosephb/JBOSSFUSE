package webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "SplitListService", targetNamespace = "http://webservice/")
public interface SplitListService {

	@WebMethod(operationName = "splitList", action = "urn:SplitList")
	@RequestWrapper(className = "webservice.jaxws.SplitList", localName = "splitList", targetNamespace = "http://webservice/")
	@ResponseWrapper(className = "webservice.jaxws.SplitListResponse", localName = "splitListResponse", targetNamespace = "http://webservice/")
	@WebResult(name = "return")
	public List<ResponseBean> splitList(@WebParam(name = "arg0") List<RequestBean> requestBeanList);

}