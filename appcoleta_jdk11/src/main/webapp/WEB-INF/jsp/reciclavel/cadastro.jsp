<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container mt-3">
		<h3>Cadastro de Resíduo: Recicláveis</h3>
		<form action="/reciclavel/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="codigo">Código:</label> <input type="text"
					class="form-control" id="codigo"
					placeholder="Entre com um código para este cadastro" name="codigo">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="observacao">Observação:</label> <input type="text"
					class="form-control" id="observacao"
					placeholder="Alguma observação para esta coleta?" name="observacao">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="peso">Peso (kg):</label> <input type="number" step=".01"
					class="form-control" id="peso" placeholder="Exemplo: 48,95"
					name="peso">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="limpo">Está limpo?</label> <input type="checkbox"
					class="form-control" id="limpo" name="limpo">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" id="tipo"
					placeholder="Madeira, Metal, Papel, Plastico, Vidro" name="tipo">
			</div>
			<br>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>