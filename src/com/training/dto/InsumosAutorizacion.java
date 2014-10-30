package com.training.dto;

import java.util.Date;

public class InsumosAutorizacion {
	
	private String numeroPoliza;
	private String dniAsegurado;
	private String codigoServicio;
	private String codigoSucursal;
	private String numeroSesiones;
	private Double valorAutorizacion;
	private Date fechaAutorizacion;
	
	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	public Double getValorAutorizacion() {
		return valorAutorizacion;
	}

	public void setValorAutorizacion(Double valorAutorizacion) {
		this.valorAutorizacion = valorAutorizacion;
	}

	public String getNumeroPoliza() {
		return numeroPoliza;
	}
	
	public void setNumeroPoliza(String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	
	
	public String getDniAsegurado() {
		return dniAsegurado;
	}

	public void setDniAsegurado(String dniAsegurado) {
		this.dniAsegurado = dniAsegurado;
	}

	public String getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}
	
	public String getCodigoSucursal() {
		return codigoSucursal;
	}
	
	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}
	
	public String getNumeroSesiones() {
		return numeroSesiones;
	}
	
	public void setNumeroSesiones(String numeroSesiones) {
		this.numeroSesiones = numeroSesiones;
	}

}
