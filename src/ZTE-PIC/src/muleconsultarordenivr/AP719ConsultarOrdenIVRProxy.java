package muleconsultarordenivr;

public class AP719ConsultarOrdenIVRProxy implements muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType {
  private String _endpoint = null;
  private muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType aP719ConsultarOrdenIVR_PortType = null;
  
  public AP719ConsultarOrdenIVRProxy() {
    _initAP719ConsultarOrdenIVRProxy();
  }
  
  public AP719ConsultarOrdenIVRProxy(String endpoint) {
    _endpoint = endpoint;
    _initAP719ConsultarOrdenIVRProxy();
  }
  
  private void _initAP719ConsultarOrdenIVRProxy() {
    try {
      aP719ConsultarOrdenIVR_PortType = (new muleconsultarordenivr.AP719ConsultarOrdenIVR_ServiceLocator()).getAP719ConsultarOrdenIVR();
      if (aP719ConsultarOrdenIVR_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aP719ConsultarOrdenIVR_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aP719ConsultarOrdenIVR_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aP719ConsultarOrdenIVR_PortType != null)
      ((javax.xml.rpc.Stub)aP719ConsultarOrdenIVR_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType getAP719ConsultarOrdenIVR_PortType() {
    if (aP719ConsultarOrdenIVR_PortType == null)
      _initAP719ConsultarOrdenIVRProxy();
    return aP719ConsultarOrdenIVR_PortType;
  }
  
  public canonicoconsultarordenivr.ConsultarOrdenIVRRP consultarOrdenIVR(muleconsultarordenivr.ConsultarOrdenIVRRQ in0) throws java.rmi.RemoteException{
    if (aP719ConsultarOrdenIVR_PortType == null)
      _initAP719ConsultarOrdenIVRProxy();
    return aP719ConsultarOrdenIVR_PortType.consultarOrdenIVR(in0);
  }
  
  
}