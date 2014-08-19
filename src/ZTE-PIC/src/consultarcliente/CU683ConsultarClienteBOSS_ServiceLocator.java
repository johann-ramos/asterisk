/**
 * CU683ConsultarClienteBOSS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package consultarcliente;

public class CU683ConsultarClienteBOSS_ServiceLocator extends org.apache.axis.client.Service implements consultarcliente.CU683ConsultarClienteBOSS_Service {

    public CU683ConsultarClienteBOSS_ServiceLocator() {
    }


    public CU683ConsultarClienteBOSS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CU683ConsultarClienteBOSS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CU683ConsultarClienteBOSS
    private java.lang.String CU683ConsultarClienteBOSS_address = "http://picqa03.cantv.com.ve:8801/mule/services/CU683ConsultarClienteBOSS";

    public java.lang.String getCU683ConsultarClienteBOSSAddress() {
        return CU683ConsultarClienteBOSS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CU683ConsultarClienteBOSSWSDDServiceName = "CU683ConsultarClienteBOSS";

    public java.lang.String getCU683ConsultarClienteBOSSWSDDServiceName() {
        return CU683ConsultarClienteBOSSWSDDServiceName;
    }

    public void setCU683ConsultarClienteBOSSWSDDServiceName(java.lang.String name) {
        CU683ConsultarClienteBOSSWSDDServiceName = name;
    }

    public consultarcliente.CU683ConsultarClienteBOSS_PortType getCU683ConsultarClienteBOSS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CU683ConsultarClienteBOSS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCU683ConsultarClienteBOSS(endpoint);
    }

    public consultarcliente.CU683ConsultarClienteBOSS_PortType getCU683ConsultarClienteBOSS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            consultarcliente.CU683ConsultarClienteBOSSSoapBindingStub _stub = new consultarcliente.CU683ConsultarClienteBOSSSoapBindingStub(portAddress, this);
            _stub.setPortName(getCU683ConsultarClienteBOSSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCU683ConsultarClienteBOSSEndpointAddress(java.lang.String address) {
        CU683ConsultarClienteBOSS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (consultarcliente.CU683ConsultarClienteBOSS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                consultarcliente.CU683ConsultarClienteBOSSSoapBindingStub _stub = new consultarcliente.CU683ConsultarClienteBOSSSoapBindingStub(new java.net.URL(CU683ConsultarClienteBOSS_address), this);
                _stub.setPortName(getCU683ConsultarClienteBOSSWSDDServiceName());
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
        if ("CU683ConsultarClienteBOSS".equals(inputPortName)) {
            return getCU683ConsultarClienteBOSS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://consultarcliente", "CU683ConsultarClienteBOSS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://consultarcliente", "CU683ConsultarClienteBOSS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CU683ConsultarClienteBOSS".equals(portName)) {
            setCU683ConsultarClienteBOSSEndpointAddress(address);
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
