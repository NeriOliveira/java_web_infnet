<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
<c:if test="${empty user}">
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
		rel="stylesheet">
</c:if>
</head>
<body>
	<c:if test="${not empty user}">
		<c:import url="/WEB-INF/jsp/menu.jsp" />
	</c:if>
	<div class="container mt-3">
		<h2>&#127795; iGreen APP</h2>
		<h3>Cadastro de Usu�rio</h3>
		<form action="/usuario/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" id="email"
					placeholder="Entre com o seu e-mail" name="email">
			</div>
			<div class="mb-3">
				<label for="pwd">Senha:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Entre com a sua senha"
					name="senha">
			</div>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
	<c:if test="${not empty user}">
		<c:import url="/WEB-INF/jsp/footer.jsp" />
	</c:if>
</body>
</html>