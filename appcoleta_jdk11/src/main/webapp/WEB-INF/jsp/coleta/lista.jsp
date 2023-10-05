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
		<h2>Listagem de Óleos:</h2>
		<a href="/oleo/cadastro" class="btn btn-success">Incluir Novo</a>
		<h3>Resíduos Cadastrados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Código</th>
					<th>Observação</th>
					<th>Volume (l)</th>
					<th>Está limpo?</th>
					<th>Tipo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="o" items="${listaOleo}">
					<tr>
						<td>${o.nome}</td>
						<td>${o.codigo}</td>
						<td>${o.observacao}</td>
						<td>${o.volume}</td>
						<td>${o.limpo}</td>
						<td>${o.tipo}</td>
						<td><a href="/oleo/${o.codigo}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>