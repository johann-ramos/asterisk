package com.cantv.sacas.integracion.obtenerHistoriaTelefono;

public class CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy implements com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType {
  private String _endpoint = null;
  private com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType cwsObtenerHistoriaTelefonoIntegracionPortType = null;
  
  public CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy() {
    _initCwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
  }
  
  public CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
  }
  
  private void _initCwsObtenerHistoriaTelefonoIntegracionPortTypeProxy() {
    try {
      cwsObtenerHistoriaTelefonoIntegracionPortType = (new com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionLocator()).getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint();
      if (cwsObtenerHistoriaTelefonoIntegracionPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cwsObtenerHistoriaTelefonoIntegracionPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cwsObtenerHistoriaTelefonoIntegracionPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cwsObtenerHistoriaTelefonoIntegracionPortType != null)
      ((javax.xml.rpc.Stub)cwsObtenerHistoriaTelefonoIntegracionPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType getCwsObtenerHistoriaTelefonoIntegracionPortType() {
    if (cwsObtenerHistoriaTelefonoIntegracionPortType == null)
      _initCwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
    return cwsObtenerHistoriaTelefonoIntegracionPortType;
  }
  
  public com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP[] obtenerHistoriaTelefono(com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRQ obtenerHistoriaTelefonoRQ) throws java.rmi.RemoteException{
    if (cwsObtenerHistoriaTelefonoIntegracionPortType == null)
      _initCwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
    return cwsObtenerHistoriaTelefonoIntegracionPortType.obtenerHistoriaTelefono(obtenerHistoriaTelefonoRQ);
  }
  
  
}