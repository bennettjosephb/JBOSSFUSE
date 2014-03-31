
package example.wrapped.mathoperation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.example.divide.Divide;
import org.example.divideresponse.DivideResponse;
import org.example.multiply.Multiply;
import org.example.multiplyresponse.MultiplyResponse;
import org.example.subtract.Subtract;
import org.example.subtractresponse.SubtractResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example.wrapped.mathoperation package. 
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

    private final static QName _DivideResponse_QNAME = new QName("http://example/wrapped/mathoperation", "divideResponse");
    private final static QName _Subtract_QNAME = new QName("http://example/wrapped/mathoperation", "subtract");
    private final static QName _Divide_QNAME = new QName("http://example/wrapped/mathoperation", "divide");
    private final static QName _Multiply_QNAME = new QName("http://example/wrapped/mathoperation", "multiply");
    private final static QName _SubtractResponse_QNAME = new QName("http://example/wrapped/mathoperation", "subtractResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://example/wrapped/mathoperation", "multiplyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example.wrapped.mathoperation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/wrapped/mathoperation", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

}
