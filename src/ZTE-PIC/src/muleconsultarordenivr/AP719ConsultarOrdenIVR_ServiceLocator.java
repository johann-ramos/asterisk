/**
 * AP719ConsultarOrdenIVR_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package muleconsultarordenivr;

public class AP719ConsultarOrdenIVR_ServiceLocator extends org.apache.axis.client.Service implements muleconsultarordenivr.AP719ConsultarOrdenIVR_Service {

    public AP719ConsultarOrdenIVR_ServiceLocator() {
    }


    public AP719ConsultarOrdenIVR_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AP719ConsultarOrdenIVR_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AP719ConsultarOrdenIVR
    private java.lang.String AP719ConsultarOrdenIVR_address = "http://picqa03.cantv.com.ve:8801/mule/services/AP719ConsultarOrdenIVR";

    public java.lang.String getAP719ConsultarOrdenIVRAddress() {
        return AP719ConsultarOrdenIVR_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AP719ConsultarOrdenIVRWSDDServiceName = "AP719ConsultarOrdenIVR";

    public java.lang.String getAP719ConsultarOrdenIVRWSDDServiceName() {
        return AP719ConsultarOrdenIVRWSDDServiceName;
    }

    public void setAP719ConsultarOrdenIVRWSDDServiceName(java.lang.String name) {
        AP719ConsultarOrdenIVRWSDDServiceName = name;
    }

    public muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType getAP719ConsultarOrdenIVR() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AP719ConsultarOrdenIVR_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAP719ConsultarOrdenIVR(endpoint);
    }

    public muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType getAP719ConsultarOrdenIVR(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            muleconsultarordenivr.AP719ConsultarOrdenIVRSoapBindingStub _stub = new muleconsultarordenivr.AP719ConsultarOrdenIVRSoapBindingStub(portAddress, this);
            _stub.setPortName(getAP719ConsultarOrdenIVRWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAP719ConsultarOrdenIVREndpointAddress(java.lang.String address) {
        AP719ConsultarOrdenIVR_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (muleconsultarordenivr.AP719ConsultarOrdenIVR_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                muleconsultarordenivr.AP719ConsultarOrdenIVRSoapBindingStub _stub = new muleconsultarordenivr.AP719ConsultarOrdenIVRSoapBindingStub(new java.net.URL(AP719ConsultarOrdenIVR_address), this);
                _stub.setPortName(getAP719ConsultarOrdenIVRWSDDServiceName());
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
        if ("AP719ConsultarOrdenIVR".equals(inputPortName)) {
            return getAP719ConsultarOrdenIVR();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://muleconsultarordenivr", "AP719ConsultarOrdenIVR");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://muleconsultarordenivr", "AP719ConsultarOrdenIVR"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AP719ConsultarOrdenIVR".equals(portName)) {
            setAP719ConsultarOrdenIVREndpointAddress(address);
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
