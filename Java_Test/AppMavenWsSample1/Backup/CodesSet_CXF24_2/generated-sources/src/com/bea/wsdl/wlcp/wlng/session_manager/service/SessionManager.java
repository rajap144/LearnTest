package com.bea.wsdl.wlcp.wlng.session_manager.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.4
 * 2011-11-10T10:21:49.540+08:00
 * Generated source version: 2.4.4
 * 
 */
@WebService(targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", name = "SessionManager")
@XmlSeeAlso({ObjectFactory.class})
public interface SessionManager {

    @RequestWrapper(localName = "changeApplicationPassword", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.ChangeApplicationPassword")
    @WebMethod
    @ResponseWrapper(localName = "changeApplicationPasswordResponse", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.ChangeApplicationPasswordResponse")
    public void changeApplicationPassword(
        @WebParam(name = "sessionId", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String sessionId,
        @WebParam(name = "oldPassword", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String oldPassword,
        @WebParam(name = "newPassword", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String newPassword
    ) throws GeneralException;

    @WebResult(name = "getSessionReturn", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
    @RequestWrapper(localName = "getSession", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.GetSession")
    @WebMethod
    @ResponseWrapper(localName = "getSessionResponse", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.GetSessionResponse")
    public java.lang.String getSession() throws GeneralException;

    @WebResult(name = "refreshSessionReturn", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
    @RequestWrapper(localName = "refreshSession", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.RefreshSession")
    @WebMethod
    @ResponseWrapper(localName = "refreshSessionResponse", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.RefreshSessionResponse")
    public java.lang.String refreshSession(
        @WebParam(name = "sessionId", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String sessionId
    ) throws GeneralException;

    @WebResult(name = "getSessionRemainingLifeTimeReturn", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
    @RequestWrapper(localName = "getSessionRemainingLifeTime", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.GetSessionRemainingLifeTime")
    @WebMethod
    @ResponseWrapper(localName = "getSessionRemainingLifeTimeResponse", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.GetSessionRemainingLifeTimeResponse")
    public int getSessionRemainingLifeTime(
        @WebParam(name = "sessionId", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String sessionId
    ) throws GeneralException;

    @WebResult(name = "destroySessionReturn", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
    @RequestWrapper(localName = "destroySession", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.DestroySession")
    @WebMethod
    @ResponseWrapper(localName = "destroySessionResponse", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service", className = "com.bea.wsdl.wlcp.wlng.session_manager.service.DestroySessionResponse")
    public boolean destroySession(
        @WebParam(name = "sessionId", targetNamespace = "http://www.bea.com/wsdl/wlcp/wlng/session_manager/service")
        java.lang.String sessionId
    ) throws GeneralException;
}