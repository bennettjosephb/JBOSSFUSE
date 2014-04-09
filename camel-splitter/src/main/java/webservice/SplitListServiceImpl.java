package webservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice/", endpointInterface = "webservice.SplitListService", portName = "SplitListServiceImplPort", serviceName = "SplitListServiceImplService")
public class SplitListServiceImpl implements SplitListService {

	public List<ResponseBean> splitList(List<RequestBean> requestBeanList) {

		List<ResponseBean> list = new ArrayList<ResponseBean>();

		for (Iterator<RequestBean> iterator = requestBeanList.iterator(); iterator
				.hasNext();) {
			RequestBean requestBean = iterator.next();

			System.out.println(requestBean.getName());

			requestBean.setName(requestBean.getName() + "RESPONSE VALUE");

			ResponseBean responseBean = new ResponseBean();
			responseBean.setResponseValue(requestBean.getName());

			list.add(responseBean);

		}

		return list;

	}
}