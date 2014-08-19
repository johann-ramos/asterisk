/**
 * NotificacionDeAveriaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cantvpic.notificaciondeaverias;

public class NotificacionDeAveriaResponse  implements java.io.Serializable {
    private cantvpic.notificaciondeaverias.NotificacionDeAveriaRP notificacionDeAveriaReturn;

    public NotificacionDeAveriaResponse() {
    }

    public NotificacionDeAveriaResponse(
           cantvpic.notificaciondeaverias.NotificacionDeAveriaRP notificacionDeAveriaReturn) {
           this.notificacionDeAveriaReturn = notificacionDeAveriaReturn;
    }


    /**
     * Gets the notificacionDeAveriaReturn value for this NotificacionDeAveriaResponse.
     * 
     * @return notificacionDeAveriaReturn
     */
    public cantvpic.notificaciondeaverias.NotificacionDeAveriaRP getNotificacionDeAveriaReturn() {
        return notificacionDeAveriaReturn;
    }


    /**
     * Sets the notificacionDeAveriaReturn value for this NotificacionDeAveriaResponse.
     * 
     * @param notificacionDeAveriaReturn
     */
    public void setNotificacionDeAveriaReturn(cantvpic.notificaciondeaverias.NotificacionDeAveriaRP notificacionDeAveriaReturn) {
        this.notificacionDeAveriaReturn = notificacionDeAveriaReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificacionDeAveriaResponse)) return false;
        NotificacionDeAveriaResponse other = (NotificacionDeAveriaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificacionDeAveriaReturn==null && other.getNotificacionDeAveriaReturn()==null) || 
             (this.notificacionDeAveriaReturn!=null &&
              this.notificacionDeAveriaReturn.equals(other.getNotificacionDeAveriaReturn())));
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
        if (getNotificacionDeAveriaReturn() != null) {
            _hashCode += getNotificacionDeAveriaReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificacionDeAveriaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", ">NotificacionDeAveriaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificacionDeAveriaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "NotificacionDeAveriaReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://notificaciondeaverias.cantvpic", "NotificacionDeAveriaRP"));
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
