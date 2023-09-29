<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<!-- c:import url="/WEB-INF/jsp/menu.jsp" / -->

	<div class="container mt-3">
		<h2>&#127795; iGreen APP</h2>
		<form action="/valida" method="post">
			<div class="mb-3 mt-3">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" id="email" placeholder="Entre com o seu e-mail"
					name="email">
			</div>
			<div class="mb-3">
				<label for="pwd">Senha:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Entre com a sua senha"
					name="senha">
			</div>
			<div class="form-check mb-3">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="lembrar">
					Lembrar acesso
				</label>
			</div>
			<button type="submit" class="btn btn-success">Acessar</button>
		</form>
	</div>

</body>
</html>