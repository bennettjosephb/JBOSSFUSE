package webservice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice/", endpointInterface = "webservice.ComplexService", portName = "ComplexServiceImplPort", serviceName = "ComplexServiceImplService")
public class ComplexServiceImpl implements ComplexService {

	public RequestDataResponse sampleMethod(RequestData requestData) {

		System.out.println(requestData.getName());

		System.out.println(requestData.getSalary());

		System.out.println(requestData.getNo());

		System.out.println(requestData);

		RequestDataResponse requestDataResponse = new RequestDataResponse();

		requestDataResponse.setReply("THIS IS SUCCESS CALL");

		requestDataResponse.setStatus(true);

		return requestDataResponse;

	}

}
