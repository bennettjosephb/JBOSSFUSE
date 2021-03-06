package org.example.aggregate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T15:36:38.508+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebService(targetNamespace = "http://www.example.org/aggregate/", name = "aggregate")
@XmlSeeAlso({org.example.multiply.ObjectFactory.class, org.example.addlistresponse.ObjectFactory.class, org.example.subtractresponse.ObjectFactory.class, org.example.divide.ObjectFactory.class, org.example.add.ObjectFactory.class, org.example.multiplyresponse.ObjectFactory.class, org.example.addlist.ObjectFactory.class, org.example.divideresponse.ObjectFactory.class, org.example.subtract.ObjectFactory.class, org.example.addresponse.ObjectFactory.class})
public interface Aggregate {

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/addResponse")
    @RequestWrapper(localName = "add", targetNamespace = "http://www.example.org/add", className = "org.example.add.Add")
    @WebMethod(action = "http://www.example.org/aggregate/add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://www.example.org/addResponse", className = "org.example.addresponse.AddResponse")
    public java.lang.Integer add(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/add")
        java.lang.Integer argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/add")
        java.lang.Integer argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/subtractResponse")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://www.example.org/subtract", className = "org.example.subtract.Subtract")
    @WebMethod(action = "http://www.example.org/aggregate/subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://www.example.org/subtractResponse", className = "org.example.subtractresponse.SubtractResponse")
    public int subtract(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/subtract")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/subtract")
        int argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/multiplyResponse")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://www.example.org/multiply", className = "org.example.multiply.Multiply")
    @WebMethod(action = "http://www.example.org/aggregate/multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://www.example.org/multiplyResponse", className = "org.example.multiplyresponse.MultiplyResponse")
    public int multiply(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/multiply")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/multiply")
        int argumentTwo
    );

    @WebResult(name = "sum", targetNamespace = "http://www.example.org/divideResponse")
    @RequestWrapper(localName = "divide", targetNamespace = "http://www.example.org/divide", className = "org.example.divide.Divide")
    @WebMethod(action = "http://www.example.org/aggregate/divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://www.example.org/divideResponse", className = "org.example.divideresponse.DivideResponse")
    public int divide(
        @WebParam(name = "argumentOne", targetNamespace = "http://www.example.org/divide")
        int argumentOne,
        @WebParam(name = "argumentTwo", targetNamespace = "http://www.example.org/divide")
        int argumentTwo
    );
}
