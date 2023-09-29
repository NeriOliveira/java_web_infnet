<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-expand-sm bg-success navbar-dark">
	<div class="container-fluid">
		<a class="navbar-brand bg-light text-success" href="/"><b>&#127795;iGreen APP&nbsp;</b></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
					href="/solicitante/lista"><b>Solicitantes</b></a></li>
				<li class="nav-item"><a class="nav-link" href="#"><b>Resíduos</b></a></li>
				<li class="nav-item"><a class="nav-link" href="#"><b>Óleo</b></a></li>
				<li class="nav-item"><a class="nav-link" href="#"><b>Reciclaveis</b></a></li>
				<li class="nav-item"><a class="nav-link" href="#"><b>Entulho</b></a></li>
				<li class="nav-item"><a class="nav-link" href="#"><b>Coleta</b></a></li>
				<li class="nav-item"><a class="nav-link" href="/sobre"><b>Sobre</b></a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span>SignUp</a></li>
				<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
				<li><a href="/"><span class="text-black-50">${user.email}</span></a></li>
			</ul>
		</div>
	</div>
</nav>
