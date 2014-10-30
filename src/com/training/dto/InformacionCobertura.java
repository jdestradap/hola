package com.training.dto;

public class InformacionCobertura {

	private String codigoInterno;
	private String codigoServicio;
	private String descripcion;
	private Double valor;

	public InformacionCobertura(String codigoInterno, String codigoServicio) {
		this.codigoInterno = codigoInterno;
		this.codigoServicio = codigoServicio;
	}

	public String getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public String getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}