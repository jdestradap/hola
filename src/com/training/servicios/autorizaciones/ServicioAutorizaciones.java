package com.training.servicios.autorizaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.dto.CriteriosBusquedaAsegurado;
import com.training.dto.CriteriosBusquedaCobertura;
import com.training.dto.CriteriosBusquedaCoberturaContratada;
import com.training.dto.CriteriosBusquedaProveedor;
import com.training.dto.CriteriosBusquedaSucursal;
import com.training.dto.InformacionAseguradoPoliza;
import com.training.dto.InformacionCobertura;
import com.training.dto.InsumosAutorizacion;
import com.training.dto.ObjetoClaveValor;
import com.training.dto.RespuestaAutorizacion;
import com.training.dto.RespuestaBusquedaAsegurado;
import com.training.dto.RespuestaBusquedaCoberturaContratada;
import com.training.dto.RespuestaBusquedaProveedor;
import com.training.dto.RespuestaBusquedaSucursal;

@Path("/ServicioAutorizaciones")
public class ServicioAutorizaciones {

	@POST
	@Path("/busquedaTiposDocumento")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response obtenerTipoSDocumentos() {
		return Response.status(200).entity(Arrays.asList(new ObjetoClaveValor("A", "Nit"), new ObjetoClaveValor("C", "Cedula"), new ObjetoClaveValor("T", "Tarjeta identidad"))).build();
	}
	
	@POST
	@Path("/busquedaInformacionAseguradoPoliza")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarAsegurados(CriteriosBusquedaAsegurado criterios) {
		RespuestaBusquedaAsegurado respuesta = null;
		if (criterios != null) {
			respuesta = new RespuestaBusquedaAsegurado();
			System.out.println("Parametros entrada servicio: "+criterios.toString());
			respuesta.setEdad("25");
			respuesta.setNombreCompleto("Yohana");
			respuesta.setDatos(new ArrayList<InformacionAseguradoPoliza>());
			
			InformacionAseguradoPoliza poliza1 = new InformacionAseguradoPoliza();
			poliza1.setNumeroPoliza("1234");
			poliza1.setCodigoRamo("ramo1");
			poliza1.setDescripcionPlan("Plan 1");
			
			InformacionAseguradoPoliza poliza2 = new InformacionAseguradoPoliza();
			poliza2.setNumeroPoliza("5678");
			poliza2.setCodigoRamo("ramo2");
			poliza2.setDescripcionPlan("Plan 2");
			
			respuesta.getDatos().add(poliza1);
			respuesta.getDatos().add(poliza2);
		}
		return Response.status(200).entity(respuesta).build();
	}

	@POST
	@Path("/busquedaInformacionProveedor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarProveedor(CriteriosBusquedaProveedor criterios) {
		RespuestaBusquedaProveedor respuesta = new RespuestaBusquedaProveedor();
		if (criterios != null) {}
		return Response.status(200).entity(respuesta).build();
	}

	@POST
	@Path("/busquedaSucursalesProveedor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarSucursalesProveedor(CriteriosBusquedaSucursal criterios) {
		RespuestaBusquedaSucursal respuesta = new RespuestaBusquedaSucursal();
		if (criterios != null) {}
		return Response.status(200).entity(respuesta).build();
	}

	@POST
	@Path("/busquedaInformacionCobertura")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response busquedaInformacionCobertura(CriteriosBusquedaCobertura criterios) {
		InformacionCobertura informacionCobertura = null;
		if (criterios != null) {}
		return Response.status(200).entity(informacionCobertura).build();
	}
	
	@POST
	@Path("/busquedaCoberturasContratadas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response busquedaCoberturasContratadas(CriteriosBusquedaCoberturaContratada criterios) {
		Collection<RespuestaBusquedaCoberturaContratada> respuestaCoberturasContratadas = new ArrayList<RespuestaBusquedaCoberturaContratada>();
		if (criterios != null) {}
		return Response.status(200).entity(respuestaCoberturasContratadas).build();
	}

	@POST
	@Path("/solicitarAutorizacion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response solicitarAutorizacion(InsumosAutorizacion insumosAutorizacion) {
		RespuestaAutorizacion respuesta = null;
		
		if (insumosAutorizacion != null) {}
		return Response.status(200).entity(respuesta).build();
	}
}