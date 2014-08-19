/**
 * ConsultarClienteRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package consultarcliente;

public class ConsultarClienteRQ  implements java.io.Serializable {
    private java.lang.String numeroTelefono;

    private java.lang.String IDCliente;

    public ConsultarClienteRQ() {
    }

    public ConsultarClienteRQ(
           java.lang.String numeroTelefono,
           java.lang.String IDCliente) {
           this.numeroTelefono = numeroTelefono;
           this.IDCliente = IDCliente;
    }


    /**
     * Gets the numeroTelefono value for this ConsultarClienteRQ.
     * 
     * @return numeroTelefono
     */
    public java.lang.String getNumeroTelefono() {
        return numeroTelefono;
    }


    /**
     * Sets the numeroTelefono value for this ConsultarClienteRQ.
     * 
     * @param numeroTelefono
     */
    public void setNumeroTelefono(java.lang.String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


    /**
     * Gets the IDCliente value for this ConsultarClienteRQ.
     * 
     * @return IDCliente
     */
    public java.lang.String getIDCliente() {
        return IDCliente;
    }


    /**
     * Sets the IDCliente value for this ConsultarClienteRQ.
     * 
     * @param IDCliente
     */
    public void setIDCliente(java.lang.String IDCliente) {
        this.IDCliente = IDCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarClienteRQ)) return false;
        ConsultarClienteRQ other = (ConsultarClienteRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroTelefono==null && other.getNumeroTelefono()==null) || 
             (this.numeroTelefono!=null &&
              this.numeroTelefono.equals(other.getNumeroTelefono()))) &&
            ((this.IDCliente==null && other.getIDCliente()==null) || 
             (this.IDCliente!=null &&
              this.IDCliente.equals(other.getIDCliente())));
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
        if (getNumeroTelefono() != null) {
            _hashCode += getNumeroTelefono().hashCode();
        }
        if (getIDCliente() != null) {
            _hashCode += getIDCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarClienteRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://consultarcliente", "ConsultarClienteRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroTelefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://consultarcliente", "numeroTelefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://consultarcliente", "IDCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
