package obtenerMovimientosCent;

public class Serviciof2V5_IVR_Asc_obtenerMovimientosProxy implements obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos {
  private String _endpoint = null;
  private obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos serviciof2V5_IVR_Asc_obtenerMovimientos = null;
  
  public Serviciof2V5_IVR_Asc_obtenerMovimientosProxy() {
    _initServiciof2V5_IVR_Asc_obtenerMovimientosProxy();
  }
  
  public Serviciof2V5_IVR_Asc_obtenerMovimientosProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiciof2V5_IVR_Asc_obtenerMovimientosProxy();
  }
  
  private void _initServiciof2V5_IVR_Asc_obtenerMovimientosProxy() {
    try {
      serviciof2V5_IVR_Asc_obtenerMovimientos = (new obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator()).getPG558_obtenerMovimientosII();
      if (serviciof2V5_IVR_Asc_obtenerMovimientos != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviciof2V5_IVR_Asc_obtenerMovimientos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviciof2V5_IVR_Asc_obtenerMovimientos)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviciof2V5_IVR_Asc_obtenerMovimientos != null)
      ((javax.xml.rpc.Stub)serviciof2V5_IVR_Asc_obtenerMovimientos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos getServiciof2V5_IVR_Asc_obtenerMovimientos() {
    if (serviciof2V5_IVR_Asc_obtenerMovimientos == null)
      _initServiciof2V5_IVR_Asc_obtenerMovimientosProxy();
    return serviciof2V5_IVR_Asc_obtenerMovimientos;
  }
  
  public obtenerMovimientosCent.F2V5IVRAscObtenerMovimientosRP obtenerMovimientos(obtenerMovimientosCent.F2V5IVRAscObtenerMovimientosRQ parametro) throws java.rmi.RemoteException, cantv.arquitectura.asc.contratos.exceptions.SystemException, cantv.arquitectura.asc.contratos.exceptions.ApplicationException{
    if (serviciof2V5_IVR_Asc_obtenerMovimientos == null)
      _initServiciof2V5_IVR_Asc_obtenerMovimientosProxy();
    return serviciof2V5_IVR_Asc_obtenerMovimientos.obtenerMovimientos(parametro);
  }
  
  
}