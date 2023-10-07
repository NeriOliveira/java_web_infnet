<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
	<h2>Listagem de solicitantes:</h2>
	<a href="/solicitante/cadastro" class="btn btn-success">Inserir</a>
		<h3>Coleta</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>CPF</th>
					<th>E-mail</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${listaSolicitante}">
					<tr>
						<td>${s.nome}</td>
						<td>${s.cpf}</td>
						<td>${s.email}</td>
						<td><a href="/solicitante/${s.cpf}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

</body>
</html>