/**
 * LP502ObtenerTipoTarifaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObtenerTipoTarifa_pkg;

public class LP502ObtenerTipoTarifaServiceLocator extends org.apache.axis.client.Service implements ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaService {

    public LP502ObtenerTipoTarifaServiceLocator() {
    }


    public LP502ObtenerTipoTarifaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LP502ObtenerTipoTarifaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LP502ObtenerTipoTarifa
    private java.lang.String LP502ObtenerTipoTarifa_address = "http://picpw05.cantv.com.ve:8800/mule/services/LP502ObtenerTipoTarifa";

    public java.lang.String getLP502ObtenerTipoTarifaAddress() {
        return LP502ObtenerTipoTarifa_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LP502ObtenerTipoTarifaWSDDServiceName = "LP502ObtenerTipoTarifa";

    public java.lang.String getLP502ObtenerTipoTarifaWSDDServiceName() {
        return LP502ObtenerTipoTarifaWSDDServiceName;
    }

    public void setLP502ObtenerTipoTarifaWSDDServiceName(java.lang.String name) {
        LP502ObtenerTipoTarifaWSDDServiceName = name;
    }

    public ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa getLP502ObtenerTipoTarifa() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LP502ObtenerTipoTarifa_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLP502ObtenerTipoTarifa(endpoint);
    }

    public ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa getLP502ObtenerTipoTarifa(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaSoapBindingStub _stub = new ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaSoapBindingStub(portAddress, this);
            _stub.setPortName(getLP502ObtenerTipoTarifaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLP502ObtenerTipoTarifaEndpointAddress(java.lang.String address) {
        LP502ObtenerTipoTarifa_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifa.class.isAssignableFrom(serviceEndpointInterface)) {
                ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaSoapBindingStub _stub = new ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaSoapBindingStub(new java.net.URL(LP502ObtenerTipoTarifa_address), this);
                _stub.setPortName(getLP502ObtenerTipoTarifaWSDDServiceName());
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
        if ("LP502ObtenerTipoTarifa".equals(inputPortName)) {
            return getLP502ObtenerTipoTarifa();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "LP502ObtenerTipoTarifaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "LP502ObtenerTipoTarifa"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LP502ObtenerTipoTarifa".equals(portName)) {
            setLP502ObtenerTipoTarifaEndpointAddress(address);
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
