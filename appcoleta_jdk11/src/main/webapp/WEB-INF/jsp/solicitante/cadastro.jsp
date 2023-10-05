<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Cadastro de Solicitante</h3>
		<form action="/solicitante/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			<div class="mb-3 mt-3">
				<label for="cpf">CPF:</label> <input type="text"
					class="form-control" id="cpf" placeholder="Entre com o seu CPF"
					name="cpf">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" id="email"
					placeholder="Entre com o seu e-mail" name="email">
			</div>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>