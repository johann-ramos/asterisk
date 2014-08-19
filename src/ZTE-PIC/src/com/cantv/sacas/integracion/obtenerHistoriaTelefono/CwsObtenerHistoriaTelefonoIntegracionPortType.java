package com.cantv.sacas.integracion.obtenerHistoriaTelefono;

public interface CwsObtenerHistoriaTelefonoIntegracionPortType extends java.rmi.Remote{
	public com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP[] obtenerHistoriaTelefono(com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRQ obtenerHistoriaTelefonoRQ) throws java.rmi.RemoteException;
}
