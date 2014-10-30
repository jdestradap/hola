package com.training.dto;

import java.util.ArrayList;
import java.util.Collection;

public class RespuestaBusquedaProveedor {

	private Collection<InformacionProveedor> listaProveedores = new ArrayList<InformacionProveedor>();

	public Collection<InformacionProveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(Collection<InformacionProveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	public void addProveedor(InformacionProveedor informacion) {
		if (informacion != null) {
			if (listaProveedores == null) {
				listaProveedores = new ArrayList<InformacionProveedor>();
			}
			listaProveedores.add(informacion);
		}
	}
}