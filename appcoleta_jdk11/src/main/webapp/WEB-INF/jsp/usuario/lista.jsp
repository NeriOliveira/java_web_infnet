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
		<h2>Listagem de usu�rios:</h2>
		<table class="table table-striped">
		<h3>Usu�rio</h3>
			<thead>
				<tr>
					<th>Nome</th>
					<th>CPF</th>
					<th>Senha</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${listaUsuario}">
					<tr>
						<td>${u.nome}</td>
						<td>${u.email}</td>
						<td type="password">${u.senha}</td>
						<td><a href="/usuario/${u.email}/excluir">excluir</a></td>
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