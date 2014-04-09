package webservice;

import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice/", endpointInterface = "webservice.SplitService", portName = "SplitServiceImplPort", serviceName = "SplitServiceImplService")
public class SplitServiceImpl implements SplitService {

	public ResponseBean splitService(RequestBean requestBean) {
		ResponseBean responseBean = new ResponseBean();

		System.out.println("ASDF ASDF" );

		// List<RequestBean> list = responseBean.getList();
		//
		// for (Iterator<RequestBean> iterator = list.iterator(); iterator
		// .hasNext();) {
		// RequestBean object = iterator.next();
		//
		// object.setName(object.getName() + "GOT DATA ");
		//
		// System.out.println(object.getName());
		//
		// responseBean.getList().add(requestBean);
		//
		// }

		return responseBean;
	}

}
