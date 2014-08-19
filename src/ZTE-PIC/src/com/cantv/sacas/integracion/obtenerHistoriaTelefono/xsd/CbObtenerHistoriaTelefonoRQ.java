/**
 * CbObtenerHistoriaTelefonoRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd;

public class CbObtenerHistoriaTelefonoRQ  implements java.io.Serializable {
    private java.lang.String aplicativo;

    private java.lang.String estatusIncidente;

    private java.lang.String telefono;

    private java.lang.String tipoServicio;

    private java.lang.String usuario;

    public CbObtenerHistoriaTelefonoRQ() {
    }

    public CbObtenerHistoriaTelefonoRQ(
           java.lang.String aplicativo,
           java.lang.String estatusIncidente,
           java.lang.String telefono,
           java.lang.String tipoServicio,
           java.lang.String usuario) {
           this.aplicativo = aplicativo;
           this.estatusIncidente = estatusIncidente;
           this.telefono = telefono;
           this.tipoServicio = tipoServicio;
           this.usuario = usuario;
    }


    /**
     * Gets the aplicativo value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @return aplicativo
     */
    public java.lang.String getAplicativo() {
        return aplicativo;
    }


    /**
     * Sets the aplicativo value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @param aplicativo
     */
    public void setAplicativo(java.lang.String aplicativo) {
        this.aplicativo = aplicativo;
    }


    /**
     * Gets the estatusIncidente value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @return estatusIncidente
     */
    public java.lang.String getEstatusIncidente() {
        return estatusIncidente;
    }


    /**
     * Sets the estatusIncidente value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @param estatusIncidente
     */
    public void setEstatusIncidente(java.lang.String estatusIncidente) {
        this.estatusIncidente = estatusIncidente;
    }


    /**
     * Gets the telefono value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the tipoServicio value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @return tipoServicio
     */
    public java.lang.String getTipoServicio() {
        return tipoServicio;
    }


    /**
     * Sets the tipoServicio value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @param tipoServicio
     */
    public void setTipoServicio(java.lang.String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }


    /**
     * Gets the usuario value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this CbObtenerHistoriaTelefonoRQ.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CbObtenerHistoriaTelefonoRQ)) return false;
        CbObtenerHistoriaTelefonoRQ other = (CbObtenerHistoriaTelefonoRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aplicativo==null && other.getAplicativo()==null) || 
             (this.aplicativo!=null &&
              this.aplicativo.equals(other.getAplicativo()))) &&
            ((this.estatusIncidente==null && other.getEstatusIncidente()==null) || 
             (this.estatusIncidente!=null &&
              this.estatusIncidente.equals(other.getEstatusIncidente()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.tipoServicio==null && other.getTipoServicio()==null) || 
             (this.tipoServicio!=null &&
              this.tipoServicio.equals(other.getTipoServicio()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAplicativo() != null) {
            _hashCode += getAplicativo().hashCode();
        }
        if (getEstatusIncidente() != null) {
            _hashCode += getEstatusIncidente().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getTipoServicio() != null) {
            _hashCode += getTipoServicio().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CbObtenerHistoriaTelefonoRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "CbObtenerHistoriaTelefonoRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aplicativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "aplicativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusIncidente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "estatusIncidente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "tipoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
