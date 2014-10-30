package com.training.dto;

public class InformacionSucursal {
	
	private String codigoInterno;
	private String direccion;
	private String complemento;
	private String municipio;
	private String departamento;
	
	
	public InformacionSucursal(String codigoInterno, String direccion, String complemento, String municipio, String departamento) {
		super();
		this.codigoInterno = codigoInterno;
		this.direccion = direccion;
		this.complemento = complemento;
		this.municipio = municipio;
		this.departamento = departamento;
	}
	
	
	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
