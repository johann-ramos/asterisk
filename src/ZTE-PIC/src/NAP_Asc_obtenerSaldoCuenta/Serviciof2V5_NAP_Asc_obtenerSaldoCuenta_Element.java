/**
 * Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NAP_Asc_obtenerSaldoCuenta;

public class Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element  implements java.io.Serializable {
    private Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ;

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element() {
    }

    public Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element(
           Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ) {
           this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ = f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ;
    }


    /**
     * Gets the f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element.
     * 
     * @return f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ
     */
    public Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ() {
        return f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ;
    }


    /**
     * Sets the f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ value for this Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element.
     * 
     * @param f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ
     */
    public void setF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ(Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ) {
        this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ = f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element)) return false;
        Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element other = (Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ==null && other.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ()==null) || 
             (this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ!=null &&
              this.f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ.equals(other.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ())));
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
        if (getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ() != null) {
            _hashCode += getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://NAP_Asc_obtenerSaldoCuenta", "Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "F2V5_NAP_ASC_OBTENERSALDOCUENTA_RQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta", "f2v5_NAP_Asc_obtenerSaldoCuenta_RQ"));
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
