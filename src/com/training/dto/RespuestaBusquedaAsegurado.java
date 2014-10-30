package com.training.dto;

import java.util.ArrayList;
import java.util.Collection;

public class RespuestaBusquedaAsegurado {

	private String tipoDocumento;
	private String numeroDocumento;
	private String nombreCompleto;
	private String edad;
	private Collection<InformacionAseguradoPoliza> datos;

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

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Collection<InformacionAseguradoPoliza> getDatos() {
		return datos;
	}

	public void setDatos(Collection<InformacionAseguradoPoliza> datos) {
		this.datos = datos;
	}

	public void addDato(InformacionAseguradoPoliza dato) {
		if (dato != null) {
			if (datos == null) {
				datos = new ArrayList<InformacionAseguradoPoliza>();
			}
			datos.add(dato);
		}
	}
}