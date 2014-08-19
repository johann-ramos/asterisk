package ObtenerTipoTarifa_pkg;

public class LP502ObtenerTipoTarifaProxy implements ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa {
  private String _endpoint = null;
  private ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa lP502ObtenerTipoTarifa = null;
  
  public LP502ObtenerTipoTarifaProxy() {
    _initLP502ObtenerTipoTarifaProxy();
  }
  
  public LP502ObtenerTipoTarifaProxy(String endpoint) {
    _endpoint = endpoint;
    _initLP502ObtenerTipoTarifaProxy();
  }
  
  private void _initLP502ObtenerTipoTarifaProxy() {
    try {
      lP502ObtenerTipoTarifa = (new ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaServiceLocator()).getLP502ObtenerTipoTarifa();
      if (lP502ObtenerTipoTarifa != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lP502ObtenerTipoTarifa)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lP502ObtenerTipoTarifa)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lP502ObtenerTipoTarifa != null)
      ((javax.xml.rpc.Stub)lP502ObtenerTipoTarifa)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa getLP502ObtenerTipoTarifa() {
    if (lP502ObtenerTipoTarifa == null)
      _initLP502ObtenerTipoTarifaProxy();
    return lP502ObtenerTipoTarifa;
  }
  
  public void setLog(boolean in0) throws java.rmi.RemoteException{
    if (lP502ObtenerTipoTarifa == null)
      _initLP502ObtenerTipoTarifaProxy();
    lP502ObtenerTipoTarifa.setLog(in0);
  }
  
  public void resetStatistics() throws java.rmi.RemoteException{
    if (lP502ObtenerTipoTarifa == null)
      _initLP502ObtenerTipoTarifaProxy();
    lP502ObtenerTipoTarifa.resetStatistics();
  }
  
  public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException{
    if (lP502ObtenerTipoTarifa == null)
      _initLP502ObtenerTipoTarifaProxy();
    return lP502ObtenerTipoTarifa.getInfo();
  }
  
  public ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP obtenerTipoTarifa(ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRQ in0) throws java.rmi.RemoteException, cantv.arquitectura.asc.contratos.exceptions.SystemException, cantv.arquitectura.asc.contratos.exceptions.ApplicationException{
    if (lP502ObtenerTipoTarifa == null)
      _initLP502ObtenerTipoTarifaProxy();
    return lP502ObtenerTipoTarifa.obtenerTipoTarifa(in0);
  }
  
  
}