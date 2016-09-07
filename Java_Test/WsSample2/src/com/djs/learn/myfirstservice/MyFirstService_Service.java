package com.djs.learn.myfirstservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-08-26T23:17:24.579+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "MyFirstService", 
                  wsdlLocation = "http://www.example.org/MySecondService?wsdl",
                  targetNamespace = "http://www.example.org/MyServices/") 
public class MyFirstService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/MyServices/", "MyFirstService");
    public final static QName MyFirstService2SOAP = new QName("http://www.example.org/MyServices/", "MyFirstService2SOAP");
    public final static QName MyFirstServiceSOAP = new QName("http://www.example.org/MyServices/", "MyFirstServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://www.example.org/MySecondService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MyFirstService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.example.org/MySecondService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MyFirstService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MyFirstService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyFirstService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns MyFirstService2
     */
    @WebEndpoint(name = "MyFirstService2SOAP")
    public MyFirstService2 getMyFirstService2SOAP() {
        return super.getPort(MyFirstService2SOAP, MyFirstService2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyFirstService2
     */
    @WebEndpoint(name = "MyFirstService2SOAP")
    public MyFirstService2 getMyFirstService2SOAP(WebServiceFeature... features) {
        return super.getPort(MyFirstService2SOAP, MyFirstService2.class, features);
    }
    /**
     *
     * @return
     *     returns MyFirstService
     */
    @WebEndpoint(name = "MyFirstServiceSOAP")
    public MyFirstService getMyFirstServiceSOAP() {
        return super.getPort(MyFirstServiceSOAP, MyFirstService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyFirstService
     */
    @WebEndpoint(name = "MyFirstServiceSOAP")
    public MyFirstService getMyFirstServiceSOAP(WebServiceFeature... features) {
        return super.getPort(MyFirstServiceSOAP, MyFirstService.class, features);
    }

}