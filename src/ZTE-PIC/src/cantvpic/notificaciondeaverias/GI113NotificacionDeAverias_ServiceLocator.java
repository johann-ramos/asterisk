/**
 * GI113NotificacionDeAverias_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cantvpic.notificaciondeaverias;

public class GI113NotificacionDeAverias_ServiceLocator extends org.apache.axis.client.Service implements cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_Service {

    public GI113NotificacionDeAverias_ServiceLocator() {
    }


    public GI113NotificacionDeAverias_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GI113NotificacionDeAverias_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GI113NotificacionDeAverias
    private java.lang.String GI113NotificacionDeAverias_address = "http://picqa02.cantv.com.ve:8801/mule/services/GI113NotificacionDeAverias";

    public java.lang.String getGI113NotificacionDeAveriasAddress() {
        return GI113NotificacionDeAverias_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GI113NotificacionDeAveriasWSDDServiceName = "GI113NotificacionDeAverias";

    public java.lang.String getGI113NotificacionDeAveriasWSDDServiceName() {
        return GI113NotificacionDeAveriasWSDDServiceName;
    }

    public void setGI113NotificacionDeAveriasWSDDServiceName(java.lang.String name) {
        GI113NotificacionDeAveriasWSDDServiceName = name;
    }

    public cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType getGI113NotificacionDeAverias() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GI113NotificacionDeAverias_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGI113NotificacionDeAverias(endpoint);
    }

    public cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType getGI113NotificacionDeAverias(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cantvpic.notificaciondeaverias.GI113NotificacionDeAveriasSoapBindingStub _stub = new cantvpic.notificaciondeaverias.GI113NotificacionDeAveriasSoapBindingStub(portAddress, this);
            _stub.setPortName(getGI113NotificacionDeAveriasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGI113NotificacionDeAveriasEndpointAddress(java.lang.String address) {
        GI113NotificacionDeAverias_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cantvpic.notificaciondeaverias.GI113NotificacionDeAverias_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cantvpic.notificaciondeaverias.GI113NotificacionDeAveriasSoapBindingStub _stub = new cantvpic.notificaciondeaverias.GI113NotificacionDeAveriasSoapBindingStub(new java.net.URL(GI113NotificacionDeAverias_address), this);
                _stub.setPortName(getGI113NotificacionDeAveriasWSDDServiceName());
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
        if ("GI113NotificacionDeAverias".equals(inputPortName)) {
            return getGI113NotificacionDeAverias();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "GI113NotificacionDeAverias");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "GI113NotificacionDeAverias"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GI113NotificacionDeAverias".equals(portName)) {
            setGI113NotificacionDeAveriasEndpointAddress(address);
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
