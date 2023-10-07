<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<nav class="navbar navbar-inverse" style="background-color: #047235;border-color: #047235;">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/" style="background-color: #b7d7d8;"><b>&#127795;iGreen	APP&nbsp;</b></a>
		</div>
		<ul class="nav navbar-nav">
			<c:if test="${not empty user}">
				<li><a href="/usuario/lista" style= "color: #b7d7d8;"><b>Usuários</b></a></li>
				<li><a href="/solicitante/lista" style= "color: #b7d7d8;"><b>Solicitantes</b></a></li>
				<li><a href="#" style= "color: #b7d7d8;"><b>Resíduos</b></a></li>
				<li><a href="/oleo/lista" style= "color: #b7d7d8;"><b>Óleo</b></a></li>
				<li><a href="/reciclavel/lista" style= "color: #b7d7d8;"><b>Reciclável</b></a></li>
				<li><a href="/entulho/lista" style= "color: #b7d7d8;"><b>Entulho</b></a></li>
				<li><a href="/coleta/lista" style= "color: #b7d7d8;"><b>Coleta</b></a></li>
				<li><a href="/sobre" style= "color: #b7d7d8;"><b>Sobre</b></a></li>
			</c:if>
		</ul>

		<ul class="nav navbar-nav navbar-right ">
			<c:if test="${empty user}">
				<li><a href="/usuario/cadastro" style= "color: #b7d7d8;"><span
						class="glyphicon glyphicon-user"></span>
						Cadastre-se</a></li>
				<li><a href="/login" style= "color: #b7d7d8;"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a href="/" style= "color: #b7d7d8;"><span>&nbsp;${user.email}&nbsp;</span></a></li>
				<li><a href="/logout" style= "color: #b7d7d8;"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>
			</c:if>
		</ul>
	</div>
</nav>
