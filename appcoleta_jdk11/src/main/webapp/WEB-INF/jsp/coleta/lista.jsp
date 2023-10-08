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
		<h2>Listagem de Coletas:</h2>
		<a href="/coleta/cadastro" class="btn btn-success">Inserir</a>
		<h3>Pedidos Cadastrados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>Data</th>
					<th>Pendente?</th>
					<th>Solicitante</th>
					<th>Resíduos</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${listaColeta}">
					<tr>
						<td>${c.id}</td>
						<td>${c.descricao}</td>
						<td>${c.data}</td>
						<td>${c.pendente}</td>
						<td>${c.solicitante}</td>
						<td>${c.residuos}</td>
						<td><a href="/coleta/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>