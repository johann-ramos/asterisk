/**
 * F2V5IVRAscObtenerMovimientosRP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package obtenerMovimientosCent;

public class F2V5IVRAscObtenerMovimientosRP  implements java.io.Serializable {
    private java.lang.Long CODIGO_DE_AREA;

    private java.lang.Long TELEFONO;

    private java.lang.String FECHA_DE_LA_DEUDA_1;

    private java.lang.Long MONTO_DE_LA_DEUDA_1;

    private java.lang.String FECHA_DE_LA_DEUDA_2;

    private java.lang.Long MONTO_DE_LA_DEUDA_2;

    private java.lang.String FECHA_DE_LA_DEUDA_3;

    private java.lang.Long MONTO_DE_LA_DEUDA_3;

    private java.lang.String FECHA_DE_LA_DEUDA_4;

    private java.lang.Long MONTO_DE_LA_DEUDA_4;

    private java.lang.String FECHA_DE_LA_DEUDA_5;

    private java.lang.Long MONTO_DE_LA_DEUDA_5;

    private java.lang.String FECHA_DE_LA_DEUDA_6;

    private java.lang.Long MONTO_DE_LA_DEUDA_6;

    private java.lang.Long MONTO_TOTAL_PENDIENTE;

    private java.lang.String NOMBRE_DEL_CLIENTE;

    private java.lang.String TIPO_CLIENTE;

    private java.lang.String TIPO_SERVICIO;

    private java.lang.String FECHA_VENCIMIENTO_DE_FACTURA;

    private java.lang.Long MONTO_MORA_A_30_DIAS;

    private java.lang.String FECHA_DE_LA_MORA_A_30_DIAS;

    private java.lang.Long MONTO_MORA_A_60_DIAS;

    private java.lang.String FECHA_DE_LA_MORA_60_DIAS;

    private java.lang.Long MONTO_MORA_A_90_DIAS;

    private java.lang.String FECHA_DE_LA_MORA_90_DIAS;

    private java.lang.String FECHA_ULTIMA_FACTURA;

    private java.lang.String INDICADOR_DE_INFORMACION_CONVENIO;

    private java.lang.String NUMERO_DE_CUENTA;

    private java.lang.Long MONTO_DEL_SALDO_CONVENIO;

    private java.lang.Long MONTO_DEL_CONVENIO;

    private java.lang.Long CANTIDAD_DE_GIROS;

    private java.lang.Long MONTO_DEL_GIRO_DE_CONVENIO;

    private java.lang.Long CANTIDAD_DE_GIROS_VENCIDOS;

    private java.lang.String FECHA_DEL_VENCIDO;

    private java.lang.String INDICADOR_TELEFONO_ACTIVO;

    private java.lang.String FECHA_NOTIFICADOR;

    private java.lang.String INDICADOR_CORTE_RECONEXION;

    private java.lang.Long CANTIDAD_DE_LLAMADAS;

    private java.lang.Long CODIGO_RETORNO;

    private java.lang.String INDICADOR_DE_INFORMACION_PREPAGO;

    private java.lang.String INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO;

    private java.lang.String FECHA_DE_SOLICITUD_DEL_RETIRO;

    private java.lang.String DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO;

    private java.lang.String INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO;

    private java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO;

    private java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO;

    private java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO;

    private java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE;

    private java.lang.String NUMERO_DE_TELEFONO;

    private java.lang.String INDICADOR_SERVICIO;

    private java.lang.String DESCRIPCION_MOTIVO_DE_CORTE;

    public F2V5IVRAscObtenerMovimientosRP() {
    }

    public F2V5IVRAscObtenerMovimientosRP(
           java.lang.Long CODIGO_DE_AREA,
           java.lang.Long TELEFONO,
           java.lang.String FECHA_DE_LA_DEUDA_1,
           java.lang.Long MONTO_DE_LA_DEUDA_1,
           java.lang.String FECHA_DE_LA_DEUDA_2,
           java.lang.Long MONTO_DE_LA_DEUDA_2,
           java.lang.String FECHA_DE_LA_DEUDA_3,
           java.lang.Long MONTO_DE_LA_DEUDA_3,
           java.lang.String FECHA_DE_LA_DEUDA_4,
           java.lang.Long MONTO_DE_LA_DEUDA_4,
           java.lang.String FECHA_DE_LA_DEUDA_5,
           java.lang.Long MONTO_DE_LA_DEUDA_5,
           java.lang.String FECHA_DE_LA_DEUDA_6,
           java.lang.Long MONTO_DE_LA_DEUDA_6,
           java.lang.Long MONTO_TOTAL_PENDIENTE,
           java.lang.String NOMBRE_DEL_CLIENTE,
           java.lang.String TIPO_CLIENTE,
           java.lang.String TIPO_SERVICIO,
           java.lang.String FECHA_VENCIMIENTO_DE_FACTURA,
           java.lang.Long MONTO_MORA_A_30_DIAS,
           java.lang.String FECHA_DE_LA_MORA_A_30_DIAS,
           java.lang.Long MONTO_MORA_A_60_DIAS,
           java.lang.String FECHA_DE_LA_MORA_60_DIAS,
           java.lang.Long MONTO_MORA_A_90_DIAS,
           java.lang.String FECHA_DE_LA_MORA_90_DIAS,
           java.lang.String FECHA_ULTIMA_FACTURA,
           java.lang.String INDICADOR_DE_INFORMACION_CONVENIO,
           java.lang.String NUMERO_DE_CUENTA,
           java.lang.Long MONTO_DEL_SALDO_CONVENIO,
           java.lang.Long MONTO_DEL_CONVENIO,
           java.lang.Long CANTIDAD_DE_GIROS,
           java.lang.Long MONTO_DEL_GIRO_DE_CONVENIO,
           java.lang.Long CANTIDAD_DE_GIROS_VENCIDOS,
           java.lang.String FECHA_DEL_VENCIDO,
           java.lang.String INDICADOR_TELEFONO_ACTIVO,
           java.lang.String FECHA_NOTIFICADOR,
           java.lang.String INDICADOR_CORTE_RECONEXION,
           java.lang.Long CANTIDAD_DE_LLAMADAS,
           java.lang.Long CODIGO_RETORNO,
           java.lang.String INDICADOR_DE_INFORMACION_PREPAGO,
           java.lang.String INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO,
           java.lang.String FECHA_DE_SOLICITUD_DEL_RETIRO,
           java.lang.String DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO,
           java.lang.String INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO,
           java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO,
           java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO,
           java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO,
           java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE,
           java.lang.String NUMERO_DE_TELEFONO,
           java.lang.String INDICADOR_SERVICIO,
           java.lang.String DESCRIPCION_MOTIVO_DE_CORTE) {
           this.CODIGO_DE_AREA = CODIGO_DE_AREA;
           this.TELEFONO = TELEFONO;
           this.FECHA_DE_LA_DEUDA_1 = FECHA_DE_LA_DEUDA_1;
           this.MONTO_DE_LA_DEUDA_1 = MONTO_DE_LA_DEUDA_1;
           this.FECHA_DE_LA_DEUDA_2 = FECHA_DE_LA_DEUDA_2;
           this.MONTO_DE_LA_DEUDA_2 = MONTO_DE_LA_DEUDA_2;
           this.FECHA_DE_LA_DEUDA_3 = FECHA_DE_LA_DEUDA_3;
           this.MONTO_DE_LA_DEUDA_3 = MONTO_DE_LA_DEUDA_3;
           this.FECHA_DE_LA_DEUDA_4 = FECHA_DE_LA_DEUDA_4;
           this.MONTO_DE_LA_DEUDA_4 = MONTO_DE_LA_DEUDA_4;
           this.FECHA_DE_LA_DEUDA_5 = FECHA_DE_LA_DEUDA_5;
           this.MONTO_DE_LA_DEUDA_5 = MONTO_DE_LA_DEUDA_5;
           this.FECHA_DE_LA_DEUDA_6 = FECHA_DE_LA_DEUDA_6;
           this.MONTO_DE_LA_DEUDA_6 = MONTO_DE_LA_DEUDA_6;
           this.MONTO_TOTAL_PENDIENTE = MONTO_TOTAL_PENDIENTE;
           this.NOMBRE_DEL_CLIENTE = NOMBRE_DEL_CLIENTE;
           this.TIPO_CLIENTE = TIPO_CLIENTE;
           this.TIPO_SERVICIO = TIPO_SERVICIO;
           this.FECHA_VENCIMIENTO_DE_FACTURA = FECHA_VENCIMIENTO_DE_FACTURA;
           this.MONTO_MORA_A_30_DIAS = MONTO_MORA_A_30_DIAS;
           this.FECHA_DE_LA_MORA_A_30_DIAS = FECHA_DE_LA_MORA_A_30_DIAS;
           this.MONTO_MORA_A_60_DIAS = MONTO_MORA_A_60_DIAS;
           this.FECHA_DE_LA_MORA_60_DIAS = FECHA_DE_LA_MORA_60_DIAS;
           this.MONTO_MORA_A_90_DIAS = MONTO_MORA_A_90_DIAS;
           this.FECHA_DE_LA_MORA_90_DIAS = FECHA_DE_LA_MORA_90_DIAS;
           this.FECHA_ULTIMA_FACTURA = FECHA_ULTIMA_FACTURA;
           this.INDICADOR_DE_INFORMACION_CONVENIO = INDICADOR_DE_INFORMACION_CONVENIO;
           this.NUMERO_DE_CUENTA = NUMERO_DE_CUENTA;
           this.MONTO_DEL_SALDO_CONVENIO = MONTO_DEL_SALDO_CONVENIO;
           this.MONTO_DEL_CONVENIO = MONTO_DEL_CONVENIO;
           this.CANTIDAD_DE_GIROS = CANTIDAD_DE_GIROS;
           this.MONTO_DEL_GIRO_DE_CONVENIO = MONTO_DEL_GIRO_DE_CONVENIO;
           this.CANTIDAD_DE_GIROS_VENCIDOS = CANTIDAD_DE_GIROS_VENCIDOS;
           this.FECHA_DEL_VENCIDO = FECHA_DEL_VENCIDO;
           this.INDICADOR_TELEFONO_ACTIVO = INDICADOR_TELEFONO_ACTIVO;
           this.FECHA_NOTIFICADOR = FECHA_NOTIFICADOR;
           this.INDICADOR_CORTE_RECONEXION = INDICADOR_CORTE_RECONEXION;
           this.CANTIDAD_DE_LLAMADAS = CANTIDAD_DE_LLAMADAS;
           this.CODIGO_RETORNO = CODIGO_RETORNO;
           this.INDICADOR_DE_INFORMACION_PREPAGO = INDICADOR_DE_INFORMACION_PREPAGO;
           this.INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO = INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO;
           this.FECHA_DE_SOLICITUD_DEL_RETIRO = FECHA_DE_SOLICITUD_DEL_RETIRO;
           this.DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO = DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO;
           this.INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO = INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO;
           this.MONTO_DEL_LIMITE_DE_CREDITO = MONTO_DEL_LIMITE_DE_CREDITO;
           this.MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO = MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO;
           this.MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO;
           this.MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE;
           this.NUMERO_DE_TELEFONO = NUMERO_DE_TELEFONO;
           this.INDICADOR_SERVICIO = INDICADOR_SERVICIO;
           this.DESCRIPCION_MOTIVO_DE_CORTE = DESCRIPCION_MOTIVO_DE_CORTE;
    }


    /**
     * Gets the CODIGO_DE_AREA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return CODIGO_DE_AREA
     */
    public java.lang.Long getCODIGO_DE_AREA() {
        return CODIGO_DE_AREA;
    }


    /**
     * Sets the CODIGO_DE_AREA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param CODIGO_DE_AREA
     */
    public void setCODIGO_DE_AREA(java.lang.Long CODIGO_DE_AREA) {
        this.CODIGO_DE_AREA = CODIGO_DE_AREA;
    }


    /**
     * Gets the TELEFONO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return TELEFONO
     */
    public java.lang.Long getTELEFONO() {
        return TELEFONO;
    }


    /**
     * Sets the TELEFONO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param TELEFONO
     */
    public void setTELEFONO(java.lang.Long TELEFONO) {
        this.TELEFONO = TELEFONO;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_1 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_1
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_1() {
        return FECHA_DE_LA_DEUDA_1;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_1 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_1
     */
    public void setFECHA_DE_LA_DEUDA_1(java.lang.String FECHA_DE_LA_DEUDA_1) {
        this.FECHA_DE_LA_DEUDA_1 = FECHA_DE_LA_DEUDA_1;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_1 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_1
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_1() {
        return MONTO_DE_LA_DEUDA_1;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_1 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_1
     */
    public void setMONTO_DE_LA_DEUDA_1(java.lang.Long MONTO_DE_LA_DEUDA_1) {
        this.MONTO_DE_LA_DEUDA_1 = MONTO_DE_LA_DEUDA_1;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_2 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_2
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_2() {
        return FECHA_DE_LA_DEUDA_2;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_2 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_2
     */
    public void setFECHA_DE_LA_DEUDA_2(java.lang.String FECHA_DE_LA_DEUDA_2) {
        this.FECHA_DE_LA_DEUDA_2 = FECHA_DE_LA_DEUDA_2;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_2 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_2
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_2() {
        return MONTO_DE_LA_DEUDA_2;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_2 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_2
     */
    public void setMONTO_DE_LA_DEUDA_2(java.lang.Long MONTO_DE_LA_DEUDA_2) {
        this.MONTO_DE_LA_DEUDA_2 = MONTO_DE_LA_DEUDA_2;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_3 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_3
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_3() {
        return FECHA_DE_LA_DEUDA_3;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_3 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_3
     */
    public void setFECHA_DE_LA_DEUDA_3(java.lang.String FECHA_DE_LA_DEUDA_3) {
        this.FECHA_DE_LA_DEUDA_3 = FECHA_DE_LA_DEUDA_3;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_3 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_3
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_3() {
        return MONTO_DE_LA_DEUDA_3;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_3 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_3
     */
    public void setMONTO_DE_LA_DEUDA_3(java.lang.Long MONTO_DE_LA_DEUDA_3) {
        this.MONTO_DE_LA_DEUDA_3 = MONTO_DE_LA_DEUDA_3;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_4 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_4
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_4() {
        return FECHA_DE_LA_DEUDA_4;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_4 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_4
     */
    public void setFECHA_DE_LA_DEUDA_4(java.lang.String FECHA_DE_LA_DEUDA_4) {
        this.FECHA_DE_LA_DEUDA_4 = FECHA_DE_LA_DEUDA_4;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_4 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_4
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_4() {
        return MONTO_DE_LA_DEUDA_4;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_4 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_4
     */
    public void setMONTO_DE_LA_DEUDA_4(java.lang.Long MONTO_DE_LA_DEUDA_4) {
        this.MONTO_DE_LA_DEUDA_4 = MONTO_DE_LA_DEUDA_4;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_5 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_5
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_5() {
        return FECHA_DE_LA_DEUDA_5;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_5 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_5
     */
    public void setFECHA_DE_LA_DEUDA_5(java.lang.String FECHA_DE_LA_DEUDA_5) {
        this.FECHA_DE_LA_DEUDA_5 = FECHA_DE_LA_DEUDA_5;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_5 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_5
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_5() {
        return MONTO_DE_LA_DEUDA_5;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_5 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_5
     */
    public void setMONTO_DE_LA_DEUDA_5(java.lang.Long MONTO_DE_LA_DEUDA_5) {
        this.MONTO_DE_LA_DEUDA_5 = MONTO_DE_LA_DEUDA_5;
    }


    /**
     * Gets the FECHA_DE_LA_DEUDA_6 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_DEUDA_6
     */
    public java.lang.String getFECHA_DE_LA_DEUDA_6() {
        return FECHA_DE_LA_DEUDA_6;
    }


    /**
     * Sets the FECHA_DE_LA_DEUDA_6 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_DEUDA_6
     */
    public void setFECHA_DE_LA_DEUDA_6(java.lang.String FECHA_DE_LA_DEUDA_6) {
        this.FECHA_DE_LA_DEUDA_6 = FECHA_DE_LA_DEUDA_6;
    }


    /**
     * Gets the MONTO_DE_LA_DEUDA_6 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DE_LA_DEUDA_6
     */
    public java.lang.Long getMONTO_DE_LA_DEUDA_6() {
        return MONTO_DE_LA_DEUDA_6;
    }


    /**
     * Sets the MONTO_DE_LA_DEUDA_6 value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DE_LA_DEUDA_6
     */
    public void setMONTO_DE_LA_DEUDA_6(java.lang.Long MONTO_DE_LA_DEUDA_6) {
        this.MONTO_DE_LA_DEUDA_6 = MONTO_DE_LA_DEUDA_6;
    }


    /**
     * Gets the MONTO_TOTAL_PENDIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_TOTAL_PENDIENTE
     */
    public java.lang.Long getMONTO_TOTAL_PENDIENTE() {
        return MONTO_TOTAL_PENDIENTE;
    }


    /**
     * Sets the MONTO_TOTAL_PENDIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_TOTAL_PENDIENTE
     */
    public void setMONTO_TOTAL_PENDIENTE(java.lang.Long MONTO_TOTAL_PENDIENTE) {
        this.MONTO_TOTAL_PENDIENTE = MONTO_TOTAL_PENDIENTE;
    }


    /**
     * Gets the NOMBRE_DEL_CLIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return NOMBRE_DEL_CLIENTE
     */
    public java.lang.String getNOMBRE_DEL_CLIENTE() {
        return NOMBRE_DEL_CLIENTE;
    }


    /**
     * Sets the NOMBRE_DEL_CLIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param NOMBRE_DEL_CLIENTE
     */
    public void setNOMBRE_DEL_CLIENTE(java.lang.String NOMBRE_DEL_CLIENTE) {
        this.NOMBRE_DEL_CLIENTE = NOMBRE_DEL_CLIENTE;
    }


    /**
     * Gets the TIPO_CLIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return TIPO_CLIENTE
     */
    public java.lang.String getTIPO_CLIENTE() {
        return TIPO_CLIENTE;
    }


    /**
     * Sets the TIPO_CLIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param TIPO_CLIENTE
     */
    public void setTIPO_CLIENTE(java.lang.String TIPO_CLIENTE) {
        this.TIPO_CLIENTE = TIPO_CLIENTE;
    }


    /**
     * Gets the TIPO_SERVICIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return TIPO_SERVICIO
     */
    public java.lang.String getTIPO_SERVICIO() {
        return TIPO_SERVICIO;
    }


    /**
     * Sets the TIPO_SERVICIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param TIPO_SERVICIO
     */
    public void setTIPO_SERVICIO(java.lang.String TIPO_SERVICIO) {
        this.TIPO_SERVICIO = TIPO_SERVICIO;
    }


    /**
     * Gets the FECHA_VENCIMIENTO_DE_FACTURA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_VENCIMIENTO_DE_FACTURA
     */
    public java.lang.String getFECHA_VENCIMIENTO_DE_FACTURA() {
        return FECHA_VENCIMIENTO_DE_FACTURA;
    }


    /**
     * Sets the FECHA_VENCIMIENTO_DE_FACTURA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_VENCIMIENTO_DE_FACTURA
     */
    public void setFECHA_VENCIMIENTO_DE_FACTURA(java.lang.String FECHA_VENCIMIENTO_DE_FACTURA) {
        this.FECHA_VENCIMIENTO_DE_FACTURA = FECHA_VENCIMIENTO_DE_FACTURA;
    }


    /**
     * Gets the MONTO_MORA_A_30_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_MORA_A_30_DIAS
     */
    public java.lang.Long getMONTO_MORA_A_30_DIAS() {
        return MONTO_MORA_A_30_DIAS;
    }


    /**
     * Sets the MONTO_MORA_A_30_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_MORA_A_30_DIAS
     */
    public void setMONTO_MORA_A_30_DIAS(java.lang.Long MONTO_MORA_A_30_DIAS) {
        this.MONTO_MORA_A_30_DIAS = MONTO_MORA_A_30_DIAS;
    }


    /**
     * Gets the FECHA_DE_LA_MORA_A_30_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_MORA_A_30_DIAS
     */
    public java.lang.String getFECHA_DE_LA_MORA_A_30_DIAS() {
        return FECHA_DE_LA_MORA_A_30_DIAS;
    }


    /**
     * Sets the FECHA_DE_LA_MORA_A_30_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_MORA_A_30_DIAS
     */
    public void setFECHA_DE_LA_MORA_A_30_DIAS(java.lang.String FECHA_DE_LA_MORA_A_30_DIAS) {
        this.FECHA_DE_LA_MORA_A_30_DIAS = FECHA_DE_LA_MORA_A_30_DIAS;
    }


    /**
     * Gets the MONTO_MORA_A_60_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_MORA_A_60_DIAS
     */
    public java.lang.Long getMONTO_MORA_A_60_DIAS() {
        return MONTO_MORA_A_60_DIAS;
    }


    /**
     * Sets the MONTO_MORA_A_60_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_MORA_A_60_DIAS
     */
    public void setMONTO_MORA_A_60_DIAS(java.lang.Long MONTO_MORA_A_60_DIAS) {
        this.MONTO_MORA_A_60_DIAS = MONTO_MORA_A_60_DIAS;
    }


    /**
     * Gets the FECHA_DE_LA_MORA_60_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_MORA_60_DIAS
     */
    public java.lang.String getFECHA_DE_LA_MORA_60_DIAS() {
        return FECHA_DE_LA_MORA_60_DIAS;
    }


    /**
     * Sets the FECHA_DE_LA_MORA_60_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_MORA_60_DIAS
     */
    public void setFECHA_DE_LA_MORA_60_DIAS(java.lang.String FECHA_DE_LA_MORA_60_DIAS) {
        this.FECHA_DE_LA_MORA_60_DIAS = FECHA_DE_LA_MORA_60_DIAS;
    }


    /**
     * Gets the MONTO_MORA_A_90_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_MORA_A_90_DIAS
     */
    public java.lang.Long getMONTO_MORA_A_90_DIAS() {
        return MONTO_MORA_A_90_DIAS;
    }


    /**
     * Sets the MONTO_MORA_A_90_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_MORA_A_90_DIAS
     */
    public void setMONTO_MORA_A_90_DIAS(java.lang.Long MONTO_MORA_A_90_DIAS) {
        this.MONTO_MORA_A_90_DIAS = MONTO_MORA_A_90_DIAS;
    }


    /**
     * Gets the FECHA_DE_LA_MORA_90_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_LA_MORA_90_DIAS
     */
    public java.lang.String getFECHA_DE_LA_MORA_90_DIAS() {
        return FECHA_DE_LA_MORA_90_DIAS;
    }


    /**
     * Sets the FECHA_DE_LA_MORA_90_DIAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_LA_MORA_90_DIAS
     */
    public void setFECHA_DE_LA_MORA_90_DIAS(java.lang.String FECHA_DE_LA_MORA_90_DIAS) {
        this.FECHA_DE_LA_MORA_90_DIAS = FECHA_DE_LA_MORA_90_DIAS;
    }


    /**
     * Gets the FECHA_ULTIMA_FACTURA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_ULTIMA_FACTURA
     */
    public java.lang.String getFECHA_ULTIMA_FACTURA() {
        return FECHA_ULTIMA_FACTURA;
    }


    /**
     * Sets the FECHA_ULTIMA_FACTURA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_ULTIMA_FACTURA
     */
    public void setFECHA_ULTIMA_FACTURA(java.lang.String FECHA_ULTIMA_FACTURA) {
        this.FECHA_ULTIMA_FACTURA = FECHA_ULTIMA_FACTURA;
    }


    /**
     * Gets the INDICADOR_DE_INFORMACION_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_DE_INFORMACION_CONVENIO
     */
    public java.lang.String getINDICADOR_DE_INFORMACION_CONVENIO() {
        return INDICADOR_DE_INFORMACION_CONVENIO;
    }


    /**
     * Sets the INDICADOR_DE_INFORMACION_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_DE_INFORMACION_CONVENIO
     */
    public void setINDICADOR_DE_INFORMACION_CONVENIO(java.lang.String INDICADOR_DE_INFORMACION_CONVENIO) {
        this.INDICADOR_DE_INFORMACION_CONVENIO = INDICADOR_DE_INFORMACION_CONVENIO;
    }


    /**
     * Gets the NUMERO_DE_CUENTA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return NUMERO_DE_CUENTA
     */
    public java.lang.String getNUMERO_DE_CUENTA() {
        return NUMERO_DE_CUENTA;
    }


    /**
     * Sets the NUMERO_DE_CUENTA value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param NUMERO_DE_CUENTA
     */
    public void setNUMERO_DE_CUENTA(java.lang.String NUMERO_DE_CUENTA) {
        this.NUMERO_DE_CUENTA = NUMERO_DE_CUENTA;
    }


    /**
     * Gets the MONTO_DEL_SALDO_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_SALDO_CONVENIO
     */
    public java.lang.Long getMONTO_DEL_SALDO_CONVENIO() {
        return MONTO_DEL_SALDO_CONVENIO;
    }


    /**
     * Sets the MONTO_DEL_SALDO_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_SALDO_CONVENIO
     */
    public void setMONTO_DEL_SALDO_CONVENIO(java.lang.Long MONTO_DEL_SALDO_CONVENIO) {
        this.MONTO_DEL_SALDO_CONVENIO = MONTO_DEL_SALDO_CONVENIO;
    }


    /**
     * Gets the MONTO_DEL_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_CONVENIO
     */
    public java.lang.Long getMONTO_DEL_CONVENIO() {
        return MONTO_DEL_CONVENIO;
    }


    /**
     * Sets the MONTO_DEL_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_CONVENIO
     */
    public void setMONTO_DEL_CONVENIO(java.lang.Long MONTO_DEL_CONVENIO) {
        this.MONTO_DEL_CONVENIO = MONTO_DEL_CONVENIO;
    }


    /**
     * Gets the CANTIDAD_DE_GIROS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return CANTIDAD_DE_GIROS
     */
    public java.lang.Long getCANTIDAD_DE_GIROS() {
        return CANTIDAD_DE_GIROS;
    }


    /**
     * Sets the CANTIDAD_DE_GIROS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param CANTIDAD_DE_GIROS
     */
    public void setCANTIDAD_DE_GIROS(java.lang.Long CANTIDAD_DE_GIROS) {
        this.CANTIDAD_DE_GIROS = CANTIDAD_DE_GIROS;
    }


    /**
     * Gets the MONTO_DEL_GIRO_DE_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_GIRO_DE_CONVENIO
     */
    public java.lang.Long getMONTO_DEL_GIRO_DE_CONVENIO() {
        return MONTO_DEL_GIRO_DE_CONVENIO;
    }


    /**
     * Sets the MONTO_DEL_GIRO_DE_CONVENIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_GIRO_DE_CONVENIO
     */
    public void setMONTO_DEL_GIRO_DE_CONVENIO(java.lang.Long MONTO_DEL_GIRO_DE_CONVENIO) {
        this.MONTO_DEL_GIRO_DE_CONVENIO = MONTO_DEL_GIRO_DE_CONVENIO;
    }


    /**
     * Gets the CANTIDAD_DE_GIROS_VENCIDOS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return CANTIDAD_DE_GIROS_VENCIDOS
     */
    public java.lang.Long getCANTIDAD_DE_GIROS_VENCIDOS() {
        return CANTIDAD_DE_GIROS_VENCIDOS;
    }


    /**
     * Sets the CANTIDAD_DE_GIROS_VENCIDOS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param CANTIDAD_DE_GIROS_VENCIDOS
     */
    public void setCANTIDAD_DE_GIROS_VENCIDOS(java.lang.Long CANTIDAD_DE_GIROS_VENCIDOS) {
        this.CANTIDAD_DE_GIROS_VENCIDOS = CANTIDAD_DE_GIROS_VENCIDOS;
    }


    /**
     * Gets the FECHA_DEL_VENCIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DEL_VENCIDO
     */
    public java.lang.String getFECHA_DEL_VENCIDO() {
        return FECHA_DEL_VENCIDO;
    }


    /**
     * Sets the FECHA_DEL_VENCIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DEL_VENCIDO
     */
    public void setFECHA_DEL_VENCIDO(java.lang.String FECHA_DEL_VENCIDO) {
        this.FECHA_DEL_VENCIDO = FECHA_DEL_VENCIDO;
    }


    /**
     * Gets the INDICADOR_TELEFONO_ACTIVO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_TELEFONO_ACTIVO
     */
    public java.lang.String getINDICADOR_TELEFONO_ACTIVO() {
        return INDICADOR_TELEFONO_ACTIVO;
    }


    /**
     * Sets the INDICADOR_TELEFONO_ACTIVO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_TELEFONO_ACTIVO
     */
    public void setINDICADOR_TELEFONO_ACTIVO(java.lang.String INDICADOR_TELEFONO_ACTIVO) {
        this.INDICADOR_TELEFONO_ACTIVO = INDICADOR_TELEFONO_ACTIVO;
    }


    /**
     * Gets the FECHA_NOTIFICADOR value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_NOTIFICADOR
     */
    public java.lang.String getFECHA_NOTIFICADOR() {
        return FECHA_NOTIFICADOR;
    }


    /**
     * Sets the FECHA_NOTIFICADOR value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_NOTIFICADOR
     */
    public void setFECHA_NOTIFICADOR(java.lang.String FECHA_NOTIFICADOR) {
        this.FECHA_NOTIFICADOR = FECHA_NOTIFICADOR;
    }


    /**
     * Gets the INDICADOR_CORTE_RECONEXION value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_CORTE_RECONEXION
     */
    public java.lang.String getINDICADOR_CORTE_RECONEXION() {
        return INDICADOR_CORTE_RECONEXION;
    }


    /**
     * Sets the INDICADOR_CORTE_RECONEXION value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_CORTE_RECONEXION
     */
    public void setINDICADOR_CORTE_RECONEXION(java.lang.String INDICADOR_CORTE_RECONEXION) {
        this.INDICADOR_CORTE_RECONEXION = INDICADOR_CORTE_RECONEXION;
    }


    /**
     * Gets the CANTIDAD_DE_LLAMADAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return CANTIDAD_DE_LLAMADAS
     */
    public java.lang.Long getCANTIDAD_DE_LLAMADAS() {
        return CANTIDAD_DE_LLAMADAS;
    }


    /**
     * Sets the CANTIDAD_DE_LLAMADAS value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param CANTIDAD_DE_LLAMADAS
     */
    public void setCANTIDAD_DE_LLAMADAS(java.lang.Long CANTIDAD_DE_LLAMADAS) {
        this.CANTIDAD_DE_LLAMADAS = CANTIDAD_DE_LLAMADAS;
    }


    /**
     * Gets the CODIGO_RETORNO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return CODIGO_RETORNO
     */
    public java.lang.Long getCODIGO_RETORNO() {
        return CODIGO_RETORNO;
    }


    /**
     * Sets the CODIGO_RETORNO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param CODIGO_RETORNO
     */
    public void setCODIGO_RETORNO(java.lang.Long CODIGO_RETORNO) {
        this.CODIGO_RETORNO = CODIGO_RETORNO;
    }


    /**
     * Gets the INDICADOR_DE_INFORMACION_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_DE_INFORMACION_PREPAGO
     */
    public java.lang.String getINDICADOR_DE_INFORMACION_PREPAGO() {
        return INDICADOR_DE_INFORMACION_PREPAGO;
    }


    /**
     * Sets the INDICADOR_DE_INFORMACION_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_DE_INFORMACION_PREPAGO
     */
    public void setINDICADOR_DE_INFORMACION_PREPAGO(java.lang.String INDICADOR_DE_INFORMACION_PREPAGO) {
        this.INDICADOR_DE_INFORMACION_PREPAGO = INDICADOR_DE_INFORMACION_PREPAGO;
    }


    /**
     * Gets the INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO
     */
    public java.lang.String getINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO() {
        return INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO;
    }


    /**
     * Sets the INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO
     */
    public void setINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO(java.lang.String INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO) {
        this.INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO = INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO;
    }


    /**
     * Gets the FECHA_DE_SOLICITUD_DEL_RETIRO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return FECHA_DE_SOLICITUD_DEL_RETIRO
     */
    public java.lang.String getFECHA_DE_SOLICITUD_DEL_RETIRO() {
        return FECHA_DE_SOLICITUD_DEL_RETIRO;
    }


    /**
     * Sets the FECHA_DE_SOLICITUD_DEL_RETIRO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param FECHA_DE_SOLICITUD_DEL_RETIRO
     */
    public void setFECHA_DE_SOLICITUD_DEL_RETIRO(java.lang.String FECHA_DE_SOLICITUD_DEL_RETIRO) {
        this.FECHA_DE_SOLICITUD_DEL_RETIRO = FECHA_DE_SOLICITUD_DEL_RETIRO;
    }


    /**
     * Gets the DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO
     */
    public java.lang.String getDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO() {
        return DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO;
    }


    /**
     * Sets the DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO
     */
    public void setDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO(java.lang.String DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO) {
        this.DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO = DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO;
    }


    /**
     * Gets the INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO
     */
    public java.lang.String getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO() {
        return INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO;
    }


    /**
     * Sets the INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO
     */
    public void setINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO(java.lang.String INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO) {
        this.INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO = INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO;
    }


    /**
     * Gets the MONTO_DEL_LIMITE_DE_CREDITO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_LIMITE_DE_CREDITO
     */
    public java.lang.Long getMONTO_DEL_LIMITE_DE_CREDITO() {
        return MONTO_DEL_LIMITE_DE_CREDITO;
    }


    /**
     * Sets the MONTO_DEL_LIMITE_DE_CREDITO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_LIMITE_DE_CREDITO
     */
    public void setMONTO_DEL_LIMITE_DE_CREDITO(java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO) {
        this.MONTO_DEL_LIMITE_DE_CREDITO = MONTO_DEL_LIMITE_DE_CREDITO;
    }


    /**
     * Gets the MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO
     */
    public java.lang.Long getMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO() {
        return MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO;
    }


    /**
     * Sets the MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO
     */
    public void setMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO(java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO) {
        this.MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO = MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO;
    }


    /**
     * Gets the MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO
     */
    public java.lang.Long getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO() {
        return MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO;
    }


    /**
     * Sets the MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO
     */
    public void setMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO(java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO) {
        this.MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO = MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO;
    }


    /**
     * Gets the MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE
     */
    public java.lang.Long getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE() {
        return MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE;
    }


    /**
     * Sets the MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE
     */
    public void setMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE(java.lang.Long MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE) {
        this.MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE = MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE;
    }


    /**
     * Gets the NUMERO_DE_TELEFONO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return NUMERO_DE_TELEFONO
     */
    public java.lang.String getNUMERO_DE_TELEFONO() {
        return NUMERO_DE_TELEFONO;
    }


    /**
     * Sets the NUMERO_DE_TELEFONO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param NUMERO_DE_TELEFONO
     */
    public void setNUMERO_DE_TELEFONO(java.lang.String NUMERO_DE_TELEFONO) {
        this.NUMERO_DE_TELEFONO = NUMERO_DE_TELEFONO;
    }


    /**
     * Gets the INDICADOR_SERVICIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return INDICADOR_SERVICIO
     */
    public java.lang.String getINDICADOR_SERVICIO() {
        return INDICADOR_SERVICIO;
    }


    /**
     * Sets the INDICADOR_SERVICIO value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param INDICADOR_SERVICIO
     */
    public void setINDICADOR_SERVICIO(java.lang.String INDICADOR_SERVICIO) {
        this.INDICADOR_SERVICIO = INDICADOR_SERVICIO;
    }


    /**
     * Gets the DESCRIPCION_MOTIVO_DE_CORTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @return DESCRIPCION_MOTIVO_DE_CORTE
     */
    public java.lang.String getDESCRIPCION_MOTIVO_DE_CORTE() {
        return DESCRIPCION_MOTIVO_DE_CORTE;
    }


    /**
     * Sets the DESCRIPCION_MOTIVO_DE_CORTE value for this F2V5IVRAscObtenerMovimientosRP.
     * 
     * @param DESCRIPCION_MOTIVO_DE_CORTE
     */
    public void setDESCRIPCION_MOTIVO_DE_CORTE(java.lang.String DESCRIPCION_MOTIVO_DE_CORTE) {
        this.DESCRIPCION_MOTIVO_DE_CORTE = DESCRIPCION_MOTIVO_DE_CORTE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof F2V5IVRAscObtenerMovimientosRP)) return false;
        F2V5IVRAscObtenerMovimientosRP other = (F2V5IVRAscObtenerMovimientosRP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODIGO_DE_AREA==null && other.getCODIGO_DE_AREA()==null) || 
             (this.CODIGO_DE_AREA!=null &&
              this.CODIGO_DE_AREA.equals(other.getCODIGO_DE_AREA()))) &&
            ((this.TELEFONO==null && other.getTELEFONO()==null) || 
             (this.TELEFONO!=null &&
              this.TELEFONO.equals(other.getTELEFONO()))) &&
            ((this.FECHA_DE_LA_DEUDA_1==null && other.getFECHA_DE_LA_DEUDA_1()==null) || 
             (this.FECHA_DE_LA_DEUDA_1!=null &&
              this.FECHA_DE_LA_DEUDA_1.equals(other.getFECHA_DE_LA_DEUDA_1()))) &&
            ((this.MONTO_DE_LA_DEUDA_1==null && other.getMONTO_DE_LA_DEUDA_1()==null) || 
             (this.MONTO_DE_LA_DEUDA_1!=null &&
              this.MONTO_DE_LA_DEUDA_1.equals(other.getMONTO_DE_LA_DEUDA_1()))) &&
            ((this.FECHA_DE_LA_DEUDA_2==null && other.getFECHA_DE_LA_DEUDA_2()==null) || 
             (this.FECHA_DE_LA_DEUDA_2!=null &&
              this.FECHA_DE_LA_DEUDA_2.equals(other.getFECHA_DE_LA_DEUDA_2()))) &&
            ((this.MONTO_DE_LA_DEUDA_2==null && other.getMONTO_DE_LA_DEUDA_2()==null) || 
             (this.MONTO_DE_LA_DEUDA_2!=null &&
              this.MONTO_DE_LA_DEUDA_2.equals(other.getMONTO_DE_LA_DEUDA_2()))) &&
            ((this.FECHA_DE_LA_DEUDA_3==null && other.getFECHA_DE_LA_DEUDA_3()==null) || 
             (this.FECHA_DE_LA_DEUDA_3!=null &&
              this.FECHA_DE_LA_DEUDA_3.equals(other.getFECHA_DE_LA_DEUDA_3()))) &&
            ((this.MONTO_DE_LA_DEUDA_3==null && other.getMONTO_DE_LA_DEUDA_3()==null) || 
             (this.MONTO_DE_LA_DEUDA_3!=null &&
              this.MONTO_DE_LA_DEUDA_3.equals(other.getMONTO_DE_LA_DEUDA_3()))) &&
            ((this.FECHA_DE_LA_DEUDA_4==null && other.getFECHA_DE_LA_DEUDA_4()==null) || 
             (this.FECHA_DE_LA_DEUDA_4!=null &&
              this.FECHA_DE_LA_DEUDA_4.equals(other.getFECHA_DE_LA_DEUDA_4()))) &&
            ((this.MONTO_DE_LA_DEUDA_4==null && other.getMONTO_DE_LA_DEUDA_4()==null) || 
             (this.MONTO_DE_LA_DEUDA_4!=null &&
              this.MONTO_DE_LA_DEUDA_4.equals(other.getMONTO_DE_LA_DEUDA_4()))) &&
            ((this.FECHA_DE_LA_DEUDA_5==null && other.getFECHA_DE_LA_DEUDA_5()==null) || 
             (this.FECHA_DE_LA_DEUDA_5!=null &&
              this.FECHA_DE_LA_DEUDA_5.equals(other.getFECHA_DE_LA_DEUDA_5()))) &&
            ((this.MONTO_DE_LA_DEUDA_5==null && other.getMONTO_DE_LA_DEUDA_5()==null) || 
             (this.MONTO_DE_LA_DEUDA_5!=null &&
              this.MONTO_DE_LA_DEUDA_5.equals(other.getMONTO_DE_LA_DEUDA_5()))) &&
            ((this.FECHA_DE_LA_DEUDA_6==null && other.getFECHA_DE_LA_DEUDA_6()==null) || 
             (this.FECHA_DE_LA_DEUDA_6!=null &&
              this.FECHA_DE_LA_DEUDA_6.equals(other.getFECHA_DE_LA_DEUDA_6()))) &&
            ((this.MONTO_DE_LA_DEUDA_6==null && other.getMONTO_DE_LA_DEUDA_6()==null) || 
             (this.MONTO_DE_LA_DEUDA_6!=null &&
              this.MONTO_DE_LA_DEUDA_6.equals(other.getMONTO_DE_LA_DEUDA_6()))) &&
            ((this.MONTO_TOTAL_PENDIENTE==null && other.getMONTO_TOTAL_PENDIENTE()==null) || 
             (this.MONTO_TOTAL_PENDIENTE!=null &&
              this.MONTO_TOTAL_PENDIENTE.equals(other.getMONTO_TOTAL_PENDIENTE()))) &&
            ((this.NOMBRE_DEL_CLIENTE==null && other.getNOMBRE_DEL_CLIENTE()==null) || 
             (this.NOMBRE_DEL_CLIENTE!=null &&
              this.NOMBRE_DEL_CLIENTE.equals(other.getNOMBRE_DEL_CLIENTE()))) &&
            ((this.TIPO_CLIENTE==null && other.getTIPO_CLIENTE()==null) || 
             (this.TIPO_CLIENTE!=null &&
              this.TIPO_CLIENTE.equals(other.getTIPO_CLIENTE()))) &&
            ((this.TIPO_SERVICIO==null && other.getTIPO_SERVICIO()==null) || 
             (this.TIPO_SERVICIO!=null &&
              this.TIPO_SERVICIO.equals(other.getTIPO_SERVICIO()))) &&
            ((this.FECHA_VENCIMIENTO_DE_FACTURA==null && other.getFECHA_VENCIMIENTO_DE_FACTURA()==null) || 
             (this.FECHA_VENCIMIENTO_DE_FACTURA!=null &&
              this.FECHA_VENCIMIENTO_DE_FACTURA.equals(other.getFECHA_VENCIMIENTO_DE_FACTURA()))) &&
            ((this.MONTO_MORA_A_30_DIAS==null && other.getMONTO_MORA_A_30_DIAS()==null) || 
             (this.MONTO_MORA_A_30_DIAS!=null &&
              this.MONTO_MORA_A_30_DIAS.equals(other.getMONTO_MORA_A_30_DIAS()))) &&
            ((this.FECHA_DE_LA_MORA_A_30_DIAS==null && other.getFECHA_DE_LA_MORA_A_30_DIAS()==null) || 
             (this.FECHA_DE_LA_MORA_A_30_DIAS!=null &&
              this.FECHA_DE_LA_MORA_A_30_DIAS.equals(other.getFECHA_DE_LA_MORA_A_30_DIAS()))) &&
            ((this.MONTO_MORA_A_60_DIAS==null && other.getMONTO_MORA_A_60_DIAS()==null) || 
             (this.MONTO_MORA_A_60_DIAS!=null &&
              this.MONTO_MORA_A_60_DIAS.equals(other.getMONTO_MORA_A_60_DIAS()))) &&
            ((this.FECHA_DE_LA_MORA_60_DIAS==null && other.getFECHA_DE_LA_MORA_60_DIAS()==null) || 
             (this.FECHA_DE_LA_MORA_60_DIAS!=null &&
              this.FECHA_DE_LA_MORA_60_DIAS.equals(other.getFECHA_DE_LA_MORA_60_DIAS()))) &&
            ((this.MONTO_MORA_A_90_DIAS==null && other.getMONTO_MORA_A_90_DIAS()==null) || 
             (this.MONTO_MORA_A_90_DIAS!=null &&
              this.MONTO_MORA_A_90_DIAS.equals(other.getMONTO_MORA_A_90_DIAS()))) &&
            ((this.FECHA_DE_LA_MORA_90_DIAS==null && other.getFECHA_DE_LA_MORA_90_DIAS()==null) || 
             (this.FECHA_DE_LA_MORA_90_DIAS!=null &&
              this.FECHA_DE_LA_MORA_90_DIAS.equals(other.getFECHA_DE_LA_MORA_90_DIAS()))) &&
            ((this.FECHA_ULTIMA_FACTURA==null && other.getFECHA_ULTIMA_FACTURA()==null) || 
             (this.FECHA_ULTIMA_FACTURA!=null &&
              this.FECHA_ULTIMA_FACTURA.equals(other.getFECHA_ULTIMA_FACTURA()))) &&
            ((this.INDICADOR_DE_INFORMACION_CONVENIO==null && other.getINDICADOR_DE_INFORMACION_CONVENIO()==null) || 
             (this.INDICADOR_DE_INFORMACION_CONVENIO!=null &&
              this.INDICADOR_DE_INFORMACION_CONVENIO.equals(other.getINDICADOR_DE_INFORMACION_CONVENIO()))) &&
            ((this.NUMERO_DE_CUENTA==null && other.getNUMERO_DE_CUENTA()==null) || 
             (this.NUMERO_DE_CUENTA!=null &&
              this.NUMERO_DE_CUENTA.equals(other.getNUMERO_DE_CUENTA()))) &&
            ((this.MONTO_DEL_SALDO_CONVENIO==null && other.getMONTO_DEL_SALDO_CONVENIO()==null) || 
             (this.MONTO_DEL_SALDO_CONVENIO!=null &&
              this.MONTO_DEL_SALDO_CONVENIO.equals(other.getMONTO_DEL_SALDO_CONVENIO()))) &&
            ((this.MONTO_DEL_CONVENIO==null && other.getMONTO_DEL_CONVENIO()==null) || 
             (this.MONTO_DEL_CONVENIO!=null &&
              this.MONTO_DEL_CONVENIO.equals(other.getMONTO_DEL_CONVENIO()))) &&
            ((this.CANTIDAD_DE_GIROS==null && other.getCANTIDAD_DE_GIROS()==null) || 
             (this.CANTIDAD_DE_GIROS!=null &&
              this.CANTIDAD_DE_GIROS.equals(other.getCANTIDAD_DE_GIROS()))) &&
            ((this.MONTO_DEL_GIRO_DE_CONVENIO==null && other.getMONTO_DEL_GIRO_DE_CONVENIO()==null) || 
             (this.MONTO_DEL_GIRO_DE_CONVENIO!=null &&
              this.MONTO_DEL_GIRO_DE_CONVENIO.equals(other.getMONTO_DEL_GIRO_DE_CONVENIO()))) &&
            ((this.CANTIDAD_DE_GIROS_VENCIDOS==null && other.getCANTIDAD_DE_GIROS_VENCIDOS()==null) || 
             (this.CANTIDAD_DE_GIROS_VENCIDOS!=null &&
              this.CANTIDAD_DE_GIROS_VENCIDOS.equals(other.getCANTIDAD_DE_GIROS_VENCIDOS()))) &&
            ((this.FECHA_DEL_VENCIDO==null && other.getFECHA_DEL_VENCIDO()==null) || 
             (this.FECHA_DEL_VENCIDO!=null &&
              this.FECHA_DEL_VENCIDO.equals(other.getFECHA_DEL_VENCIDO()))) &&
            ((this.INDICADOR_TELEFONO_ACTIVO==null && other.getINDICADOR_TELEFONO_ACTIVO()==null) || 
             (this.INDICADOR_TELEFONO_ACTIVO!=null &&
              this.INDICADOR_TELEFONO_ACTIVO.equals(other.getINDICADOR_TELEFONO_ACTIVO()))) &&
            ((this.FECHA_NOTIFICADOR==null && other.getFECHA_NOTIFICADOR()==null) || 
             (this.FECHA_NOTIFICADOR!=null &&
              this.FECHA_NOTIFICADOR.equals(other.getFECHA_NOTIFICADOR()))) &&
            ((this.INDICADOR_CORTE_RECONEXION==null && other.getINDICADOR_CORTE_RECONEXION()==null) || 
             (this.INDICADOR_CORTE_RECONEXION!=null &&
              this.INDICADOR_CORTE_RECONEXION.equals(other.getINDICADOR_CORTE_RECONEXION()))) &&
            ((this.CANTIDAD_DE_LLAMADAS==null && other.getCANTIDAD_DE_LLAMADAS()==null) || 
             (this.CANTIDAD_DE_LLAMADAS!=null &&
              this.CANTIDAD_DE_LLAMADAS.equals(other.getCANTIDAD_DE_LLAMADAS()))) &&
            ((this.CODIGO_RETORNO==null && other.getCODIGO_RETORNO()==null) || 
             (this.CODIGO_RETORNO!=null &&
              this.CODIGO_RETORNO.equals(other.getCODIGO_RETORNO()))) &&
            ((this.INDICADOR_DE_INFORMACION_PREPAGO==null && other.getINDICADOR_DE_INFORMACION_PREPAGO()==null) || 
             (this.INDICADOR_DE_INFORMACION_PREPAGO!=null &&
              this.INDICADOR_DE_INFORMACION_PREPAGO.equals(other.getINDICADOR_DE_INFORMACION_PREPAGO()))) &&
            ((this.INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO==null && other.getINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO()==null) || 
             (this.INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO!=null &&
              this.INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO.equals(other.getINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO()))) &&
            ((this.FECHA_DE_SOLICITUD_DEL_RETIRO==null && other.getFECHA_DE_SOLICITUD_DEL_RETIRO()==null) || 
             (this.FECHA_DE_SOLICITUD_DEL_RETIRO!=null &&
              this.FECHA_DE_SOLICITUD_DEL_RETIRO.equals(other.getFECHA_DE_SOLICITUD_DEL_RETIRO()))) &&
            ((this.DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO==null && other.getDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO()==null) || 
             (this.DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO!=null &&
              this.DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO.equals(other.getDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO()))) &&
            ((this.INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO==null && other.getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO()==null) || 
             (this.INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO!=null &&
              this.INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO.equals(other.getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO()))) &&
            ((this.MONTO_DEL_LIMITE_DE_CREDITO==null && other.getMONTO_DEL_LIMITE_DE_CREDITO()==null) || 
             (this.MONTO_DEL_LIMITE_DE_CREDITO!=null &&
              this.MONTO_DEL_LIMITE_DE_CREDITO.equals(other.getMONTO_DEL_LIMITE_DE_CREDITO()))) &&
            ((this.MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO==null && other.getMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO()==null) || 
             (this.MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO!=null &&
              this.MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO.equals(other.getMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO()))) &&
            ((this.MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO==null && other.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO()==null) || 
             (this.MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO!=null &&
              this.MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO.equals(other.getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO()))) &&
            ((this.MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE==null && other.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE()==null) || 
             (this.MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE!=null &&
              this.MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE.equals(other.getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE()))) &&
            ((this.NUMERO_DE_TELEFONO==null && other.getNUMERO_DE_TELEFONO()==null) || 
             (this.NUMERO_DE_TELEFONO!=null &&
              this.NUMERO_DE_TELEFONO.equals(other.getNUMERO_DE_TELEFONO()))) &&
            ((this.INDICADOR_SERVICIO==null && other.getINDICADOR_SERVICIO()==null) || 
             (this.INDICADOR_SERVICIO!=null &&
              this.INDICADOR_SERVICIO.equals(other.getINDICADOR_SERVICIO()))) &&
            ((this.DESCRIPCION_MOTIVO_DE_CORTE==null && other.getDESCRIPCION_MOTIVO_DE_CORTE()==null) || 
             (this.DESCRIPCION_MOTIVO_DE_CORTE!=null &&
              this.DESCRIPCION_MOTIVO_DE_CORTE.equals(other.getDESCRIPCION_MOTIVO_DE_CORTE())));
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
        if (getCODIGO_DE_AREA() != null) {
            _hashCode += getCODIGO_DE_AREA().hashCode();
        }
        if (getTELEFONO() != null) {
            _hashCode += getTELEFONO().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_1() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_1().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_1() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_1().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_2() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_2().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_2() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_2().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_3() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_3().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_3() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_3().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_4() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_4().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_4() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_4().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_5() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_5().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_5() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_5().hashCode();
        }
        if (getFECHA_DE_LA_DEUDA_6() != null) {
            _hashCode += getFECHA_DE_LA_DEUDA_6().hashCode();
        }
        if (getMONTO_DE_LA_DEUDA_6() != null) {
            _hashCode += getMONTO_DE_LA_DEUDA_6().hashCode();
        }
        if (getMONTO_TOTAL_PENDIENTE() != null) {
            _hashCode += getMONTO_TOTAL_PENDIENTE().hashCode();
        }
        if (getNOMBRE_DEL_CLIENTE() != null) {
            _hashCode += getNOMBRE_DEL_CLIENTE().hashCode();
        }
        if (getTIPO_CLIENTE() != null) {
            _hashCode += getTIPO_CLIENTE().hashCode();
        }
        if (getTIPO_SERVICIO() != null) {
            _hashCode += getTIPO_SERVICIO().hashCode();
        }
        if (getFECHA_VENCIMIENTO_DE_FACTURA() != null) {
            _hashCode += getFECHA_VENCIMIENTO_DE_FACTURA().hashCode();
        }
        if (getMONTO_MORA_A_30_DIAS() != null) {
            _hashCode += getMONTO_MORA_A_30_DIAS().hashCode();
        }
        if (getFECHA_DE_LA_MORA_A_30_DIAS() != null) {
            _hashCode += getFECHA_DE_LA_MORA_A_30_DIAS().hashCode();
        }
        if (getMONTO_MORA_A_60_DIAS() != null) {
            _hashCode += getMONTO_MORA_A_60_DIAS().hashCode();
        }
        if (getFECHA_DE_LA_MORA_60_DIAS() != null) {
            _hashCode += getFECHA_DE_LA_MORA_60_DIAS().hashCode();
        }
        if (getMONTO_MORA_A_90_DIAS() != null) {
            _hashCode += getMONTO_MORA_A_90_DIAS().hashCode();
        }
        if (getFECHA_DE_LA_MORA_90_DIAS() != null) {
            _hashCode += getFECHA_DE_LA_MORA_90_DIAS().hashCode();
        }
        if (getFECHA_ULTIMA_FACTURA() != null) {
            _hashCode += getFECHA_ULTIMA_FACTURA().hashCode();
        }
        if (getINDICADOR_DE_INFORMACION_CONVENIO() != null) {
            _hashCode += getINDICADOR_DE_INFORMACION_CONVENIO().hashCode();
        }
        if (getNUMERO_DE_CUENTA() != null) {
            _hashCode += getNUMERO_DE_CUENTA().hashCode();
        }
        if (getMONTO_DEL_SALDO_CONVENIO() != null) {
            _hashCode += getMONTO_DEL_SALDO_CONVENIO().hashCode();
        }
        if (getMONTO_DEL_CONVENIO() != null) {
            _hashCode += getMONTO_DEL_CONVENIO().hashCode();
        }
        if (getCANTIDAD_DE_GIROS() != null) {
            _hashCode += getCANTIDAD_DE_GIROS().hashCode();
        }
        if (getMONTO_DEL_GIRO_DE_CONVENIO() != null) {
            _hashCode += getMONTO_DEL_GIRO_DE_CONVENIO().hashCode();
        }
        if (getCANTIDAD_DE_GIROS_VENCIDOS() != null) {
            _hashCode += getCANTIDAD_DE_GIROS_VENCIDOS().hashCode();
        }
        if (getFECHA_DEL_VENCIDO() != null) {
            _hashCode += getFECHA_DEL_VENCIDO().hashCode();
        }
        if (getINDICADOR_TELEFONO_ACTIVO() != null) {
            _hashCode += getINDICADOR_TELEFONO_ACTIVO().hashCode();
        }
        if (getFECHA_NOTIFICADOR() != null) {
            _hashCode += getFECHA_NOTIFICADOR().hashCode();
        }
        if (getINDICADOR_CORTE_RECONEXION() != null) {
            _hashCode += getINDICADOR_CORTE_RECONEXION().hashCode();
        }
        if (getCANTIDAD_DE_LLAMADAS() != null) {
            _hashCode += getCANTIDAD_DE_LLAMADAS().hashCode();
        }
        if (getCODIGO_RETORNO() != null) {
            _hashCode += getCODIGO_RETORNO().hashCode();
        }
        if (getINDICADOR_DE_INFORMACION_PREPAGO() != null) {
            _hashCode += getINDICADOR_DE_INFORMACION_PREPAGO().hashCode();
        }
        if (getINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO() != null) {
            _hashCode += getINDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO().hashCode();
        }
        if (getFECHA_DE_SOLICITUD_DEL_RETIRO() != null) {
            _hashCode += getFECHA_DE_SOLICITUD_DEL_RETIRO().hashCode();
        }
        if (getDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO() != null) {
            _hashCode += getDESCRIPCION_MOTIVO_DE_CORTE_PREPAGO().hashCode();
        }
        if (getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO() != null) {
            _hashCode += getINDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO().hashCode();
        }
        if (getMONTO_DEL_LIMITE_DE_CREDITO() != null) {
            _hashCode += getMONTO_DEL_LIMITE_DE_CREDITO().hashCode();
        }
        if (getMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO() != null) {
            _hashCode += getMONTO_DEL_LIMITE_DE_CREDITO_VENCIDO().hashCode();
        }
        if (getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO() != null) {
            _hashCode += getMONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO().hashCode();
        }
        if (getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE() != null) {
            _hashCode += getMONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE().hashCode();
        }
        if (getNUMERO_DE_TELEFONO() != null) {
            _hashCode += getNUMERO_DE_TELEFONO().hashCode();
        }
        if (getINDICADOR_SERVICIO() != null) {
            _hashCode += getINDICADOR_SERVICIO().hashCode();
        }
        if (getDESCRIPCION_MOTIVO_DE_CORTE() != null) {
            _hashCode += getDESCRIPCION_MOTIVO_DE_CORTE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(F2V5IVRAscObtenerMovimientosRP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://obtenerMovimientosCent", "F2V5IVRAscObtenerMovimientosRP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_DE_AREA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_DE_AREA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELEFONO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TELEFONO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_DEUDA_6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_DEUDA_6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DE_LA_DEUDA_6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DE_LA_DEUDA_6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_TOTAL_PENDIENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_TOTAL_PENDIENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOMBRE_DEL_CLIENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOMBRE_DEL_CLIENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_CLIENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_CLIENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIPO_SERVICIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIPO_SERVICIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_VENCIMIENTO_DE_FACTURA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_VENCIMIENTO_DE_FACTURA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_MORA_A_30_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_MORA_A_30_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_MORA_A_30_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_MORA_A_30_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_MORA_A_60_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_MORA_A_60_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_MORA_60_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_MORA_60_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_MORA_A_90_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_MORA_A_90_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_LA_MORA_90_DIAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_LA_MORA_90_DIAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_ULTIMA_FACTURA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_ULTIMA_FACTURA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_DE_INFORMACION_CONVENIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_DE_INFORMACION_CONVENIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO_DE_CUENTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO_DE_CUENTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_SALDO_CONVENIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_SALDO_CONVENIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_CONVENIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_CONVENIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CANTIDAD_DE_GIROS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CANTIDAD_DE_GIROS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_GIRO_DE_CONVENIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_GIRO_DE_CONVENIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CANTIDAD_DE_GIROS_VENCIDOS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CANTIDAD_DE_GIROS_VENCIDOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DEL_VENCIDO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DEL_VENCIDO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_TELEFONO_ACTIVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_TELEFONO_ACTIVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_NOTIFICADOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_NOTIFICADOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_CORTE_RECONEXION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_CORTE_RECONEXION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CANTIDAD_DE_LLAMADAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CANTIDAD_DE_LLAMADAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODIGO_RETORNO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CODIGO_RETORNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_DE_INFORMACION_PREPAGO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_DE_INFORMACION_PREPAGO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_CORTE_RECONEXION_PARA_EL_PREPAGO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FECHA_DE_SOLICITUD_DEL_RETIRO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FECHA_DE_SOLICITUD_DEL_RETIRO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRIPCION_MOTIVO_DE_CORTE_PREPAGO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_DE_INFORMACION_LIMITE_DE_CREDITO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_LIMITE_DE_CREDITO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_LIMITE_DE_CREDITO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_LIMITE_DE_CREDITO_VENCIDO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_LIMITE_DE_CREDITO_CONSUMIDO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MONTO_DEL_LIMITE_DE_CREDITO_PENDIENTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NUMERO_DE_TELEFONO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NUMERO_DE_TELEFONO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDICADOR_SERVICIO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "INDICADOR_SERVICIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPCION_MOTIVO_DE_CORTE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRIPCION_MOTIVO_DE_CORTE"));
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
