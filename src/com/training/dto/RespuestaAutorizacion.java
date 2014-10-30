package com.training.dto;

public class RespuestaAutorizacion {
	
	private String numeroAutorizacion;
	private Double valorCopago;
	private Double valorAutorizado;
	
	public Double getValorAutorizado() {
		return valorAutorizado;
	}

	public void setValorAutorizado(Double valorAutorizado) {
		this.valorAutorizado = valorAutorizado;
	}

	public Double getValorCopago() {
		return valorCopago;
	}

	public void setValorCopago(Double valorCopago) {
		this.valorCopago = valorCopago;
	}

	public String getNumeroAutorizacion() {
		return numeroAutorizacion;
	}

	public void setNumeroAutorizacion(String numeroAutorizacion) {
		this.numeroAutorizacion = numeroAutorizacion;
	}

}
