var autorizacionesFactory = angular.module("autorizacionesFactory", []);

autorizacionesFactory.factory('ClaveValor', function() {
    return function (clave, valor) {
    	this.clave = clave;
    	this.valor = valor;
    };
});

autorizacionesFactory.factory('Proveedor', function() {
	return function (codigoInterno, dni, tipoDocumento, numeroDocumento, nombreComercial) {
		this.codigoInterno = codigoInterno;
		this.dni = dni;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombreComercial = nombreComercial;
	};
});

autorizacionesFactory.factory('Sucursal', function() {
	return function (codigoInterno, departamento, municipio, direccion, complemento) {
		this.codigoInterno = codigoInterno;
		this.departamento = departamento;
		this.municipio = municipio;
		this.direccion = direccion;
		this.complemento = complemento;
    };
});

autorizacionesFactory.factory('Autorizacion', function() {
	return function (numeroPoliza, dniAsegurado, codigoServicio, codigoSucursal, numeroSesiones) {
		this.numeroAutorizacion = '';
		this.numeroPoliza = numeroPoliza;
		this.dniAsegurado = dniAsegurado;
		this.codigoServicio = codigoServicio;
		this.codigoSucursal = codigoSucursal;
		this.numeroSesiones = numeroSesiones;
    };
});


autorizacionesFactory.factory('Cobertura', function() {
    return function (codigoInterno, codigo, descripcion, valorCopago, valorConvenido, valorAsegurado, saldo, sesionesDisponibles, sesionesMaximas) {
    	this.codigoInterno = codigoInterno;
    	this.codigo = codigo;
    	this.descripcion = descripcion;
    	this.valorCopago = valorCopago;
    	this.valorConvenido = valorConvenido;
    	this.valorAsegurado = valorAsegurado;
    	this.saldo = saldo;
    	this.saldoCantidadSesiones = sesionesDisponibles;
    	this.cantidadSesiones = sesionesMaximas;
    	this.titulo = (angular.isDefined(this.codigo) && angular.isDefined(this.descripcion) && this.codigo !== "" && this.descripcion !== "") 
    					? this.codigo + ' - ' + this.descripcion : "";
    };
});

autorizacionesFactory.factory('Asegurado', function() {
    return function (tipoDocumento, numeroDocumento, nombreCompleto, edad, dni) {
    	this.tipoDocumento = tipoDocumento;
    	this.numeroDocumento = numeroDocumento;
    	this.nombreCompleto = nombreCompleto;
    	this.edad = edad;
    	this.dni = dni;
    };
});

autorizacionesFactory.factory('Plan', function() {
    return function (codigo, descripcion) {
    	this.codigo = codigo;
    	this.descripcion = descripcion;
    };
});

autorizacionesFactory.factory('Poliza', function() {
    return function (numero, ramo, plan, fechaAntiguedad) {
    	this.numero = numero;
    	this.ramo = ramo;
    	this.plan = plan;
    	this.fechaAntiguedad = fechaAntiguedad;
    };
});