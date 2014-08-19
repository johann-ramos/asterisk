/**
 * CbObtenerHistoriaTelefonoRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd;

public class CbObtenerHistoriaTelefonoRP  implements java.io.Serializable {
    private java.lang.String codigoError;

    private java.lang.String estatus;

    private java.lang.String fechaCancelacion;

    private java.lang.String fechaReporte;

    private java.lang.String horaCancelacion;

    private java.lang.String horaReporte;

    private java.lang.String mensajeError;

    private java.lang.String numeroIncidente;

    private java.lang.String tipoServicio;

    public CbObtenerHistoriaTelefonoRP() {
    }

    public CbObtenerHistoriaTelefonoRP(
           java.lang.String codigoError,
           java.lang.String estatus,
           java.lang.String fechaCancelacion,
           java.lang.String fechaReporte,
           java.lang.String horaCancelacion,
           java.lang.String horaReporte,
           java.lang.String mensajeError,
           java.lang.String numeroIncidente,
           java.lang.String tipoServicio) {
           this.codigoError = codigoError;
           this.estatus = estatus;
           this.fechaCancelacion = fechaCancelacion;
           this.fechaReporte = fechaReporte;
           this.horaCancelacion = horaCancelacion;
           this.horaReporte = horaReporte;
           this.mensajeError = mensajeError;
           this.numeroIncidente = numeroIncidente;
           this.tipoServicio = tipoServicio;
    }


    /**
     * Gets the codigoError value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return codigoError
     */
    public java.lang.String getCodigoError() {
        return codigoError;
    }


    /**
     * Sets the codigoError value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param codigoError
     */
    public void setCodigoError(java.lang.String codigoError) {
        this.codigoError = codigoError;
    }


    /**
     * Gets the estatus value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return estatus
     */
    public java.lang.String getEstatus() {
        return estatus;
    }


    /**
     * Sets the estatus value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param estatus
     */
    public void setEstatus(java.lang.String estatus) {
        this.estatus = estatus;
    }


    /**
     * Gets the fechaCancelacion value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return fechaCancelacion
     */
    public java.lang.String getFechaCancelacion() {
        return fechaCancelacion;
    }


    /**
     * Sets the fechaCancelacion value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param fechaCancelacion
     */
    public void setFechaCancelacion(java.lang.String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }


    /**
     * Gets the fechaReporte value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return fechaReporte
     */
    public java.lang.String getFechaReporte() {
        return fechaReporte;
    }


    /**
     * Sets the fechaReporte value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param fechaReporte
     */
    public void setFechaReporte(java.lang.String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }


    /**
     * Gets the horaCancelacion value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return horaCancelacion
     */
    public java.lang.String getHoraCancelacion() {
        return horaCancelacion;
    }


    /**
     * Sets the horaCancelacion value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param horaCancelacion
     */
    public void setHoraCancelacion(java.lang.String horaCancelacion) {
        this.horaCancelacion = horaCancelacion;
    }


    /**
     * Gets the horaReporte value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return horaReporte
     */
    public java.lang.String getHoraReporte() {
        return horaReporte;
    }


    /**
     * Sets the horaReporte value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param horaReporte
     */
    public void setHoraReporte(java.lang.String horaReporte) {
        this.horaReporte = horaReporte;
    }


    /**
     * Gets the mensajeError value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return mensajeError
     */
    public java.lang.String getMensajeError() {
        return mensajeError;
    }


    /**
     * Sets the mensajeError value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param mensajeError
     */
    public void setMensajeError(java.lang.String mensajeError) {
        this.mensajeError = mensajeError;
    }


    /**
     * Gets the numeroIncidente value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return numeroIncidente
     */
    public java.lang.String getNumeroIncidente() {
        return numeroIncidente;
    }


    /**
     * Sets the numeroIncidente value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param numeroIncidente
     */
    public void setNumeroIncidente(java.lang.String numeroIncidente) {
        this.numeroIncidente = numeroIncidente;
    }


    /**
     * Gets the tipoServicio value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @return tipoServicio
     */
    public java.lang.String getTipoServicio() {
        return tipoServicio;
    }


    /**
     * Sets the tipoServicio value for this CbObtenerHistoriaTelefonoRP.
     * 
     * @param tipoServicio
     */
    public void setTipoServicio(java.lang.String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CbObtenerHistoriaTelefonoRP)) return false;
        CbObtenerHistoriaTelefonoRP other = (CbObtenerHistoriaTelefonoRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoError==null && other.getCodigoError()==null) || 
             (this.codigoError!=null &&
              this.codigoError.equals(other.getCodigoError()))) &&
            ((this.estatus==null && other.getEstatus()==null) || 
             (this.estatus!=null &&
              this.estatus.equals(other.getEstatus()))) &&
            ((this.fechaCancelacion==null && other.getFechaCancelacion()==null) || 
             (this.fechaCancelacion!=null &&
              this.fechaCancelacion.equals(other.getFechaCancelacion()))) &&
            ((this.fechaReporte==null && other.getFechaReporte()==null) || 
             (this.fechaReporte!=null &&
              this.fechaReporte.equals(other.getFechaReporte()))) &&
            ((this.horaCancelacion==null && other.getHoraCancelacion()==null) || 
             (this.horaCancelacion!=null &&
              this.horaCancelacion.equals(other.getHoraCancelacion()))) &&
            ((this.horaReporte==null && other.getHoraReporte()==null) || 
             (this.horaReporte!=null &&
              this.horaReporte.equals(other.getHoraReporte()))) &&
            ((this.mensajeError==null && other.getMensajeError()==null) || 
             (this.mensajeError!=null &&
              this.mensajeError.equals(other.getMensajeError()))) &&
            ((this.numeroIncidente==null && other.getNumeroIncidente()==null) || 
             (this.numeroIncidente!=null &&
              this.numeroIncidente.equals(other.getNumeroIncidente()))) &&
            ((this.tipoServicio==null && other.getTipoServicio()==null) || 
             (this.tipoServicio!=null &&
              this.tipoServicio.equals(other.getTipoServicio())));
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
        if (getCodigoError() != null) {
            _hashCode += getCodigoError().hashCode();
        }
        if (getEstatus() != null) {
            _hashCode += getEstatus().hashCode();
        }
        if (getFechaCancelacion() != null) {
            _hashCode += getFechaCancelacion().hashCode();
        }
        if (getFechaReporte() != null) {
            _hashCode += getFechaReporte().hashCode();
        }
        if (getHoraCancelacion() != null) {
            _hashCode += getHoraCancelacion().hashCode();
        }
        if (getHoraReporte() != null) {
            _hashCode += getHoraReporte().hashCode();
        }
        if (getMensajeError() != null) {
            _hashCode += getMensajeError().hashCode();
        }
        if (getNumeroIncidente() != null) {
            _hashCode += getNumeroIncidente().hashCode();
        }
        if (getTipoServicio() != null) {
            _hashCode += getTipoServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CbObtenerHistoriaTelefonoRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "CbObtenerHistoriaTelefonoRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "codigoError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "estatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCancelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "fechaCancelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaReporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "fechaReporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaCancelacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "horaCancelacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaReporte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "horaReporte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "mensajeError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIncidente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://obtenerHistoriaTelefono.integracion.sacas.cantv.com/xsd", "numeroIncidente"));
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
