package webservice;

public class Main {

	public static void main(String[] args) {

		// WebserviceClassService webserviceClassService = new
		// WebserviceClassService();
		//
		// ServiceInterface webserviceClass = webserviceClassService
		// .getWebserviceClassPort();
		//
		// System.out.println(webserviceClass.invokeMe("Hello"));

		ComplexServiceImplService complexServiceImplService = new ComplexServiceImplService();

		ComplexService complexService = complexServiceImplService
				.getComplexServiceImplPort();

		RequestData requestData = new RequestData();

		requestData.setName("SAMPLE NAME dasdasdad");
		requestData.setNo(123);
		requestData.setSalary("NO SALARY");

		webservice.RequestDataResponse requestDataResponse = complexService
				.sampleMethod(requestData);

		System.out.println(requestDataResponse.getReply());
		System.out.println(requestDataResponse.isStatus());

	}
}
