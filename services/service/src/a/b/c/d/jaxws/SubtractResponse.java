
package a.b.c.d.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.8
 * Mon Mar 31 14:50:15 EST 2014
 * Generated source version: 2.7.8
 */

@XmlRootElement(name = "subtractResponse", namespace = "http://d.c.b.a/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtractResponse", namespace = "http://d.c.b.a/")

public class SubtractResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

