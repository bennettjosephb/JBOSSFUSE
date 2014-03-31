
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvokeMe_QNAME = new QName("http://webservice/", "invokeMe");
    private final static QName _SampleMethod_QNAME = new QName("http://webservice/", "sampleMethod");
    private final static QName _SampleMethodResponse_QNAME = new QName("http://webservice/", "sampleMethodResponse");
    private final static QName _InvokeMeResponse_QNAME = new QName("http://webservice/", "invokeMeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SampleMethod }
     * 
     */
    public SampleMethod createSampleMethod() {
        return new SampleMethod();
    }

    /**
     * Create an instance of {@link InvokeMe }
     * 
     */
    public InvokeMe createInvokeMe() {
        return new InvokeMe();
    }

    /**
     * Create an instance of {@link InvokeMeResponse }
     * 
     */
    public InvokeMeResponse createInvokeMeResponse() {
        return new InvokeMeResponse();
    }

    /**
     * Create an instance of {@link SampleMethodResponse }
     * 
     */
    public SampleMethodResponse createSampleMethodResponse() {
        return new SampleMethodResponse();
    }

    /**
     * Create an instance of {@link RequestDataResponse }
     * 
     */
    public RequestDataResponse createRequestDataResponse() {
        return new RequestDataResponse();
    }

    /**
     * Create an instance of {@link RequestData }
     * 
     */
    public RequestData createRequestData() {
        return new RequestData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeMe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "invokeMe")
    public JAXBElement<InvokeMe> createInvokeMe(InvokeMe value) {
        return new JAXBElement<InvokeMe>(_InvokeMe_QNAME, InvokeMe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sampleMethod")
    public JAXBElement<SampleMethod> createSampleMethod(SampleMethod value) {
        return new JAXBElement<SampleMethod>(_SampleMethod_QNAME, SampleMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "sampleMethodResponse")
    public JAXBElement<SampleMethodResponse> createSampleMethodResponse(SampleMethodResponse value) {
        return new JAXBElement<SampleMethodResponse>(_SampleMethodResponse_QNAME, SampleMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeMeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "invokeMeResponse")
    public JAXBElement<InvokeMeResponse> createInvokeMeResponse(InvokeMeResponse value) {
        return new JAXBElement<InvokeMeResponse>(_InvokeMeResponse_QNAME, InvokeMeResponse.class, null, value);
    }

}
