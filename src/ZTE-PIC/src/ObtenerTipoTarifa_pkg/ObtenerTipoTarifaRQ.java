/**
 * ObtenerTipoTarifaRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObtenerTipoTarifa_pkg;

public class ObtenerTipoTarifaRQ  implements java.io.Serializable {
    private java.lang.Long AREA_CODE;

    private java.lang.Long TELNUM;

    public ObtenerTipoTarifaRQ() {
    }

    public ObtenerTipoTarifaRQ(
           java.lang.Long AREA_CODE,
           java.lang.Long TELNUM) {
           this.AREA_CODE = AREA_CODE;
           this.TELNUM = TELNUM;
    }


    /**
     * Gets the AREA_CODE value for this ObtenerTipoTarifaRQ.
     * 
     * @return AREA_CODE
     */
    public java.lang.Long getAREA_CODE() {
        return AREA_CODE;
    }


    /**
     * Sets the AREA_CODE value for this ObtenerTipoTarifaRQ.
     * 
     * @param AREA_CODE
     */
    public void setAREA_CODE(java.lang.Long AREA_CODE) {
        this.AREA_CODE = AREA_CODE;
    }


    /**
     * Gets the TELNUM value for this ObtenerTipoTarifaRQ.
     * 
     * @return TELNUM
     */
    public java.lang.Long getTELNUM() {
        return TELNUM;
    }


    /**
     * Sets the TELNUM value for this ObtenerTipoTarifaRQ.
     * 
     * @param TELNUM
     */
    public void setTELNUM(java.lang.Long TELNUM) {
        this.TELNUM = TELNUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerTipoTarifaRQ)) return false;
        ObtenerTipoTarifaRQ other = (ObtenerTipoTarifaRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AREA_CODE==null && other.getAREA_CODE()==null) || 
             (this.AREA_CODE!=null &&
              this.AREA_CODE.equals(other.getAREA_CODE()))) &&
            ((this.TELNUM==null && other.getTELNUM()==null) || 
             (this.TELNUM!=null &&
              this.TELNUM.equals(other.getTELNUM())));
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
        if (getAREA_CODE() != null) {
            _hashCode += getAREA_CODE().hashCode();
        }
        if (getTELNUM() != null) {
            _hashCode += getTELNUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerTipoTarifaRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "ObtenerTipoTarifaRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AREA_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "AREA_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "TELNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
