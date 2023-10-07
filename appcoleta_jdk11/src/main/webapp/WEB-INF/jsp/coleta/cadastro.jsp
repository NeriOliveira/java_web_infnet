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
		<h3>Cadastro de Pedido de Coleta:</h3>
		<form action="/coleta/incluir" method="post">
	    <div class="form-group">
	      <label>Descrição:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descrição" name="descricao">
	    </div>
	    <div class="form-group">
	      <label>Data:</label>
	      <input type="datetime-local" class="form-control" name="dtSolicitante">
	    </div>
	    <div class="form-group">
	      <label>Status:</label>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="pendente" value="true"> Pendente
			  <label class="form-check-label"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input" name="pendente" value="false"> Coletado
			  <label class="form-check-label"></label>
			</div>
	    </div>

	    <div class="form-group">
	      <label>Solicitante:</label>
	      <select name="solicitante" class="form-control">
	      	<c:forEach var="s" items="${solicitantes}">
	      		<option value="${s.id}">${s.nome}</option>
	      	</c:forEach>
	      </select>
	    </div>

	    <div class="form-group">
	      <label>Resíduos:</label>
	      	<c:forEach var="r" items="${residuos}">
				<div class="form-check">
				  <input class="form-check-input" type="checkbox" name="residuos" value="${r.id}">
				  <label class="form-check-label"> ${r.nome}</label>
				</div>	   
			</c:forEach>   
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
	<c:import url="/WEB-INF/jsp/footer.jsp" />
</body>
</html>