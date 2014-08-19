/**
 * F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package IVR_Asc_ObtenerEstatusReclamosCliente;

public class F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP  implements java.io.Serializable {
    private java.lang.String codigo_de_Area;

    private java.lang.String telefono;

    private java.lang.String numero_del_reclamo;

    private java.lang.Long codigo_Retorno;

    private java.lang.Long total_Registros;

    private response.Detalle[] detalle;

    public F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP() {
    }

    public F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP(
           java.lang.String codigo_de_Area,
           java.lang.String telefono,
           java.lang.String numero_del_reclamo,
           java.lang.Long codigo_Retorno,
           java.lang.Long total_Registros,
           response.Detalle[] detalle) {
           this.codigo_de_Area = codigo_de_Area;
           this.telefono = telefono;
           this.numero_del_reclamo = numero_del_reclamo;
           this.codigo_Retorno = codigo_Retorno;
           this.total_Registros = total_Registros;
           this.detalle = detalle;
    }


    /**
     * Gets the codigo_de_Area value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return codigo_de_Area
     */
    public java.lang.String getCodigo_de_Area() {
        return codigo_de_Area;
    }


    /**
     * Sets the codigo_de_Area value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param codigo_de_Area
     */
    public void setCodigo_de_Area(java.lang.String codigo_de_Area) {
        this.codigo_de_Area = codigo_de_Area;
    }


    /**
     * Gets the telefono value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the numero_del_reclamo value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return numero_del_reclamo
     */
    public java.lang.String getNumero_del_reclamo() {
        return numero_del_reclamo;
    }


    /**
     * Sets the numero_del_reclamo value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param numero_del_reclamo
     */
    public void setNumero_del_reclamo(java.lang.String numero_del_reclamo) {
        this.numero_del_reclamo = numero_del_reclamo;
    }


    /**
     * Gets the codigo_Retorno value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return codigo_Retorno
     */
    public java.lang.Long getCodigo_Retorno() {
        return codigo_Retorno;
    }


    /**
     * Sets the codigo_Retorno value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param codigo_Retorno
     */
    public void setCodigo_Retorno(java.lang.Long codigo_Retorno) {
        this.codigo_Retorno = codigo_Retorno;
    }


    /**
     * Gets the total_Registros value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return total_Registros
     */
    public java.lang.Long getTotal_Registros() {
        return total_Registros;
    }


    /**
     * Sets the total_Registros value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param total_Registros
     */
    public void setTotal_Registros(java.lang.Long total_Registros) {
        this.total_Registros = total_Registros;
    }


    /**
     * Gets the detalle value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @return detalle
     */
    public response.Detalle[] getDetalle() {
        return detalle;
    }


    /**
     * Sets the detalle value for this F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.
     * 
     * @param detalle
     */
    public void setDetalle(response.Detalle[] detalle) {
        this.detalle = detalle;
    }

    public response.Detalle getDetalle(int i) {
        return this.detalle[i];
    }

    public void setDetalle(int i, response.Detalle _value) {
        this.detalle[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP)) return false;
        F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP other = (F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP) obj;
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
              this.numero_del_reclamo.equals(other.getNumero_del_reclamo()))) &&
            ((this.codigo_Retorno==null && other.getCodigo_Retorno()==null) || 
             (this.codigo_Retorno!=null &&
              this.codigo_Retorno.equals(other.getCodigo_Retorno()))) &&
            ((this.total_Registros==null && other.getTotal_Registros()==null) || 
             (this.total_Registros!=null &&
              this.total_Registros.equals(other.getTotal_Registros()))) &&
            ((this.detalle==null && other.getDetalle()==null) || 
             (this.detalle!=null &&
              java.util.Arrays.equals(this.detalle, other.getDetalle())));
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
        if (getCodigo_Retorno() != null) {
            _hashCode += getCodigo_Retorno().hashCode();
        }
        if (getTotal_Registros() != null) {
            _hashCode += getTotal_Registros().hashCode();
        }
        if (getDetalle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://IVR_Asc_ObtenerEstatusReclamosCliente", "F2V5_IVR_Asc_obtenerEstatusReclamosCliente_RP"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_Retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Codigo_Retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Registros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Total_Registros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Detalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("Serviciof2v5_IVR_Asc_ObtenerEstatusReclamosCliente:response", "Detalle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
