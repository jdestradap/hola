package com.training.dto;

public class InformacionAseguradoPoliza {

	private String fechaAntiguedad;
	private String codigoPlan;
	private String descripcionPlan;
	private String numeroPoliza;
	private String codigoRamo;

	public String getFechaAntiguedad() {
		return fechaAntiguedad;
	}

	public void setFechaAntiguedad(String fechaAntiguedad) {
		this.fechaAntiguedad = fechaAntiguedad;
	}

	public String getCodigoPlan() {
		return codigoPlan;
	}

	public void setCodigoPlan(String codigoPlan) {
		this.codigoPlan = codigoPlan;
	}

	public String getDescripcionPlan() {
		return descripcionPlan;
	}

	public void setDescripcionPlan(String descripcionPlan) {
		this.descripcionPlan = descripcionPlan;
	}

	public String getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(String numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getCodigoRamo() {
		return codigoRamo;
	}

	public void setCodigoRamo(String codigoRamo) {
		this.codigoRamo = codigoRamo;
	}
}