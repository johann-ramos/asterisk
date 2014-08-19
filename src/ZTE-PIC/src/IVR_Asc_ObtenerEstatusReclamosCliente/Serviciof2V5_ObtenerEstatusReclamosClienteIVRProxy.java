package IVR_Asc_ObtenerEstatusReclamosCliente;

public class Serviciof2V5_ObtenerEstatusReclamosClienteIVRProxy implements IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR {
  private String _endpoint = null;
  private IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR serviciof2V5_ObtenerEstatusReclamosClienteIVR = null;
  
  public Serviciof2V5_ObtenerEstatusReclamosClienteIVRProxy() {
    _initServiciof2V5_ObtenerEstatusReclamosClienteIVRProxy();
  }
  
  public Serviciof2V5_ObtenerEstatusReclamosClienteIVRProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiciof2V5_ObtenerEstatusReclamosClienteIVRProxy();
  }
  
  private void _initServiciof2V5_ObtenerEstatusReclamosClienteIVRProxy() {
    try {
      serviciof2V5_ObtenerEstatusReclamosClienteIVR = (new IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator()).getServiciof2V5_ObtenerEstatusReclamosClienteIVR();
      if (serviciof2V5_ObtenerEstatusReclamosClienteIVR != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviciof2V5_ObtenerEstatusReclamosClienteIVR)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviciof2V5_ObtenerEstatusReclamosClienteIVR)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviciof2V5_ObtenerEstatusReclamosClienteIVR != null)
      ((javax.xml.rpc.Stub)serviciof2V5_ObtenerEstatusReclamosClienteIVR)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR getServiciof2V5_ObtenerEstatusReclamosClienteIVR() {
    if (serviciof2V5_ObtenerEstatusReclamosClienteIVR == null)
      _initServiciof2V5_ObtenerEstatusReclamosClienteIVRProxy();
    return serviciof2V5_ObtenerEstatusReclamosClienteIVR;
  }
  
  public IVR_Asc_ObtenerEstatusReclamosCliente.F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP serviciof2V5_IVR_Asc_ObtenerEstatusReclamosCliente(IVR_Asc_ObtenerEstatusReclamosCliente.F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ parametro) throws java.rmi.RemoteException, cantv.arquitectura.asc.contratos.exceptions.SystemException, cantv.arquitectura.asc.contratos.exceptions.ApplicationException{
    if (serviciof2V5_ObtenerEstatusReclamosClienteIVR == null)
      _initServiciof2V5_ObtenerEstatusReclamosClienteIVRProxy();
    return serviciof2V5_ObtenerEstatusReclamosClienteIVR.serviciof2V5_IVR_Asc_ObtenerEstatusReclamosCliente(parametro);
  }
  
  
}