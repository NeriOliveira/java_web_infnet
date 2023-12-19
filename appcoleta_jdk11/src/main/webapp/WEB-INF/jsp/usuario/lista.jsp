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
		<h2>Listagem de usuários:</h2>
		<a href="/usuario/cadastro" class="btn btn-success">Inserir</a>
		<h3>Usuário</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>CPF</th>
					<th>Senha</th>
					<th>Solicitantes</th>
					<th>Residuos</th>
					<th>Coletas</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${listaUsuario}">
					<tr>
						<td>${s.id}</td>
						<td>${u.nome}</td>
						<td>${u.email}</td>
						<td><input type="password" value="${u.senha}"></td>
<<<<<<< Updated upstream
						<td><a href="/usuario/${s.id}/excluir">excluir</a></td>
=======
						<td>${u.solicitante.size()}</td>
						<td>${u.residuos.size()}</td>
						<td>${u.coletas.size()}</td>
						<td><a href="/usuario/${u.id}/excluir">excluir</a></td>
>>>>>>> Stashed changes
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp"/>

</body>
</html>