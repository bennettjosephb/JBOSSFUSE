
package org.example.aggregate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.example.add.Add;
import org.example.addlist.AddList;
import org.example.addlistresponse.AddListResponse;
import org.example.addresponse.AddResponse;
import org.example.divide.Divide;
import org.example.divideresponse.DivideResponse;
import org.example.multiply.Multiply;
import org.example.multiplyresponse.MultiplyResponse;
import org.example.subtract.Subtract;
import org.example.subtractresponse.SubtractResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.aggregate package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://www.example.org/aggregate/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://www.example.org/aggregate/", "multiplyResponse");
    private final static QName _Divide_QNAME = new QName("http://www.example.org/aggregate/", "divide");
    private final static QName _Multiply_QNAME = new QName("http://www.example.org/aggregate/", "multiply");
    private final static QName _Add_QNAME = new QName("http://www.example.org/aggregate/", "add");
    private final static QName _SubtractResponse_QNAME = new QName("http://www.example.org/aggregate/", "subtractResponse");
    private final static QName _Subtract_QNAME = new QName("http://www.example.org/aggregate/", "subtract");
    private final static QName _DivideResponse_QNAME = new QName("http://www.example.org/aggregate/", "divideResponse");
    private final static QName _AddList_QNAME = new QName("http://www.example.org/aggregate/", "addList");
    private final static QName _AddListResponse_QNAME = new QName("http://www.example.org/aggregate/", "addListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.aggregate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "addList")
    public JAXBElement<AddList> createAddList(AddList value) {
        return new JAXBElement<AddList>(_AddList_QNAME, AddList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/aggregate/", name = "addListResponse")
    public JAXBElement<AddListResponse> createAddListResponse(AddListResponse value) {
        return new JAXBElement<AddListResponse>(_AddListResponse_QNAME, AddListResponse.class, null, value);
    }

}
