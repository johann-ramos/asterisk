/**
 * Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package IVR_Asc_ObtenerEstatusReclamosCliente;

public class Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator extends org.apache.axis.client.Service implements IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRService {

    public Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator() {
    }


    public Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Serviciof2V5_ObtenerEstatusReclamosClienteIVRServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Serviciof2V5_ObtenerEstatusReclamosClienteIVR
    private java.lang.String Serviciof2V5_ObtenerEstatusReclamosClienteIVR_address = "http://picprod.cantv.com.ve:8080/axis/services/Serviciof2V5_ObtenerEstatusReclamosClienteIVR";

    public java.lang.String getServiciof2V5_ObtenerEstatusReclamosClienteIVRAddress() {
        return Serviciof2V5_ObtenerEstatusReclamosClienteIVR_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Serviciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName = "Serviciof2V5_ObtenerEstatusReclamosClienteIVR";

    public java.lang.String getServiciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName() {
        return Serviciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName;
    }

    public void setServiciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName(java.lang.String name) {
        Serviciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName = name;
    }

    public IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR getServiciof2V5_ObtenerEstatusReclamosClienteIVR() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Serviciof2V5_ObtenerEstatusReclamosClienteIVR_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiciof2V5_ObtenerEstatusReclamosClienteIVR(endpoint);
    }

    public IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR getServiciof2V5_ObtenerEstatusReclamosClienteIVR(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRSoapBindingStub _stub = new IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiciof2V5_ObtenerEstatusReclamosClienteIVREndpointAddress(java.lang.String address) {
        Serviciof2V5_ObtenerEstatusReclamosClienteIVR_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVR.class.isAssignableFrom(serviceEndpointInterface)) {
                IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRSoapBindingStub _stub = new IVR_Asc_ObtenerEstatusReclamosCliente.Serviciof2V5_ObtenerEstatusReclamosClienteIVRSoapBindingStub(new java.net.URL(Serviciof2V5_ObtenerEstatusReclamosClienteIVR_address), this);
                _stub.setPortName(getServiciof2V5_ObtenerEstatusReclamosClienteIVRWSDDServiceName());
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
        if ("Serviciof2V5_ObtenerEstatusReclamosClienteIVR".equals(inputPortName)) {
            return getServiciof2V5_ObtenerEstatusReclamosClienteIVR();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://IVR_Asc_ObtenerEstatusReclamosCliente", "Serviciof2V5_ObtenerEstatusReclamosClienteIVRService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://IVR_Asc_ObtenerEstatusReclamosCliente", "Serviciof2V5_ObtenerEstatusReclamosClienteIVR"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Serviciof2V5_ObtenerEstatusReclamosClienteIVR".equals(portName)) {
            setServiciof2V5_ObtenerEstatusReclamosClienteIVREndpointAddress(address);
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
