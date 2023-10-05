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
		<h2>Listagem de Entulhos:</h2>
		<a href="/entulho/cadastro" class="btn btn-success">Incluir Novo</a>
		<h3>Resíduos Cadastrados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Código</th>
					<th>Observação</th>
					<th>Volume (m³l)</th>
					<th>Está em obra?</th>
					<th>Tipo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${listaEntulho}">
					<tr>
						<td>${e.nome}</td>
						<td>${e.codigo}</td>
						<td>${e.observacao}</td>
						<td>${e.volume}</td>
						<td>${e.obra}</td>
						<td>${e.tipo}</td>
						<td><a href="/entulho/${e.codigo}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>