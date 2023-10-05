<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Classes de Dom�nio (Neg�cio)</h2>
		<h3>Coleta</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>String</td>
					<td>Detalhamento da solicita��o de coleta</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDateTime</td>
					<td>Data e Hora de realiza��o da solicita��o de coleta</td>
				</tr>
				<tr>
					<td>pendente</td>
					<td>boolean</td>
					<td>Indicativo se j� foi realizado a coleta ou n�o</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="container mt-3">
		<h3>Solicitante</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nome</td>
					<td>String</td>
					<td>Nome do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
				<tr>
					<td>cpf</td>
					<td>String</td>
					<td>CPF do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
				<tr>
					<td>email</td>
					<td>String</td>
					<td>E-mail do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="container mt-3">
		<h3>Residuo</h3>
		<h6>(Classe Abstrata)</h6>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nome</td>
					<td>String</td>
					<td>Nome do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
				<tr>
					<td>cpf</td>
					<td>String</td>
					<td>CPF do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
				<tr>
					<td>email</td>
					<td>String</td>
					<td>E-mail do usu�rio respons�vel pela solicita��o de coleta</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="container mt-3">
		<h3>Oleo</h3>
		<h6>(Extends Residuo)</h6>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>volume</td>
					<td>float</td>
					<td>Volume medido em litros do res�duo que o Solicitante
						deseja que seja coletado para destina��o.</td>
				</tr>
				<tr>
					<td>isLimpo</td>
					<td>boolean</td>
					<td>O res�duo est� limpo?</td>
				</tr>
				<tr>
					<td>tipo</td>
					<td>OleoTipo (ENUM)</td>
					<td>Cozinha, Automotivo, Termico, Hidraulico ou Outro.</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="container mt-3">
		<h3>Reciclavel</h3>
		<h6>(Extends Residuo)</h6>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>peso</td>
					<td>float</td>
					<td>Peso medido em quilograma (kg) do res�duo que o
						Solicitante deseja que seja coletado para destina��o.</td>
				</tr>
				<tr>
					<td>isLimpo</td>
					<td>boolean</td>
					<td>O res�duo est� limpo?</td>
				</tr>
				<tr>
					<td>tipo</td>
					<td>ReciclavelTipo (ENUM)</td>
					<td>Papel, Metal, Plastico, Vidro ou Madeira.</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<div class="container mt-3">
		<h3>Entulho</h3>
		<h6>(Extends Residuo)</h6>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Campo</th>
					<th>Tipo</th>
					<th>Observa��o</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>volume</td>
					<td>float</td>
					<td>Volume medido em metro c�bico (m�) do res�duo que o
						Solicitante deseja que seja coletado para destina��o.</td>
				</tr>
				<tr>
					<td>isObra</td>
					<td>boolean</td>
					<td>O res�duo est� em uma obra?</td>
				</tr>
				<tr>
					<td>tipo</td>
					<td>EntulhoClasse (ENUM)</td>
					<td>Classes A, B C ou D com base na Resolu��o CONAMA 307/2002.</td>
				</tr>
			</tbody>
		</table>
	</div>
	<hr>
	<c:import url="/WEB-INF/jsp/footer.jsp" />

</body>
</html>