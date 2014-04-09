package webservice;

import javax.jws.WebService;


@WebService(targetNamespace = "http://webservice/", endpointInterface = "webservice.ServiceInterface", portName = "WebserviceClassPort", serviceName = "WebserviceClassService")
public class WebserviceClass implements ServiceInterface {

	public String invokeMe(String request) {

		System.out.println("Data RECEIVED ...." + request);

		return request + ": RESPONSE";

	}
}
