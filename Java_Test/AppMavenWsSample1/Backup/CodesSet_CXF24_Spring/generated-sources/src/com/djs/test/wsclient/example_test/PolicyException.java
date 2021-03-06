
package com.djs.learn.wsclient.example_test;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.4
 * 2011-11-10T14:19:42.960+08:00
 * Generated source version: 2.4.4
 */

@WebFault(name = "PolicyException", targetNamespace = "http://www.csapi.org/schema/parlayx/common/v2_1")
public class PolicyException extends Exception {
    
    private org.csapi.schema.parlayx.common.v2_1.PolicyException policyException;

    public PolicyException() {
        super();
    }
    
    public PolicyException(String message) {
        super(message);
    }
    
    public PolicyException(String message, Throwable cause) {
        super(message, cause);
    }

    public PolicyException(String message, org.csapi.schema.parlayx.common.v2_1.PolicyException policyException) {
        super(message);
        this.policyException = policyException;
    }

    public PolicyException(String message, org.csapi.schema.parlayx.common.v2_1.PolicyException policyException, Throwable cause) {
        super(message, cause);
        this.policyException = policyException;
    }

    public org.csapi.schema.parlayx.common.v2_1.PolicyException getFaultInfo() {
        return this.policyException;
    }
}
