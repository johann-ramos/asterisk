package NAP_Asc_obtenerSaldoCuenta;

public class Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy implements NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta {
  private String _endpoint = null;
  private NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta serviciof2V5_NAP_Asc_obtenerSaldoCuenta = null;
  
  public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy() {
    _initServiciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
  }
  
  public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
  }
  
  private void _initServiciof2V5_NAP_Asc_obtenerSaldoCuentaProxy() {
    try {
      serviciof2V5_NAP_Asc_obtenerSaldoCuenta = (new NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator()).getServiciof2v5_NAP_Asc_obtenerSaldoCuenta();
      if (serviciof2V5_NAP_Asc_obtenerSaldoCuenta != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviciof2V5_NAP_Asc_obtenerSaldoCuenta)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviciof2V5_NAP_Asc_obtenerSaldoCuenta)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviciof2V5_NAP_Asc_obtenerSaldoCuenta != null)
      ((javax.xml.rpc.Stub)serviciof2V5_NAP_Asc_obtenerSaldoCuenta)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta getServiciof2V5_NAP_Asc_obtenerSaldoCuenta() {
    if (serviciof2V5_NAP_Asc_obtenerSaldoCuenta == null)
      _initServiciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
    return serviciof2V5_NAP_Asc_obtenerSaldoCuenta;
  }
  
  public NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse serviciof2V5_NAP_Asc_obtenerSaldoCuenta(NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element parameter) throws java.rmi.RemoteException{
    if (serviciof2V5_NAP_Asc_obtenerSaldoCuenta == null)
      _initServiciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
    return serviciof2V5_NAP_Asc_obtenerSaldoCuenta.serviciof2V5_NAP_Asc_obtenerSaldoCuenta(parameter);
  }
  
  
}