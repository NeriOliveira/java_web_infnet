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
		<h3>Cadastro de Res�duo: Entulho</h3>
		<form action="/entulho/incluir" method="post">
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
				<label for="volume">Volume (metros c�bicos):</label> <input
					type="number" step=".01" class="form-control" id="volume"
					placeholder="Exemplo: 231,23" name="volume">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="limpo">O local de coleta � uma obra?</label> <input
					type="checkbox" class="form-control" id="limpo" name="limpo">
			</div>
			<br>
			<div class="mb-3 mt-3">
				<label for="classe">Classe:</label> <input type="text"
					class="form-control" id="classe"
					placeholder="Digite apenas a letra mai�scula: A, B, C ou D"
					name="classe">
			</div>
			<br>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
	<hr>
	<div class="text-center">
		<h6>
			<b>Classifica��o de Entulhos:</b>
		</h6>
		<h6>
			<b>Classe A:</b> res�duos recicl�veis e pass�veis de reutiliza��o
			tais como: tijolos, blocos, telhas, placas de revestimento, argamassa
			e concreto;
		</h6>
		<h6>
			<b>Classe B:</b> res�duos recicl�veis formados por pl�sticos, pap�is,
			metais, vidros e madeiras em geral, incluindo gesso;
		</h6>
		<h6>
			<b>Classe C:</b> res�duos que n�o s�o passiveis de reciclagem ou
			recupera��o por n�o possuir tecnologia desenvolvida para isso;
		</h6>
		<h6>
			<b>Classe D:</b> res�duos perigosos, tais como: tintas, solventes,
			�leos, amianto, produtos de demoli��es, reformas e reparos em
			cl�nicas radiol�gicas, instala��es industriais e outras.
		</h6>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>