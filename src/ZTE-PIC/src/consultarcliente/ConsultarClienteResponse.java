/**
 * ConsultarClienteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package consultarcliente;

public class ConsultarClienteResponse  implements java.io.Serializable {
    private consultarcliente.ConsultarClienteRP consultarClienteReturn;

    public ConsultarClienteResponse() {
    }

    public ConsultarClienteResponse(
           consultarcliente.ConsultarClienteRP consultarClienteReturn) {
           this.consultarClienteReturn = consultarClienteReturn;
    }


    /**
     * Gets the consultarClienteReturn value for this ConsultarClienteResponse.
     * 
     * @return consultarClienteReturn
     */
    public consultarcliente.ConsultarClienteRP getConsultarClienteReturn() {
        return consultarClienteReturn;
    }


    /**
     * Sets the consultarClienteReturn value for this ConsultarClienteResponse.
     * 
     * @param consultarClienteReturn
     */
    public void setConsultarClienteReturn(consultarcliente.ConsultarClienteRP consultarClienteReturn) {
        this.consultarClienteReturn = consultarClienteReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarClienteResponse)) return false;
        ConsultarClienteResponse other = (ConsultarClienteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultarClienteReturn==null && other.getConsultarClienteReturn()==null) || 
             (this.consultarClienteReturn!=null &&
              this.consultarClienteReturn.equals(other.getConsultarClienteReturn())));
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
        if (getConsultarClienteReturn() != null) {
            _hashCode += getConsultarClienteReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarClienteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://consultarcliente", ">consultarClienteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultarClienteReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://consultarcliente", "consultarClienteReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://consultarcliente", "ConsultarClienteRP"));
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
