package com.training.dto;


public class InformacionFactura {
	private String prefijoFactura;
	private String numeroFactura;
	private String valorFactura;
	private String numeroRadicado;
	private String fechaRadicacion;
	private String estadoFactura;
	private String valorProntoPago;
	private String valorPagado;
	private String valorPorConciliar;
	
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getValorFactura() {
		return valorFactura;
	}
	public void setValorFactura(String valorFactura) {
		this.valorFactura = valorFactura;
	}
	public String getNumeroRadicado() {
		return numeroRadicado;
	}
	public void setNumeroRadicado(String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}
	public String getFechaRadicacion() {
		return fechaRadicacion;
	}
	public void setFechaRadicacion(String fechaRadicacion) {
		this.fechaRadicacion = fechaRadicacion;
	}
	public String getEstadoFactura() {
		return estadoFactura;
	}
	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}
	public String getValorProntoPago() {
		return valorProntoPago;
	}
	public void setValorProntoPago(String valorProntoPago) {
		this.valorProntoPago = valorProntoPago;
	}
	public String getValorPagado() {
		return valorPagado;
	}
	public void setValorPagado(String valorPagado) {
		this.valorPagado = valorPagado;
	}
	public String getValorPorConciliar() {
		return valorPorConciliar;
	}
	public void setValorPorConciliar(String valorPorConciliar) {
		this.valorPorConciliar = valorPorConciliar;
	}
	public String getPrefijoFactura() {
		return prefijoFactura;
	}
	public void setPrefijoFactura(String prefijoFactura) {
		this.prefijoFactura = prefijoFactura;
	}
}
