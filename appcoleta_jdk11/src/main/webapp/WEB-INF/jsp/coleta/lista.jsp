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
					<th>Status</th>
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
						<td><input type="datetime-local" value="${c.data}"></td>
						<c:if test="${not c.pendente}">
							<td><h2>&#128178;</h2></td>
						</c:if>
						<c:if test="${c.pendente}">
							<td><h2>&#128667;</h2></td>
						</c:if>
						<td>${c.solicitante}</td>
						<td>${c.residuos}</td>
						<c:if test="${not c.pendente}">
							<td></td>
						</c:if>
						<c:if test="${c.pendente}">
							<td><a href="/coleta/${c.id}/excluir">excluir</a></td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<h5>&#128178;: Vendido</h5>
		<h5>&#128667;: Coleta Agendada</h5>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>