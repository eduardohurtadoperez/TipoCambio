package com.tipocambio.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "tasa_cambio")
public class TipoCambio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true, length = 6)
	private String id;

	private String origen;

	private String destino;

	private Double tasa;
	
	public TipoCambio() {

	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Double getTasa() {
		return tasa;
	}


	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}

}
