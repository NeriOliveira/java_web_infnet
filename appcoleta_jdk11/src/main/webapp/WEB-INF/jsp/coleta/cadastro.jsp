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
		<h3>Cadastro de Res�duo: �leo</h3>
		<form action="/oleo/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="codigo">C�digo:</label> <input type="text"
					class="form-control" id="codigo"
					placeholder="Entre com um c�digo para este cadastro" name="codigo">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="observacao">Observa��o:</label> <input type="text"
					class="form-control" id="observacao"
					placeholder="Alguma observa��o para esta coleta?" name="observacao">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="volume">Volume (litros):</label> <input type="number"
					step=".01" class="form-control" id="volume"
					placeholder="Exemplo: 72,50" name="volume">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="limpo">Est� limpo?</label> <input type="checkbox"
					class="form-control" id="limpo" name="limpo">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" id="tipo"
					placeholder="Automotivo, Cozinha, Hidraulico, Termico, Outro"
					name="tipo">
			</div>
			<br>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>