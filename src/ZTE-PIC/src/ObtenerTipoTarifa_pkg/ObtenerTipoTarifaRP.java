/**
 * ObtenerTipoTarifaRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObtenerTipoTarifa_pkg;

public class ObtenerTipoTarifaRP  implements java.io.Serializable {
    private java.lang.Long CODIGO_DE_AREA;

    private java.lang.Long TELEFONO;

    private java.lang.String INDICADOR_SERVICIO;

    private java.lang.Long CODIGO_RETORNO;

    private java.lang.String SOCIAL;

    public ObtenerTipoTarifaRP() {
    }

    public ObtenerTipoTarifaRP(
           java.lang.Long CODIGO_DE_AREA,
           java.lang.Long TELEFONO,
           java.lang.String INDICADOR_SERVICIO,
           java.lang.Long CODIGO_RETORNO,
           java.lang.String SOCIAL) {
           this.CODIGO_DE_AREA = CODIGO_DE_AREA;
           this.TELEFONO = TELEFONO;
           this.INDICADOR_SERVICIO = INDICADOR_SERVICIO;
           this.CODIGO_RETORNO = CODIGO_RETORNO;
           this.SOCIAL = SOCIAL;
    }


    /**
     * Gets the CODIGO_DE_AREA value for this ObtenerTipoTarifaRP.
     * 
     * @return CODIGO_DE_AREA
     */
    public java.lang.Long getCODIGO_DE_AREA() {
        return CODIGO_DE_AREA;
    }


    /**
     * Sets the CODIGO_DE_AREA value for this ObtenerTipoTarifaRP.
     * 
     * @param CODIGO_DE_AREA
     */
    public void setCODIGO_DE_AREA(java.lang.Long CODIGO_DE_AREA) {
        this.CODIGO_DE_AREA = CODIGO_DE_AREA;
    }


    /**
     * Gets the TELEFONO value for this ObtenerTipoTarifaRP.
     * 
     * @return TELEFONO
     */
    public java.lang.Long getTELEFONO() {
        return TELEFONO;
    }


    /**
     * Sets the TELEFONO value for this ObtenerTipoTarifaRP.
     * 
     * @param TELEFONO
     */
    public void setTELEFONO(java.lang.Long TELEFONO) {
        this.TELEFONO = TELEFONO;
    }


    /**
     * Gets the INDICADOR_SERVICIO value for this ObtenerTipoTarifaRP.
     * 
     * @return INDICADOR_SERVICIO
     */
    public java.lang.String getINDICADOR_SERVICIO() {
        return INDICADOR_SERVICIO;
    }


    /**
     * Sets the INDICADOR_SERVICIO value for this ObtenerTipoTarifaRP.
     * 
     * @param INDICADOR_SERVICIO
     */
    public void setINDICADOR_SERVICIO(java.lang.String INDICADOR_SERVICIO) {
        this.INDICADOR_SERVICIO = INDICADOR_SERVICIO;
    }


    /**
     * Gets the CODIGO_RETORNO value for this ObtenerTipoTarifaRP.
     * 
     * @return CODIGO_RETORNO
     */
    public java.lang.Long getCODIGO_RETORNO() {
        return CODIGO_RETORNO;
    }


    /**
     * Sets the CODIGO_RETORNO value for this ObtenerTipoTarifaRP.
     * 
     * @param CODIGO_RETORNO
     */
    public void setCODIGO_RETORNO(java.lang.Long CODIGO_RETORNO) {
        this.CODIGO_RETORNO = CODIGO_RETORNO;
    }


    /**
     * Gets the SOCIAL value for this ObtenerTipoTarifaRP.
     * 
     * @return SOCIAL
     */
    public java.lang.String getSOCIAL() {
        return SOCIAL;
    }


    /**
     * Sets the SOCIAL value for this ObtenerTipoTarifaRP.
     * 
     * @param SOCIAL
     */
    public void setSOCIAL(java.lang.String SOCIAL) {
        this.SOCIAL = SOCIAL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerTipoTarifaRP)) return false;
        ObtenerTipoTarifaRP other = (ObtenerTipoTarifaRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODIGO_DE_AREA==null && other.getCODIGO_DE_AREA()==null) || 
             (this.CODIGO_DE_AREA!=null &&
              this.CODIGO_DE_AREA.equals(other.getCODIGO_DE_AREA()))) &&
            ((this.TELEFONO==null && other.getTELEFONO()==null) || 
             (this.TELEFONO!=null &&
              this.TELEFONO.equals(other.getTELEFONO()))) &&
            ((this.INDICADOR_SERVICIO==null && other.getINDICADOR_SERVICIO()==null) || 
             (this.INDICADOR_SERVICIO!=null &&
              this.INDICADOR_SERVICIO.equals(other.getINDICADOR_SERVICIO()))) &&
            ((this.CODIGO_RETORNO==null && other.getCODIGO_RETORNO()==null) || 
             (this.CODIGO_RETORNO!=null &&
              this.CODIGO_RETORNO.equals(other.getCODIGO_RETORNO()))) &&
            ((this.SOCIAL==null && other.getSOCIAL()==null) || 
             (this.SOCIAL!=null &&
              this.SOCIAL.equals(other.getSOCIAL())));
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
        if (getCODIGO_DE_AREA() != null) {
            _hashCode += getCODIGO_DE_AREA().hashCode();
        }
        if (getTELEFONO() != null) {
            _hashCode += getTELEFONO().hashCode();
        }
        if (getINDICADOR_SERVICIO() != null) {
            _hashCode += getINDICADOR_SERVICIO().hashCode();
        }
        if (getCODIGO_RETORNO() != null) {
            _hashCode += getCODIGO_RETORNO().hashCode();
        }
        if (getSOCIAL() != null) {
            _hashCode += getSOCIAL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerTipoTarifaRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "ObtenerTipoTarifaRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_DE_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "CODIGO_DE_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEFONO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "TELEFONO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_SERVICIO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "INDICADOR_SERVICIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "CODIGO_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOCIAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "SOCIAL"));
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
