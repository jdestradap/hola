package com.training.dto;

import java.util.ArrayList;
import java.util.Collection;

public class RespuestaBusquedaCobertura {

	private Collection<InformacionCobertura> listaCoberturas = new ArrayList<InformacionCobertura>();

	public Collection<InformacionCobertura> getListaCoberturas() {
		return listaCoberturas;
	}

	public void setListaSucursales(Collection<InformacionCobertura> listaCoberturas) {
		this.listaCoberturas = listaCoberturas;
	}

	public void addCobertura(InformacionCobertura informacion) {
		if (informacion != null) {
			if (listaCoberturas == null) {
				listaCoberturas = new ArrayList<InformacionCobertura>();
			}
			listaCoberturas.add(informacion);
		}
	}
}