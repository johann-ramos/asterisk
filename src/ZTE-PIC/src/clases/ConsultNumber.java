package clases;

import java.rmi.RemoteException;

import muleconsultarordenivr.AP719ConsultarOrdenIVRProxy;
import muleconsultarordenivr.ConsultarOrdenIVRRQ;
import obtenerMovimientosCent.*;

import org.apache.axis.AxisFault;
import org.asteriskjava.fastagi.*;

import com.cantv.sacas.integracion.obtenerHistoriaTelefono.CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy;
import com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP;
import com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRQ;

import consultarcliente.CU683ConsultarClienteBOSSProxy;
import consultarcliente.ConsultarClienteRP;
import consultarcliente.ConsultarClienteRQ;
import response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RP;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse;
import NAP_Asc_obtenerSaldoCuenta.Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element;
import ObtenerTipoTarifa_pkg.LP502ObtenerTipoTarifaProxy;
import ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP;
import ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRQ;
import Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware.F2V5_NAP_Asc_obtenerSaldoCuenta_RQ;
import canonicoconsultarordenivr.ConsultarOrdenIVRRP;
import cantv.arquitectura.asc.contratos.exceptions.*;
import cantvpic.notificaciondeaverias.GI113NotificacionDeAveriasProxy;
import cantvpic.notificaciondeaverias.NotificacionDeAveriaRP;
import cantvpic.notificaciondeaverias.NotificacionDeAveriaRQ;

public class ConsultNumber extends BaseAgiScript{

	private String codigoArea = null;
	private String numeroDestino = null;
	private int servicio = 0;
	private String SALDO = "";
	private String TIPO = "";
	private String ID_ORDEN = "";
	private String STATUS_ORDEN = "";
	
	public ConsultNumber() {
		
	}

	@Override
	public void service(AgiRequest request, AgiChannel arg1) throws AgiException {
		codigoArea = request.getParameter("COD");
		numeroDestino = request.getParameter("NUMDES");
		servicio = Integer.parseInt(request.getParameter("SERVICIO"));
		
		if(!codigoArea.equals("") && !numeroDestino.equals("") && codigoArea != null  && numeroDestino != null  && servicio != 0){
			// Lama al servicio correspondiente
			switch (servicio) {
			case 1:// Consulta Obtener Movimientos
				if(obtenerMovimietos(codigoArea,numeroDestino)){
					setVariable("CONTINUAR", "1");
				}else{
					setVariable("CONTINUAR", "0");
				}
				break;
			case 2: // Consulta Obtener Tipo Tarifa
				if(obtenerTipoTarifa(codigoArea, numeroDestino)){
					setVariable("CONTINUAR", "1");
					setVariable("TIPO", getTIPO());
				}else{
					setVariable("CONTINUAR", "0");
				}
				break;
			case 3:// Consulta Saldo
				if(consultaSaldo(codigoArea, numeroDestino)){
					setVariable("SALDO", getSALDO());
					setVariable("CONTINUAR", "1");
				}else{
					if(getTIPO().equalsIgnoreCase("")){
						setVariable("TIPO", "2");
					}
					setVariable("CONTINUAR", "0");
				}
				break;
			case 4: // Consulta Estatus de linea
				break;
			case 5: //Consulta Estatus de internet
				break;
			case 6: //Consulta Averia de Linea
				break;
			case 7:// Consulta de Internet
				break;
			case 8: // Consulta Averia de internet
				break;
			case 9:// Consulta Television
				break;
			}
			
				
			
		}else{
			throw new AgiException("Uno de los parametros esta vacio o es null");
		}
	}
	
	
	/**
	 * Metodo para consultar si el cliente es residencial o juridico, tambien se verifica si el 
	 * servicio del cliente esta activo
	 * @return booleano verdadero o falso
	 */
	public boolean obtenerMovimietos(String codigoDeArea, String numeroTelefonico) throws AgiException{
		F2V5IVRAscObtenerMovimientosRP response = null;
		// http://picprod.cantv.com.ve:8080/axis/services/PG558_obtenerMovimientosII?wsdl
		try {
			Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxy = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
			F2V5IVRAscObtenerMovimientosRQ parametros = new F2V5IVRAscObtenerMovimientosRQ();
			parametros.setAREA_CODE(Long.parseLong(codigoDeArea));
			parametros.setTELNUM(Long.parseLong(numeroTelefonico));
			response = proxy.obtenerMovimientos(parametros);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		} 
		System.out.println(response.getNOMBRE_DEL_CLIENTE());
		System.out.println(response.getTIPO_CLIENTE());
		if (response.getTIPO_CLIENTE().equalsIgnoreCase("R")
				|| response.getTIPO_CLIENTE()
						.equalsIgnoreCase("B")
				&& response.getINDICADOR_TELEFONO_ACTIVO().equalsIgnoreCase("S")) {
			System.out.println("Esta Activo");
			return true;
		}
		return false;
	}
	
