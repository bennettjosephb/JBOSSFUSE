
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package webservice;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-03-28T09:11:38.492+11:00
 * Generated source version: 2.7.8
 * 
 */
public class ComplexServiceClient {

    public static void main(String[] args) throws Exception {
        QName serviceName = new QName("http://webservice/", "ComplexServiceImplService");
        QName portName = new QName("http://webservice/", "ComplexServiceImplPort");

        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
                        "http://localhost:9090/ComplexServiceImplPort"); 
        webservice.ComplexService client = service.getPort(portName,  webservice.ComplexService.class);
        
        // Insert code to invoke methods on the client here
    }

}