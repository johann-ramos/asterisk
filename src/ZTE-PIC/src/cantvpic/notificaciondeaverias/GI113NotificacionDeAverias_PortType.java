/**
 * GI113NotificacionDeAverias_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cantvpic.notificaciondeaverias;

public interface GI113NotificacionDeAverias_PortType extends java.rmi.Remote {
    public void setLog(boolean in0) throws java.rmi.RemoteException;
    public void resetStatistics() throws java.rmi.RemoteException;
    public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException;
    public cantvpic.notificaciondeaverias.NotificacionDeAveriaRP notificacionDeAveria(cantvpic.notificaciondeaverias.NotificacionDeAveriaRQ in0) throws java.rmi.RemoteException;
}
