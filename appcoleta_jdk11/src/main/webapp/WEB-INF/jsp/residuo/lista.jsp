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
		<h2>Listagem de Resíduos:</h2>
		<!-- a href="/residuo/cadastro" class="btn btn-success">Inserir</a-->
		<h3>Resíduos Cadastrados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Código</th>
					<th>Observação</th>
					<th>Coletas</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${listaResiduo}">
					<tr>
						<td>${r.id}</td>
						<td>${r.nome}</td>
						<td>${r.codigo}</td>
						<td>${r.observacao}</td>
						<td>${r.coletas.size()}</td>
						<td><a href="/residuo/${r.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>