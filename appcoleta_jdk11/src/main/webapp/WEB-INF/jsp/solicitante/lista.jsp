<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container-fluid mt-3">
		<h2>Listagem de solicitantes:</h2>

		<h4>Coleta</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>CPF</th>
					<th>E-mail</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${listaSolicitante}">
					<tr>
						<td>${s.nome}</td>
						<td>${s.cpf}</td>
						<td>${s.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="text-center">
		<h6>
			<b>Aluno:</b> Patrick Neri de Oliveira
		</h6>
		<h6>
			<b>Professor:</b> Elberth Moraes
		</h6>
	</div>

</body>
</html>