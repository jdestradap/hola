<!DOCTYPE html>
<html ng-app="moduloAutorizacion">
	<head>
		<title>Solicitar Autorizaciones</title>
		
		<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=7">
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angularjs/angular.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap/ui-bootstrap-tpls-0.11.2.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/fabricas/autorizaciones/autorizacionesFactory.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/servicios/autorizaciones/autorizacionesServices.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/controladores/autorizaciones/autorizacionesController.js"></script>
	</head>
	<body ng-controller="autorizacionesController">
		<div name="notificacion" ng-show="notificacionUsuario != ''">
			<label>{{notificacionUsuario}}</label>
		</div>
		<br>
		<form name="solicitarAutorizacion" novalidate>
			<fieldset name="datosUsuario">
				<legend class="titleLabel">Datos del Usuario</legend>
				<table align="center" width="80%">
					<tr>
						<td>
							<label for="tipoDocumento" class="titleLabel">Tipo Documento</label>
						</td>
						<td>
							<select ng-model="asegurado.tipoDocumento"  ng-options="tipoDocumento.clave as tipoDocumento.valor for tipoDocumento in tiposDocumentos"> </select>
						</td>
						<td>
							<label for="numeroIdentificacion" class="titleLabel">N&uacute;mero Documento</label>
						</td>
						<td>
							<input type="text" name="numeroDocumento" ng-model="asegurado.numeroDocumento" ng-trim="true" required>
							<div class="formError" ng-show="isInvalid('solicitarAutorizacion','numeroDocumento')">
	        					<small>El n&uacute;mero de documento es requerido.</small>
     						</div>
						</td>
						<td class="columButtons">
							<input type="button" value="Buscar" ng-click="consultarAsegurado()">
						</td>
						<td></td>
					</tr>
					<tr>
						<td> <label for="nombre" class="titleLabel">Nombre</label></td>
						<td> <label for="nombre" class="titleLabel" ng-bind="asegurado.nombreCompleto"></label> </td>
						<td> <label for="nombre" class="titleLabel">Edad</label></td>
						<td> <label for="nombre" class="titleLabel">{{asegurado.edad}}</label> </td>
					</tr>
					<tr>
						<table align="center" width="80%">
							<tr ng-repeat=" for  poliza in asegurado.datos">
								<td><label for="nombre" class="titleLabel" ng-bind="poliza.numeroPoliza"></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</tr>
				</table>
			</fieldset>
		</form>
	</body>
</html>