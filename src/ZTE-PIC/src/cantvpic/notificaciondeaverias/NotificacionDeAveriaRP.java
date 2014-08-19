/**
 * NotificacionDeAveriaRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cantvpic.notificaciondeaverias;

public class NotificacionDeAveriaRP  implements java.io.Serializable {
    private java.lang.String ERROR_CODE;

    private java.lang.String ERROR_MESSAGE;

    public NotificacionDeAveriaRP() {
    }

    public NotificacionDeAveriaRP(
           java.lang.String ERROR_CODE,
           java.lang.String ERROR_MESSAGE) {
           this.ERROR_CODE = ERROR_CODE;
           this.ERROR_MESSAGE = ERROR_MESSAGE;
    }


    /**
     * Gets the ERROR_CODE value for this NotificacionDeAveriaRP.
     * 
     * @return ERROR_CODE
     */
    public java.lang.String getERROR_CODE() {
        return ERROR_CODE;
    }


    /**
     * Sets the ERROR_CODE value for this NotificacionDeAveriaRP.
     * 
     * @param ERROR_CODE
     */
    public void setERROR_CODE(java.lang.String ERROR_CODE) {
        this.ERROR_CODE = ERROR_CODE;
    }


    /**
     * Gets the ERROR_MESSAGE value for this NotificacionDeAveriaRP.
     * 
     * @return ERROR_MESSAGE
     */
    public java.lang.String getERROR_MESSAGE() {
        return ERROR_MESSAGE;
    }


    /**
     * Sets the ERROR_MESSAGE value for this NotificacionDeAveriaRP.
     * 
     * @param ERROR_MESSAGE
     */
    public void setERROR_MESSAGE(java.lang.String ERROR_MESSAGE) {
        this.ERROR_MESSAGE = ERROR_MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificacionDeAveriaRP)) return false;
        NotificacionDeAveriaRP other = (NotificacionDeAveriaRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ERROR_CODE==null && other.getERROR_CODE()==null) || 
             (this.ERROR_CODE!=null &&
              this.ERROR_CODE.equals(other.getERROR_CODE()))) &&
            ((this.ERROR_MESSAGE==null && other.getERROR_MESSAGE()==null) || 
             (this.ERROR_MESSAGE!=null &&
              this.ERROR_MESSAGE.equals(other.getERROR_MESSAGE())));
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
        if (getERROR_CODE() != null) {
            _hashCode += getERROR_CODE().hashCode();
        }
        if (getERROR_MESSAGE() != null) {
            _hashCode += getERROR_MESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificacionDeAveriaRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "NotificacionDeAveriaRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "ERROR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "ERROR_MESSAGE"));
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
