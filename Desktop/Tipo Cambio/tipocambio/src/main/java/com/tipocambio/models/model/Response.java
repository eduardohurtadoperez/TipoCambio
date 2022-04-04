package com.tipocambio.models.model;

public class Response {

	public String mensaje;
	public Double montoConvertido;
	public Boolean estado;
	
	public Response() {
		
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Double getMontoConvertido() {
		return montoConvertido;
	}
	public void setMontoConvertido(Double montoConvertido) {
		this.montoConvertido = montoConvertido;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
