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
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container mt-3">
	<h2>Listagem de Recicláveis:</h2>
		<a href="/reciclavel/cadastro" class="btn btn-success">Inserir</a>
		<h3>Resíduos Cadastrados</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Código</th>
					<th>Observação</th>
					<th>Peso (kg)</th>
					<th>Está limpo?</th>
					<th>Tipo</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${listaReciclavel}">
					<tr>
						<td>${r.nome}</td>
						<td>${r.codigo}</td>
						<td>${r.observacao}</td>
						<td>${r.peso}</td>
						<td>${r.limpo}</td>
						<td>${r.tipo}</td>
						<td><a href="/reciclavel/${r.codigo}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

</body>
</html>