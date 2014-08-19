package consultarcliente;

public class CU683ConsultarClienteBOSSProxy implements consultarcliente.CU683ConsultarClienteBOSS_PortType {
  private String _endpoint = null;
  private consultarcliente.CU683ConsultarClienteBOSS_PortType cU683ConsultarClienteBOSS_PortType = null;
  
  public CU683ConsultarClienteBOSSProxy() {
    _initCU683ConsultarClienteBOSSProxy();
  }
  
  public CU683ConsultarClienteBOSSProxy(String endpoint) {
    _endpoint = endpoint;
    _initCU683ConsultarClienteBOSSProxy();
  }
  
  private void _initCU683ConsultarClienteBOSSProxy() {
    try {
      cU683ConsultarClienteBOSS_PortType = (new consultarcliente.CU683ConsultarClienteBOSS_ServiceLocator()).getCU683ConsultarClienteBOSS();
      if (cU683ConsultarClienteBOSS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cU683ConsultarClienteBOSS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cU683ConsultarClienteBOSS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cU683ConsultarClienteBOSS_PortType != null)
      ((javax.xml.rpc.Stub)cU683ConsultarClienteBOSS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public consultarcliente.CU683ConsultarClienteBOSS_PortType getCU683ConsultarClienteBOSS_PortType() {
    if (cU683ConsultarClienteBOSS_PortType == null)
      _initCU683ConsultarClienteBOSSProxy();
    return cU683ConsultarClienteBOSS_PortType;
  }
  
  public void setLog(boolean in0) throws java.rmi.RemoteException{
    if (cU683ConsultarClienteBOSS_PortType == null)
      _initCU683ConsultarClienteBOSSProxy();
    cU683ConsultarClienteBOSS_PortType.setLog(in0);
  }
  
  public void resetStatistics() throws java.rmi.RemoteException{
    if (cU683ConsultarClienteBOSS_PortType == null)
      _initCU683ConsultarClienteBOSSProxy();
    cU683ConsultarClienteBOSS_PortType.resetStatistics();
  }
  
  public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException{
    if (cU683ConsultarClienteBOSS_PortType == null)
      _initCU683ConsultarClienteBOSSProxy();
    return cU683ConsultarClienteBOSS_PortType.getInfo();
  }
  
  public consultarcliente.ConsultarClienteRP consultarCliente(consultarcliente.ConsultarClienteRQ in0) throws java.rmi.RemoteException{
    if (cU683ConsultarClienteBOSS_PortType == null)
      _initCU683ConsultarClienteBOSSProxy();
    return cU683ConsultarClienteBOSS_PortType.consultarCliente(in0);
  }
  
  
}