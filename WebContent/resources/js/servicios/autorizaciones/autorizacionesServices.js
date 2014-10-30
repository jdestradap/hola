var autorizacionesServices = angular.module('autorizacionesServices', ['autorizacionesFactory']);

autorizacionesServices.service('Util', function(ClaveValor) {
	this.convertirTipoDocumentoServiceToClaveValor = function(documento) {
		var tipoDocumento = new ClaveValor(documento.codigo, documento.descripcion);
		return tipoDocumento;
	};
});

autorizacionesServices.service('ServiciosGenerales', function($http, $q, Util) {
	this.consultarTiposDocumentos = function() {
		var deferred = $q.defer();
		var promise = $http({
			method: 'POST',
			url: '/TrainingSalud/restservice/ServicioAutorizaciones/busquedaTiposDocumento'
		});	
		promise.success(function(tiposDocumentos) {
			var listaTiposDocumentos = [];
			angular.forEach(tiposDocumentos, function(value, key) {
				this.push(Util.convertirTipoDocumentoServiceToClaveValor(value));
			}, listaTiposDocumentos);
			deferred.resolve(listaTiposDocumentos);
		}).error(function(e) {
			deferred.reject(e);
		});	
		return deferred.promise;
	};
	
	this.consultarAsegurado = function(asegurado){
		
		var deferred = $q.defer();
		var promise = $http({
			method: 'POST',
			url: '/TrainingSalud/restservice/ServicioAutorizaciones/busquedaInformacionAseguradoPoliza',
			data: JSON.stringify({"tipoDocumento":asegurado.tipoDocumento,"numeroDocumento":asegurado.numeroDocumento})
		});	
		promise.success(function(response) {
			deferred.resolve(response);
		}).error(function(e) {
			deferred.reject(e);
		});	
		return deferred.promise;
	};
});




