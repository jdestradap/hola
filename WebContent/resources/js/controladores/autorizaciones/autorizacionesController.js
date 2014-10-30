var moduloAutorizacion = angular.module('moduloAutorizacion', ['autorizacionesServices', 'autorizacionesFactory', 'ui.bootstrap']);


moduloAutorizacion.controller('autorizacionesController', function ($scope, Asegurado, ServiciosGenerales) {
	$scope.tiposDocumentos = [];
	$scope.notificacionUsuario = '';
	$scope.asegurado = new Asegurado('C', '');
	
	$scope.consultarAsegurado = function() {
		if ($scope.solicitarAutorizacion.$valid) {
			ServiciosGenerales.consultarAsegurado($scope.asegurado).then(function(response) {
				if (response != undefined && response != "") {
					$scope.notificacionUsuario = JSON.stringify(response);
					$scope.asegurado.nombreCompleto = response.nombreCompleto;
					$scope.asegurado.edad = response.edad;
				} else {
					$scope.notificacionUsuario = "No se encuentra un asegurado con los datos ingresados.";
				}
			}, function(error) {
				$scope.notificacionUsuario = "Ocurrio un error obteniendo los datos del asegurado.";
			});
		}
	};
	
	
	
	ServiciosGenerales.consultarTiposDocumentos().then(function(tiposDocumento) {
		$scope.tiposDocumentos = tiposDocumento;
	}, function(error) {
		$scope.notificacionUsuario = "Ocurrio un error consultando los tipos de documento.";
	});
	
	$scope.isInvalid = function(form, field) {
		if (angular.isUndefined($scope[form])) {
			return false;
		}
		return $scope[form][field].$invalid && $scope[form][field].$dirty;
	};
	
});
