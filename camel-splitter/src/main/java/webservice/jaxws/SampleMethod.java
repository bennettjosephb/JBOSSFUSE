
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.8
 * Fri Mar 28 09:11:38 EST 2014
 * Generated source version: 2.7.8
 */

@XmlRootElement(name = "sampleMethod", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sampleMethod", namespace = "http://webservice/")

public class SampleMethod {

    @XmlElement(name = "arg0")
    private webservice.RequestData arg0;

    public webservice.RequestData getArg0() {
        return this.arg0;
    }

    public void setArg0(webservice.RequestData newArg0)  {
        this.arg0 = newArg0;
    }

}

