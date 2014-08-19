/**
 * Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package obtenerMovimientosCent;

public class Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator extends org.apache.axis.client.Service implements obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientosService {

    public Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator() {
    }


    public Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Serviciof2V5_IVR_Asc_obtenerMovimientosServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PG558_obtenerMovimientosII
    private java.lang.String PG558_obtenerMovimientosII_address = "http://picprod.cantv.com.ve:8080/axis/services/PG558_obtenerMovimientosII";

    public java.lang.String getPG558_obtenerMovimientosIIAddress() {
        return PG558_obtenerMovimientosII_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PG558_obtenerMovimientosIIWSDDServiceName = "PG558_obtenerMovimientosII";

    public java.lang.String getPG558_obtenerMovimientosIIWSDDServiceName() {
        return PG558_obtenerMovimientosIIWSDDServiceName;
    }

    public void setPG558_obtenerMovimientosIIWSDDServiceName(java.lang.String name) {
        PG558_obtenerMovimientosIIWSDDServiceName = name;
    }

    public obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos getPG558_obtenerMovimientosII() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PG558_obtenerMovimientosII_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPG558_obtenerMovimientosII(endpoint);
    }

    public obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos getPG558_obtenerMovimientosII(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            obtenerMovimientosCent.PG558_obtenerMovimientosIISoapBindingStub _stub = new obtenerMovimientosCent.PG558_obtenerMovimientosIISoapBindingStub(portAddress, this);
            _stub.setPortName(getPG558_obtenerMovimientosIIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPG558_obtenerMovimientosIIEndpointAddress(java.lang.String address) {
        PG558_obtenerMovimientosII_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (obtenerMovimientosCent.Serviciof2V5_IVR_Asc_obtenerMovimientos.class.isAssignableFrom(serviceEndpointInterface)) {
                obtenerMovimientosCent.PG558_obtenerMovimientosIISoapBindingStub _stub = new obtenerMovimientosCent.PG558_obtenerMovimientosIISoapBindingStub(new java.net.URL(PG558_obtenerMovimientosII_address), this);
                _stub.setPortName(getPG558_obtenerMovimientosIIWSDDServiceName());
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
        if ("PG558_obtenerMovimientosII".equals(inputPortName)) {
            return getPG558_obtenerMovimientosII();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://obtenerMovimientosCent", "Serviciof2V5_IVR_Asc_obtenerMovimientosService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://obtenerMovimientosCent", "PG558_obtenerMovimientosII"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PG558_obtenerMovimientosII".equals(portName)) {
            setPG558_obtenerMovimientosIIEndpointAddress(address);
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
