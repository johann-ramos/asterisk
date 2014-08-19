/**
 * Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NAP_Asc_obtenerSaldoCuenta;

public class Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator extends org.apache.axis.client.Service implements NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaService {

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator() {
    }


    public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Serviciof2v5_NAP_Asc_obtenerSaldoCuenta
    private java.lang.String Serviciof2v5_NAP_Asc_obtenerSaldoCuenta_address = "http://picprod.cantv.com.ve:8080/axis/services/Serviciof2v5_NAP_Asc_obtenerSaldoCuenta";

    public java.lang.String getServiciof2v5_NAP_Asc_obtenerSaldoCuentaAddress() {
        return Serviciof2v5_NAP_Asc_obtenerSaldoCuenta_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Serviciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName = "Serviciof2v5_NAP_Asc_obtenerSaldoCuenta";

    public java.lang.String getServiciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName() {
        return Serviciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName;
    }

    public void setServiciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName(java.lang.String name) {
        Serviciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName = name;
    }

    public NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta getServiciof2v5_NAP_Asc_obtenerSaldoCuenta() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Serviciof2v5_NAP_Asc_obtenerSaldoCuenta_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiciof2v5_NAP_Asc_obtenerSaldoCuenta(endpoint);
    }

    public NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta getServiciof2v5_NAP_Asc_obtenerSaldoCuenta(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaSoapBindingStub _stub = new NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiciof2v5_NAP_Asc_obtenerSaldoCuentaEndpointAddress(java.lang.String address) {
        Serviciof2v5_NAP_Asc_obtenerSaldoCuenta_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta.class.isAssignableFrom(serviceEndpointInterface)) {
                NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaSoapBindingStub _stub = new NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaSoapBindingStub(new java.net.URL(Serviciof2v5_NAP_Asc_obtenerSaldoCuenta_address), this);
                _stub.setPortName(getServiciof2v5_NAP_Asc_obtenerSaldoCuentaWSDDServiceName());
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
        if ("Serviciof2v5_NAP_Asc_obtenerSaldoCuenta".equals(inputPortName)) {
            return getServiciof2v5_NAP_Asc_obtenerSaldoCuenta();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://NAP_Asc_obtenerSaldoCuenta", "Serviciof2v5_NAP_Asc_obtenerSaldoCuentaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://NAP_Asc_obtenerSaldoCuenta", "Serviciof2v5_NAP_Asc_obtenerSaldoCuenta"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Serviciof2v5_NAP_Asc_obtenerSaldoCuenta".equals(portName)) {
            setServiciof2v5_NAP_Asc_obtenerSaldoCuentaEndpointAddress(address);
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
