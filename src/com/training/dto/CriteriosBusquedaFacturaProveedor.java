package com.training.dto;

public class CriteriosBusquedaFacturaProveedor {
	private String dniProveedor;
	private String estado;
	private String numeroFactura;
	private String numeroRadicado;
	private String fechaInicialRadicacion;
	private String fechaFinalRadicacion;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getFechaInicialRadicacion() {
		return fechaInicialRadicacion;
	}
	public void setFechaInicialRadicacion(String fechaInicialRadicacion) {
		this.fechaInicialRadicacion = fechaInicialRadicacion;
	}
	public String getFechaFinalRadicacion() {
		return fechaFinalRadicacion;
	}
	public void setFechaFinalRadicacion(String fechaFinalRadicacion) {
		this.fechaFinalRadicacion = fechaFinalRadicacion;
	}
	public void setNumeroRadicado(String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}
	public String getNumeroRadicado() {
		return numeroRadicado;
	}
	public String getDniProveedor() {
		return dniProveedor;
	}
	public void setDniProveedor(String dniProveedor) {
		this.dniProveedor = dniProveedor;
	}
	
}
