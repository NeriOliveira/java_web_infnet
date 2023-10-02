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

<nav class="navbar navbar-inverse" style="background-color: #1f5900;border-color: #1f5900;">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/"><b>&#127795;iGreen	APP&nbsp;</b></a>
		</div>
		<ul class="nav navbar-nav">
			<c:if test="${not empty user}">
				<li><a href="/usuario/lista"><b>Usuários</b></a></li>
				<li><a href="/solicitante/lista"><b>Solicitantes</b></a></li>
				<li><a href="#"><b>Resíduos</b></a></li>
				<li><a href="/oleo/lista"><b>Óleo</b></a></li>
				<li><a href="/reciclavel/lista"><b>Reciclável</b></a></li>
				<li><a href="#"><b>Entulho</b></a></li>
				<li><a href="#"><b>Coleta</b></a></li>
				<li><a href="/sobre"><b>Sobre</b></a></li>
			</c:if>
		</ul>

		<ul class="nav navbar-nav navbar-right ">
			<c:if test="${empty user}">
				<li class="text-bg-success"><a href="/usuario/cadastro"><span
						class="glyphicon glyphicon-user text-bg-success"></span>
						Cadastre-se</a></li>
				<li class="text-bg-success"><a href="/login"><span
						class="glyphicon glyphicon-log-in text-bg-success"></span> Login</a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a href="/"><span class="text-bg-success">&nbsp;${user.email}&nbsp;</span></a></li>
				<li class="text-bg-success"><a href="/logout"><span
						class="glyphicon glyphicon-log-out text-bg-success"></span> Logout</a></li>
			</c:if>
		</ul>
	</div>
</nav>
