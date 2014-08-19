package cantvpic.notificaciondeaverias;

public class GI113NotificacionDeAveriasProxy implements cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType {
  private String _endpoint = null;
  private cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType gI113NotificacionDeAverias_PortType = null;
  
  public GI113NotificacionDeAveriasProxy() {
    _initGI113NotificacionDeAveriasProxy();
  }
  
  public GI113NotificacionDeAveriasProxy(String endpoint) {
    _endpoint = endpoint;
    _initGI113NotificacionDeAveriasProxy();
  }
  
  private void _initGI113NotificacionDeAveriasProxy() {
    try {
      gI113NotificacionDeAverias_PortType = (new cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_ServiceLocator()).getGI113NotificacionDeAverias();
      if (gI113NotificacionDeAverias_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gI113NotificacionDeAverias_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gI113NotificacionDeAverias_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gI113NotificacionDeAverias_PortType != null)
      ((javax.xml.rpc.Stub)gI113NotificacionDeAverias_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType getGI113NotificacionDeAverias_PortType() {
    if (gI113NotificacionDeAverias_PortType == null)
      _initGI113NotificacionDeAveriasProxy();
    return gI113NotificacionDeAverias_PortType;
  }
  
  public void setLog(boolean in0) throws java.rmi.RemoteException{
    if (gI113NotificacionDeAverias_PortType == null)
      _initGI113NotificacionDeAveriasProxy();
    gI113NotificacionDeAverias_PortType.setLog(in0);
  }
  
  public void resetStatistics() throws java.rmi.RemoteException{
    if (gI113NotificacionDeAverias_PortType == null)
      _initGI113NotificacionDeAveriasProxy();
    gI113NotificacionDeAverias_PortType.resetStatistics();
  }
  
  public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException{
    if (gI113NotificacionDeAverias_PortType == null)
      _initGI113NotificacionDeAveriasProxy();
    return gI113NotificacionDeAverias_PortType.getInfo();
  }
  
  public cantvpic.notificaciondeaverias.NotificacionDeAveriaRP notificacionDeAveria(cantvpic.notificaciondeaverias.NotificacionDeAveriaRQ in0) throws java.rmi.RemoteException{
    if (gI113NotificacionDeAverias_PortType == null)
      _initGI113NotificacionDeAveriasProxy();
    return gI113NotificacionDeAverias_PortType.notificacionDeAveria(in0);
  }
  
  
}