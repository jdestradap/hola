package com.training.dto;

import java.util.ArrayList;
import java.util.Collection;

public class RespuestaBusquedaFacturasProveedor {
	
	private String dniProveedor = null;
	
	private Collection<InformacionFactura> datos = new ArrayList<InformacionFactura>(); 

	public String getDni() {
		return dniProveedor;
	}

	public void setDni(String dni) {
		this.dniProveedor = dni;
	}

	public Collection<InformacionFactura> getDatos() {
		return datos;
	}

	public void setDatos(Collection<InformacionFactura> datos) {
		this.datos = datos;
	}
}
