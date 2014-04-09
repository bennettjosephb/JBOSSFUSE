
package org.example.addlistresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.addlistresponse package. 
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

    private final static QName _AddListResponse_QNAME = new QName("http://www.example.org/addListResponse", "addListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.addlistresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddListResponse }
     * 
     */
    public AddListResponse createAddListResponse() {
        return new AddListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/addListResponse", name = "addListResponse")
    public JAXBElement<AddListResponse> createAddListResponse(AddListResponse value) {
        return new JAXBElement<AddListResponse>(_AddListResponse_QNAME, AddListResponse.class, null, value);
    }

}