	/***
	 * 
	 * @param codigoDeArea
	 * @param numeroTelefonico
	 * @return
	 */
	public boolean obtenerTipoTarifa(String codigoDeArea, String numeroTelefonico){
		ObtenerTipoTarifaRP response = null;
		LP502ObtenerTipoTarifaProxy proxy = new LP502ObtenerTipoTarifaProxy();
		ObtenerTipoTarifaRQ request = new ObtenerTipoTarifaRQ();
		request.setAREA_CODE(Long.parseLong(codigoDeArea));
		request.setTELNUM(Long.parseLong(numeroTelefonico));
		try {
			response = proxy.obtenerTipoTarifa(request);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if(response != null){
			if(response.getINDICADOR_SERVICIO().equals(" ")){
				return false;
			}else{
				setTIPO(response.getINDICADOR_SERVICIO());
				return true;
			}
			
		}
		return false;
	}
	
	/***
	 * Metodo para consultar saldo, Verifica si es postpago yo prepago y retorna el saldo del cliente
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean consultaSaldo(String codigoDeArea, String numDestino){
		try {
			// 1.- Obtener Movimientos -  verificar que el numero exista
			F2V5IVRAscObtenerMovimientosRP response = null;
			Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxy = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
			F2V5IVRAscObtenerMovimientosRQ parametros = new F2V5IVRAscObtenerMovimientosRQ();
			parametros.setAREA_CODE(Long.parseLong(codigoDeArea));
			parametros.setTELNUM(Long.parseLong(numDestino));
			response = proxy.obtenerMovimientos(parametros);
			if(!response.getINDICADOR_TELEFONO_ACTIVO().equalsIgnoreCase("S")){
				return false;
			}else{
				//System.out.println("Esta activo");
			}
			// 2.- Obtener tipo tarifa - Verificar si es postpago  o pregago
			ObtenerTipoTarifaRP responseTarifa = null;
			LP502ObtenerTipoTarifaProxy proxyTarifa = new LP502ObtenerTipoTarifaProxy();
			ObtenerTipoTarifaRQ request = new ObtenerTipoTarifaRQ();
			request.setAREA_CODE(Long.parseLong(codigoDeArea));
			request.setTELNUM(Long.parseLong(numDestino));
			responseTarifa = proxyTarifa.obtenerTipoTarifa(request);
			if(!responseTarifa.getINDICADOR_SERVICIO().equalsIgnoreCase("1")){
				return false;
			}else{
				setTIPO("2");//Setea el tipo del numero esto dice que es prepago
			}
			// 3.- Consulta de saldo (traer el saldo actual si es postpago)
			Serviciof2V5_NAP_Asc_obtenerSaldoCuentaResponse responseSaldoNAP = null;
			Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element element = null;
			Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy proxySaldo = new Serviciof2V5_NAP_Asc_obtenerSaldoCuentaProxy();
			F2V5_NAP_Asc_obtenerSaldoCuenta_RQ requestSaldo = new F2V5_NAP_Asc_obtenerSaldoCuenta_RQ();
			F2V5_NAP_Asc_obtenerSaldoCuenta_RP responseSaldo = null;
			requestSaldo.setCodigoArea(codigoDeArea);
			requestSaldo.setTelefono(numDestino);
			requestSaldo.setAplicacion("NAP");
			element =  new Serviciof2V5_NAP_Asc_obtenerSaldoCuenta_Element(requestSaldo);
			responseSaldoNAP = proxySaldo.serviciof2V5_NAP_Asc_obtenerSaldoCuenta(element);
			responseSaldo = responseSaldoNAP.getF2V5_NAP_ASC_OBTENERSALDOCUENTA_RP();
			if(responseSaldo != null){
				setSALDO(responseSaldo.getSaldoActual().toString());
				//System.out.println("Saldo: "+ responseSaldo.getSaldoActual().toString());
				return true;
			}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/***
	 * 
	 * @param idOrden
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean estatusDeLinea(String idOrden,String codigoDeArea, String numDestino){
		// 1.- Tipo Tarifa - verificar que este activo
		System.out.println("En el metodo");
		try {
//			ObtenerTipoTarifaRP responseTarifa = null;
//			LP502ObtenerTipoTarifaProxy proxyTarifa = new LP502ObtenerTipoTarifaProxy();
//			ObtenerTipoTarifaRQ request = new ObtenerTipoTarifaRQ();
//			request.setAREA_CODE(Long.parseLong(codigoDeArea));
//			request.setTELNUM(Long.parseLong(numDestino));
//			responseTarifa = proxyTarifa.obtenerTipoTarifa(request);
//			if(!responseTarifa.getINDICADOR_SERVICIO().equalsIgnoreCase("1")){
//				System.out.println(responseTarifa.getINDICADOR_SERVICIO());
//				return false;
//			}else{
				System.out.println("Es residencial");
				// 2.- Consulta orden IVR - Verifico si la orden existe. con el numero o la orden
				ConsultarOrdenIVRRP responseIVR = null;
				AP719ConsultarOrdenIVRProxy proxyIVR = new AP719ConsultarOrdenIVRProxy();
				ConsultarOrdenIVRRQ requestIVR = new ConsultarOrdenIVRRQ();
				if(idOrden.equalsIgnoreCase("")){
					System.out.println("Sin numero de orden");
					requestIVR.setNumeroTelefono(codigoDeArea+numDestino);
				}else{
					System.out.println("Con numero de orden");
					requestIVR.setIDOrden(idOrden);
				}
				responseIVR = proxyIVR.consultarOrdenIVR(requestIVR);
				if(responseIVR != null){
					System.out.println("Es diferente de null");
					System.out.println(responseIVR.getOrden_boss());
					System.out.println(responseIVR.getCedula_asap());
					return true;
				}else{
					System.out.println("Es igual de null");
				}
			//}
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		//retornar Si la orden existe
		return false;
	}
	
	/***
	 * 
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean estatusDeInternet(String codigoDeArea, String numDestino){
		// 1.- Tipo Tarifa - verificar que este activo
//		ObtenerTipoTarifaRP responseTarifa = null;
//		LP502ObtenerTipoTarifaProxy proxyTarifa = new LP502ObtenerTipoTarifaProxy();
//		ObtenerTipoTarifaRQ request = new ObtenerTipoTarifaRQ();
//		request.setAREA_CODE(Long.parseLong(codigoDeArea));
//		request.setTELNUM(Long.parseLong(numDestino));
//		responseTarifa = proxyTarifa.obtenerTipoTarifa(request);
//		if(!responseTarifa.getINDICADOR_SERVICIO().equalsIgnoreCase("1")){
//			System.out.println(responseTarifa.getINDICADOR_SERVICIO());
//			return false;
//		}else{
//			
//		}
		// 2.- Consulta orden IVR - Verifico que estatus tiene la orden si el estatus es igual 399/400 retorno el idorden sino retorno el status de la orden
		try {
			ConsultarOrdenIVRRP responseIVR = null;
			AP719ConsultarOrdenIVRProxy proxyIVR = new AP719ConsultarOrdenIVRProxy();
			ConsultarOrdenIVRRQ requestIVR = new ConsultarOrdenIVRRQ();
			requestIVR.setNumeroTelefono(codigoDeArea+numDestino);
			responseIVR = proxyIVR.consultarOrdenIVR(requestIVR);
			if(responseIVR != null){
				if(responseIVR.getStatus_orden_asap().equalsIgnoreCase("399") || responseIVR.getStatus_orden_asap().equalsIgnoreCase("400")){
					//TODO: Setear el id orden
					
				}else{
					System.out.println(responseIVR.getStatus_orden());
				}
				return true;
			}else{
				System.out.println("Es igual de null");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/***
	 * 
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean statusAveriaDeLinea(String codigoDeArea, String numDestino,String aplicativo, String usuario){
		
		try {
			// 1.- Tipo Tarifa - verificar que este activo
			ObtenerTipoTarifaRP responseTarifa = null;
			
			LP502ObtenerTipoTarifaProxy proxyTarifa = new LP502ObtenerTipoTarifaProxy();
			ObtenerTipoTarifaRQ request = new ObtenerTipoTarifaRQ();
			request.setAREA_CODE(Long.parseLong(codigoDeArea));
			request.setTELNUM(Long.parseLong(numDestino));
			responseTarifa = proxyTarifa.obtenerTipoTarifa(request);
			System.out.println(responseTarifa.getINDICADOR_SERVICIO());
			if(!responseTarifa.getINDICADOR_SERVICIO().equalsIgnoreCase("1")){
				//setVariable("CONTINUAR", "2");
				System.out.println("NO RESIDENCIAL");
				return false;
			}else{
				System.out.println("Es residencial");
			}
			
			// 2.- Obtener movimiento - Verifico si esta activo o cortado
			F2V5IVRAscObtenerMovimientosRP response = null;
			Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxy = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
			F2V5IVRAscObtenerMovimientosRQ parametros = new F2V5IVRAscObtenerMovimientosRQ();
			parametros.setAREA_CODE(Long.parseLong(codigoDeArea));
			parametros.setTELNUM(Long.parseLong(numDestino));
			response = proxy.obtenerMovimientos(parametros);
			
			if(!response.getINDICADOR_TELEFONO_ACTIVO().equalsIgnoreCase("S")){
				//setVariable("CONTINUAR", "2");
				System.out.println("NO ACTIVO");
				return false;
				
			}else{
				System.out.println("Esta activo");
			}
			
			// 3.- SACAS - Verificar el status del numero de telefono
			com.cantv.sacas.integracion.obtenerHistoriaTelefono.xsd.CbObtenerHistoriaTelefonoRP[] resp = null;
			CbObtenerHistoriaTelefonoRP responseSacas = null;
			CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy proxySacas = new CwsObtenerHistoriaTelefonoIntegracionPortTypeProxy();
			CbObtenerHistoriaTelefonoRQ requestSacas = new CbObtenerHistoriaTelefonoRQ();
			requestSacas.setTelefono(codigoDeArea+numDestino);
			requestSacas.setAplicativo(aplicativo);
			requestSacas.setUsuario(usuario);
			resp = proxySacas.obtenerHistoriaTelefono(requestSacas);
			
			System.out.println("LONGITUD: "+resp.length);
			
			System.out.println("Estatus: "+resp[0].getEstatus());
			System.out.println("COD Error: "+resp[0].getCodigoError());
			System.out.println("Fecha Cancelacion: "+resp[0].getFechaCancelacion());
			System.out.println("Fecha Reporte: "+resp[0].getFechaReporte());
			System.out.println("Hora Cancelacion: "+resp[0].getHoraCancelacion());
			System.out.println("Mensaje Error: "+resp[0].getMensajeError());
			System.out.println("Numero incidente: "+resp[0].getNumeroIncidente());
			System.out.println("Tipo Servicio: "+resp[0].getTipoServicio());
			
			
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (ApplicationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} 
		
		// 4.- Base de datos Masivos - Verifico si el numero de telefon se encuentra en un rango
		
		// Calcular el rango de tiempo que tiene la averia eso viene de SACAS numero 3
		
		//Retorno: STATUS, TIEMPO, CONTINUAR
		return false;
	}
	
	
	
	/***
	 * 
	 * @param IdCliente
	 * @return
	 */
	public boolean consultaDeInternet(String IdCliente){
		//numero de cedula o rif
		// 1.- Consultar Cliente BOSS - Consulto si existe o no
		try {
			ConsultarClienteRP responseCliente = null;
			CU683ConsultarClienteBOSSProxy proxyCliente = new CU683ConsultarClienteBOSSProxy();
			ConsultarClienteRQ requestCliente = new ConsultarClienteRQ();
			if(!IdCliente.equalsIgnoreCase("0")){
				requestCliente.setIDCliente(IdCliente);
				requestCliente.setNumeroTelefono("2127623872");
				responseCliente = proxyCliente.consultarCliente(requestCliente);
				System.out.println("LOGIN: "+responseCliente.getLogin());
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		//Retorno CONTINUAR
		return false;
	}
	
	/***
	 * 
	 * @param IdCliente
	 * @param codigoDeArea
	 * @param numDestino
	 * @return
	 */
	public boolean averiaInternet(String IdCliente, String codigoDeArea, String numDestino){
		
		// 1.- Consultar CLIENTE BOSS - Valido si existe el Cliente o el numero telefonico
		ConsultarClienteRP responseCliente = null;
		CU683ConsultarClienteBOSSProxy proxyCliente = new CU683ConsultarClienteBOSSProxy();
		ConsultarClienteRQ requestCliente = new ConsultarClienteRQ();
		if(!IdCliente.equalsIgnoreCase("0") && codigoDeArea.equalsIgnoreCase("0") && numDestino.equalsIgnoreCase("0")){
			requestCliente.setIDCliente(IdCliente);
		}else if(!codigoDeArea.equalsIgnoreCase("0") && !numDestino.equalsIgnoreCase("0") && IdCliente.equalsIgnoreCase("0")){
			requestCliente.setNumeroTelefono(codigoDeArea+numDestino);
		}
		//responseCliente = proxyCliente.consultarCliente(requestCliente);
		responseCliente.getStatus();
		
		
		// 2.- Obtener Movimientos - Valido si esta incativo
		F2V5IVRAscObtenerMovimientosRP response = null;
		Serviciof2V5_IVR_Asc_obtenerMovimientosProxy proxy = new Serviciof2V5_IVR_Asc_obtenerMovimientosProxy();
		F2V5IVRAscObtenerMovimientosRQ parametros = new F2V5IVRAscObtenerMovimientosRQ();
		parametros.setAREA_CODE(Long.parseLong(codigoDeArea));
		parametros.setTELNUM(Long.parseLong(numDestino));
		//response = proxy.obtenerMovimientos(parametros);
		
		if(!response.getINDICADOR_TELEFONO_ACTIVO().equalsIgnoreCase("S")){
			//setVariable("CONTINUAR", "2");
			
		}else{
			System.out.println("Esta activo");
		}
		
		// 3.- Consulta Caso Remedy - Calcular las horas de la averia.
		NotificacionDeAveriaRP reponseAveria = null;
		GI113NotificacionDeAveriasProxy proxyAveria = new GI113NotificacionDeAveriasProxy();
		NotificacionDeAveriaRQ requestAveria = new NotificacionDeAveriaRQ();
		
		// 4.- Base de datos Masivos - Verifico si el numero de telefon se encuentra en un rango
		
		
		// Retorno: STATUS, TIEMPO, CONTINUAR
		return false;
	}
	
	/***
	 * 
	 * @param numeroSerial
	 * @return
	 */
	public boolean consultaTelevision(String numeroSerial){
		// 1.- TVSAT - Si existe el numero serial
		
		//Retorno: Continuar
		return false;
	}
	
	
	/*
	 * METODOS GENERALES PARA LOS IVR
	 */
	
	
	
	
	
	
	
	/*
	 * ******************************
	 * METODOS GETTERS Y SETTERS
	 * ******************************
	 * 
	 */
	
	public String getSALDO() {
		return SALDO;
	}

	public void setSALDO(String sALDO) {
		SALDO = sALDO;
	}

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}
	
	public String getID_ORDEN() {
		return ID_ORDEN;
	}

	public void setID_ORDEN(String iD_ORDEN) {
		ID_ORDEN = iD_ORDEN;
	}

	public String getSTATUS_ORDEN() {
		return STATUS_ORDEN;
	}

	public void setSTATUS_ORDEN(String sTATUS_ORDEN) {
		STATUS_ORDEN = sTATUS_ORDEN;
	}
	
	
	/*
	 * ******************************
	 * FIN METODOS GETTERS Y SETTERS
	 * ******************************
	 */

	

	public static void main(String[] args) {
		ConsultNumber consul = new ConsultNumber();
		//consul.obtenerTipoTarifa("0239", "7162474");
		//consul.obtenerTipoTarifa("0239", "0000000");
//		try {
//			consul.obtenerMovimietos("0212","7623872");
//		} catch (AgiException e) {
//			e.printStackTrace();
//		}
		consul.consultaSaldo("212","6318707");
		//consul.statusAveriaDeLinea("241","8089145","Integracion","pbonil2");
		//consul.statusAveriaDeLinea("212","5524590","Integracion","pbonil2");
		//consul.estatusDeInternet("267","8764813");
	}
	
	
}
