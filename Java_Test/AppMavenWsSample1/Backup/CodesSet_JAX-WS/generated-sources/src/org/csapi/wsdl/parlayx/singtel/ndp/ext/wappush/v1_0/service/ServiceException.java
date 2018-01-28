
package org.csapi.wsdl.parlayx.singtel.ndp.ext.wappush.v1_0.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ServiceException", targetNamespace = "http://www.csapi.org/schema/parlayx/common/v2_1")
public class ServiceException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private org.csapi.schema.parlayx.common.v2_1.ServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ServiceException(String message, org.csapi.schema.parlayx.common.v2_1.ServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceException(String message, org.csapi.schema.parlayx.common.v2_1.ServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.csapi.schema.parlayx.common.v2_1.ServiceException
     */
    public org.csapi.schema.parlayx.common.v2_1.ServiceException getFaultInfo() {
        return faultInfo;
    }

}