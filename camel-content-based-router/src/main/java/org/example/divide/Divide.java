
package org.example.divide;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divide complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divide">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="argumentOne" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="argumentTwo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divide", propOrder = {
    "argumentOne",
    "argumentTwo"
})
public class Divide {

    protected int argumentOne;
    protected int argumentTwo;

    /**
     * Gets the value of the argumentOne property.
     * 
     */
    public int getArgumentOne() {
        return argumentOne;
    }

    /**
     * Sets the value of the argumentOne property.
     * 
     */
    public void setArgumentOne(int value) {
        this.argumentOne = value;
    }

    /**
     * Gets the value of the argumentTwo property.
     * 
     */
    public int getArgumentTwo() {
        return argumentTwo;
    }

    /**
     * Sets the value of the argumentTwo property.
     * 
     */
    public void setArgumentTwo(int value) {
        this.argumentTwo = value;
    }

}
