package com.training.dto;

public class InformacionProveedor {

	private String codigoInterno;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nombreComercial;
	private String razonSocial;
	
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCodigoInterno() {
		return codigoInterno;
	}

	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public InformacionProveedor(String codigoInterno, String tipoDocumento, String numeroDocumento, String nombreComercial, String razonSocial) {
		super();
		this.codigoInterno = codigoInterno;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombreComercial = nombreComercial;
		this.razonSocial = razonSocial;
	}

}
