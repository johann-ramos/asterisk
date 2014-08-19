/**
 * LP502ObtenerTipoTarifa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObtenerTipoTarifa_pkg;

public interface LP502ObtenerTipoTarifa extends java.rmi.Remote {
    public void setLog(boolean in0) throws java.rmi.RemoteException;
    public void resetStatistics() throws java.rmi.RemoteException;
    public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException;
    public ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP obtenerTipoTarifa(ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRQ in0) throws java.rmi.RemoteException, cantv.arquitectura.asc.contratos.exceptions.SystemException, cantv.arquitectura.asc.contratos.exceptions.ApplicationException;
}
