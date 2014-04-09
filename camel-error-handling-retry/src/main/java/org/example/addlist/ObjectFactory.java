
package org.example.addlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.addlist package. 
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

    private final static QName _AddList_QNAME = new QName("http://www.example.org/addList", "addList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.addlist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddList }
     * 
     */
    public AddList createAddList() {
        return new AddList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/addList", name = "addList")
    public JAXBElement<AddList> createAddList(AddList value) {
        return new JAXBElement<AddList>(_AddList_QNAME, AddList.class, null, value);
    }

}
