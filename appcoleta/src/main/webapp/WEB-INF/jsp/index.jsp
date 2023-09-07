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
	Patrick Neri de Oliveira
	<div class="container mt-3">
		<h2>Classe de Dom�nio (Neg�cio)</h2>
		<p>Coleta</p>
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
					<td>Data e Hora de realiza��o da solicita��o de colet.</td>
				</tr>
				<tr>
					<td>pendente</td>
					<td>boolean</td>
					<td>Indicativo se j� foi realizado a coleta ou n�o</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>