/**
 * Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NAP_Asc_obtenerSaldoCuenta;

public class Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse  implements java.io.Serializable {
    private response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP;

    private java.lang.String cid;  // attribute

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse() {
    }

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse(
           response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP,
           java.lang.String cid) {
           this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP = f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP;
           this.cid = cid;
    }


    /**
     * Gets the f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.
     * 
     * @return f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP
     */
    public response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP() {
        return f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP;
    }


    /**
     * Sets the f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.
     * 
     * @param f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP
     */
    public void setF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP(response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP) {
        this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP = f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP;
    }


    /**
     * Gets the cid value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.
     * 
     * @return cid
     */
    public java.lang.String getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.
     * 
     * @param cid
     */
    public void setCid(java.lang.String cid) {
        this.cid = cid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse)) return false;
        Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse other = (Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP==null && other.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP()==null) || 
             (this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP!=null &&
              this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP.equals(other.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP()))) &&
            ((this.cid==null && other.getCid()==null) || 
             (this.cid!=null &&
              this.cid.equals(other.getCid())));
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
        if (getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP() != null) {
            _hashCode += getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP().hashCode();
        }
        if (getCid() != null) {
            _hashCode += getCid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://NAP_Asc_obtenerSaldoCuenta", "Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "cid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f2V5_NAP_ASC_OBTENERSALDOCUENTA_RP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "F2V5_NAP_ASC_OBTENERSALDOCUENTA_RP"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta:response", "f2v5_NAP_Asc_obtenerSaldoCuenta_RP"));
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
