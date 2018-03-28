<%@ page import = "java.util.*,
		br.com.caelum.agenda.dao.*,
		br.com.caelum.agenda.modelo.*" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Scriptlet lista de contatos</title>
		<style type="text/css">
		* { margin:0;padding:0 }
		body { font-family:arial, verdana; font-size:15px }
		table { width:100% }
		table thead tr { background-color:#444; color:#ececec }
		table tbody tr { background-color:#eee; }
		table tbody tr td {transition:0.5s }
		table tbody tr td:hover { background-color:#666; font-size:20px; transition:0.2s }
		
		</style>
	</head>
	<body>
		<table cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Endereço</th>
					<th>Data Nasc.</th>
				</tr>
			</thead>
			<tbody>
			<% ContatoDao dao = new ContatoDao(); %>
			<% List<Contato> contatos = dao.getLista(); %>
			
			<% for(Contato contato : contatos) { %>
				<tr>
					<td><%=contato.getNome() %></td>
					<td><%=contato.getEmail() %></td>
					<td><%=contato.getEndereco() %></td>
					<td><%=contato.getDataNascimento().getTime() %></td>
				</tr>
			<% } %>
			</tbody>
		</table>
	</body>
</html>