<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP Coleta Seletiva</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<p><b>Aluno:</b> Patrick Neri de Oliveira</p>
	<p><b>Professor:</b> Elberth Moraes</p>
	
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
	
		<div class="container mt-3">
		<h3>Residuo</h3>
		<h4>Classe Abstrata</h4>
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
	
	
</body>
</html>