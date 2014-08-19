/**
 * F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package IVR_Asc_ObtenerEstatusReclamosCliente;

public class F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ  implements java.io.Serializable {
    private java.lang.String codigo_de_Area;

    private java.lang.String telefono;

    private java.lang.String numero_del_reclamo;

    public F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ() {
    }

    public F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ(
           java.lang.String codigo_de_Area,
           java.lang.String telefono,
           java.lang.String numero_del_reclamo) {
           this.codigo_de_Area = codigo_de_Area;
           this.telefono = telefono;
           this.numero_del_reclamo = numero_del_reclamo;
    }


    /**
     * Gets the codigo_de_Area value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @return codigo_de_Area
     */
    public java.lang.String getCodigo_de_Area() {
        return codigo_de_Area;
    }


    /**
     * Sets the codigo_de_Area value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @param codigo_de_Area
     */
    public void setCodigo_de_Area(java.lang.String codigo_de_Area) {
        this.codigo_de_Area = codigo_de_Area;
    }


    /**
     * Gets the telefono value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the numero_del_reclamo value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @return numero_del_reclamo
     */
    public java.lang.String getNumero_del_reclamo() {
        return numero_del_reclamo;
    }


    /**
     * Sets the numero_del_reclamo value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.
     * 
     * @param numero_del_reclamo
     */
    public void setNumero_del_reclamo(java.lang.String numero_del_reclamo) {
        this.numero_del_reclamo = numero_del_reclamo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ)) return false;
        F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ other = (F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo_de_Area==null && other.getCodigo_de_Area()==null) || 
             (this.codigo_de_Area!=null &&
              this.codigo_de_Area.equals(other.getCodigo_de_Area()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.numero_del_reclamo==null && other.getNumero_del_reclamo()==null) || 
             (this.numero_del_reclamo!=null &&
              this.numero_del_reclamo.equals(other.getNumero_del_reclamo())));
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
        if (getCodigo_de_Area() != null) {
            _hashCode += getCodigo_de_Area().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getNumero_del_reclamo() != null) {
            _hashCode += getNumero_del_reclamo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://IVR_Asc_ObtenerEstatusReclamosCliente", "F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_de_Area");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Codigo_de_Area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_del_reclamo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Numero_del_reclamo"));
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
