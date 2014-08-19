/**
 * F2V5_NAP_Asc_obtenerSaldoCuenta_RP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware;

public class F2V5_NAP_Asc_obtenerSaldoCuenta_RP  implements java.io.Serializable {
    private java.math.BigDecimal saldoActual;

    private java.math.BigDecimal saldoVencido;

    private response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Cuentas cuentas;

    private response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Error error;

    public F2V5_NAP_Asc_obtenerSaldoCuenta_RP() {
    }

    public F2V5_NAP_Asc_obtenerSaldoCuenta_RP(
           java.math.BigDecimal saldoActual,
           java.math.BigDecimal saldoVencido,
           response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Cuentas cuentas,
           response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Error error) {
           this.saldoActual = saldoActual;
           this.saldoVencido = saldoVencido;
           this.cuentas = cuentas;
           this.error = error;
    }


    /**
     * Gets the saldoActual value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @return saldoActual
     */
    public java.math.BigDecimal getSaldoActual() {
        return saldoActual;
    }


    /**
     * Sets the saldoActual value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @param saldoActual
     */
    public void setSaldoActual(java.math.BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }


    /**
     * Gets the saldoVencido value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @return saldoVencido
     */
    public java.math.BigDecimal getSaldoVencido() {
        return saldoVencido;
    }


    /**
     * Sets the saldoVencido value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @param saldoVencido
     */
    public void setSaldoVencido(java.math.BigDecimal saldoVencido) {
        this.saldoVencido = saldoVencido;
    }


    /**
     * Gets the cuentas value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @return cuentas
     */
    public response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Cuentas getCuentas() {
        return cuentas;
    }


    /**
     * Sets the cuentas value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @param cuentas
     */
    public void setCuentas(response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Cuentas cuentas) {
        this.cuentas = cuentas;
    }


    /**
     * Gets the error value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @return error
     */
    public response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Error getError() {
        return error;
    }


    /**
     * Sets the error value for this F2V5_NAP_Asc_obtenerSaldoCuenta_RP.
     * 
     * @param error
     */
    public void setError(response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.Error error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof F2V5_NAP_Asc_obtenerSaldoCuenta_RP)) return false;
        F2V5_NAP_Asc_obtenerSaldoCuenta_RP other = (F2V5_NAP_Asc_obtenerSaldoCuenta_RP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saldoActual==null && other.getSaldoActual()==null) || 
             (this.saldoActual!=null &&
              this.saldoActual.equals(other.getSaldoActual()))) &&
            ((this.saldoVencido==null && other.getSaldoVencido()==null) || 
             (this.saldoVencido!=null &&
              this.saldoVencido.equals(other.getSaldoVencido()))) &&
            ((this.cuentas==null && other.getCuentas()==null) || 
             (this.cuentas!=null &&
              this.cuentas.equals(other.getCuentas()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getSaldoActual() != null) {
            _hashCode += getSaldoActual().hashCode();
        }
        if (getSaldoVencido() != null) {
            _hashCode += getSaldoVencido().hashCode();
        }
        if (getCuentas() != null) {
            _hashCode += getCuentas().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(F2V5_NAP_Asc_obtenerSaldoCuenta_RP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta:response", "f2v5_NAP_Asc_obtenerSaldoCuenta_RP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoActual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldoActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldoVencido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saldoVencido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cuentas"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta:response", "Cuentas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta:response", "Error"));
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
