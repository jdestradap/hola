package com.training.dto;

import java.util.ArrayList;
import java.util.Collection;

public class RespuestaBusquedaSucursal {

	
	private Collection<InformacionSucursal> listaSucursales = new ArrayList<InformacionSucursal>();

	public Collection<InformacionSucursal> getListaSucursales() {
		return listaSucursales;
	}

	public void setListaSucursales(Collection<InformacionSucursal> listaSucursales) {
		this.listaSucursales = listaSucursales;
	}
	
	public void addSucursal(InformacionSucursal informacion) {
		if (informacion != null) {
			if (listaSucursales == null) {
				listaSucursales = new ArrayList<InformacionSucursal>();
			}
			listaSucursales.add(informacion);
		}
	}
}
