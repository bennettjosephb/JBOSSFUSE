package webservice;

import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice/", endpointInterface = "webservice.MultiArgumentServiceInterface", portName = "MultiArgumentServiceImplPort", serviceName = "MultiArgumentServiceImplService")
public class MultiArgumentServiceImpl implements MultiArgumentServiceInterface {

	public ResponseBean multiArgumentMethod(List<RequestBean> requestBeanList) {

		ResponseBean responseBean = new ResponseBean();

		for (Iterator iterator = requestBeanList.iterator(); iterator.hasNext();) {
			RequestBean requestBean = (RequestBean) iterator.next();

			// responseBean.
		}

		return responseBean;

	}

}
