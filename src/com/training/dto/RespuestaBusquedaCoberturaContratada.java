package com.training.dto;

public class RespuestaBusquedaCoberturaContratada {

	private String codigoInternoCobertura;
	private String codigoCobertura;
	private String descripcion;
	private String valorCobertura;
	private String saldoValorCobertura;
	private String cantidadSesiones;
	private String saldoCantidadSesiones;

	public String getCodigoInternoCobertura() {
		return codigoInternoCobertura;
	}

	public void setCodigoInternoCobertura(String codigoInternoCobertura) {
		this.codigoInternoCobertura = codigoInternoCobertura;
	}

	public String getCodigoCobertura() {
		return codigoCobertura;
	}

	public void setCodigoCobertura(String codigoCobertura) {
		this.codigoCobertura = codigoCobertura;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValorCobertura() {
		return valorCobertura;
	}

	public void setValorCobertura(String valorCobertura) {
		this.valorCobertura = valorCobertura;
	}

	public String getSaldoValorCobertura() {
		return saldoValorCobertura;
	}

	public void setSaldoValorCobertura(String saldoValorCobertura) {
		this.saldoValorCobertura = saldoValorCobertura;
	}

	public String getCantidadSesiones() {
		return cantidadSesiones;
	}

	public void setCantidadSesiones(String cantidadSesiones) {
		this.cantidadSesiones = cantidadSesiones;
	}

	public String getSaldoCantidadSesiones() {
		return saldoCantidadSesiones;
	}

	public void setSaldoCantidadSesiones(String saldoCantidadSesiones) {
		this.saldoCantidadSesiones = saldoCantidadSesiones;
	}
}