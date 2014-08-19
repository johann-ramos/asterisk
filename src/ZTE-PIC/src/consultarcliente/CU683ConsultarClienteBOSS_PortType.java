/**
 * CU683ConsultarClienteBOSS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package consultarcliente;

public interface CU683ConsultarClienteBOSS_PortType extends java.rmi.Remote {
    public void setLog(boolean in0) throws java.rmi.RemoteException;
    public void resetStatistics() throws java.rmi.RemoteException;
    public UtilsClass.ServiceControlReturn getInfo() throws java.rmi.RemoteException;
    public consultarcliente.ConsultarClienteRP consultarCliente(consultarcliente.ConsultarClienteRQ in0) throws java.rmi.RemoteException;
}
