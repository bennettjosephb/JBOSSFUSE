package org.example.aggregate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T15:36:38.581+11:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "aggregate", 
                  wsdlLocation = "file:/D:/PFG_Applications/IDE/workspace-gwtp-old/service/WebContent/wsdl/aggregate.wsdl",
                  targetNamespace = "http://www.example.org/aggregate/") 
public class Aggregate_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/aggregate/", "aggregate");
    public final static QName AggregateSOAP = new QName("http://www.example.org/aggregate/", "aggregateSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/PFG_Applications/IDE/workspace-gwtp-old/service/WebContent/wsdl/aggregate.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Aggregate_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/PFG_Applications/IDE/workspace-gwtp-old/service/WebContent/wsdl/aggregate.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Aggregate_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Aggregate_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Aggregate_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Aggregate_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Aggregate_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Aggregate_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Aggregate
     */
    @WebEndpoint(name = "aggregateSOAP")
    public Aggregate getAggregateSOAP() {
        return super.getPort(AggregateSOAP, Aggregate.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Aggregate
     */
    @WebEndpoint(name = "aggregateSOAP")
    public Aggregate getAggregateSOAP(WebServiceFeature... features) {
        return super.getPort(AggregateSOAP, Aggregate.class, features);
    }

}
