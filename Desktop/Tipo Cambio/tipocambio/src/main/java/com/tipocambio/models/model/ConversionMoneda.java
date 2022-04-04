package com.tipocambio.models.model;

public class ConversionMoneda {
	
	public String origen;
	public String destino;
	public Double monto;
	
	public ConversionMoneda() {
		
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	

}
