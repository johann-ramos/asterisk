/**
 * CwsObtenerHistoriaTelefonoIntegracionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cantv.sacas.integracion.obtenerHistoriaTelefono;

public class CwsObtenerHistoriaTelefonoIntegracionLocator extends org.apache.axis.client.Service implements com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracion {

    public CwsObtenerHistoriaTelefonoIntegracionLocator() {
    }


    public CwsObtenerHistoriaTelefonoIntegracionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CwsObtenerHistoriaTelefonoIntegracionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint
    private java.lang.String CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint_address = "http://10.1.189.230:8919/mule/services/GI005ObtenerHistoriaTelefonoIntegracion";

    public java.lang.String getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointAddress() {
        return CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName = "CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint";

    public java.lang.String getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName() {
        return CwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName;
    }

    public void setCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        CwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint(endpoint);
    }

    public com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionSoap11BindingStub _stub = new com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionSoap11BindingStub(portAddress, this);
            _stub.setPortName(getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionSoap11BindingStub _stub = new com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionSoap11BindingStub(new java.net.URL(CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint_address), this);
                _stub.setPortName(getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint".equals(inputPortName)) {
            return getCwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com", "CwsObtenerHistoriaTelefonoIntegracion");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com", "CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CwsObtenerHistoriaTelefonoIntegracionHttpSoap11Endpoint".equals(portName)) {
            setCwsObtenerHistoriaTelefonoIntegracionHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
