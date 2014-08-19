/**
 * F2V5IVRAscObtenerMovimientosRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package obtenerMovimientosCent;

public class F2V5IVRAscObtenerMovimientosRQ  implements java.io.Serializable {
    private java.lang.Long AREA_CODE;

    private java.lang.Long TELNUM;

    public F2V5IVRAscObtenerMovimientosRQ() {
    }

    public F2V5IVRAscObtenerMovimientosRQ(
           java.lang.Long AREA_CODE,
           java.lang.Long TELNUM) {
           this.AREA_CODE = AREA_CODE;
           this.TELNUM = TELNUM;
    }


    /**
     * Gets the AREA_CODE value for this F2V5IVRAscObtenerMovimientosRQ.
     * 
     * @return AREA_CODE
     */
    public java.lang.Long getAREA_CODE() {
        return AREA_CODE;
    }


    /**
     * Sets the AREA_CODE value for this F2V5IVRAscObtenerMovimientosRQ.
     * 
     * @param AREA_CODE
     */
    public void setAREA_CODE(java.lang.Long AREA_CODE) {
        this.AREA_CODE = AREA_CODE;
    }


    /**
     * Gets the TELNUM value for this F2V5IVRAscObtenerMovimientosRQ.
     * 
     * @return TELNUM
     */
    public java.lang.Long getTELNUM() {
        return TELNUM;
    }


    /**
     * Sets the TELNUM value for this F2V5IVRAscObtenerMovimientosRQ.
     * 
     * @param TELNUM
     */
    public void setTELNUM(java.lang.Long TELNUM) {
        this.TELNUM = TELNUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof F2V5IVRAscObtenerMovimientosRQ)) return false;
        F2V5IVRAscObtenerMovimientosRQ other = (F2V5IVRAscObtenerMovimientosRQ) obj;
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
        new org.apache.axis.description.TypeDesc(F2V5IVRAscObtenerMovimientosRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://obtenerMovimientosCent", "F2V5IVRAscObtenerMovimientosRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AREA_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AREA_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
