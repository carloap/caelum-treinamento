<%@ page import = "java.util.*,
		br.com.caelum.agenda.dao.*,
		br.com.caelum.agenda.modelo.*" %>
		
<!-- essa linha abaixo é importante! -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>Tag padrão para JSP - JSTL</title>
		
		<style type="text/css">
			* { margin:0;padding:0 }
			body { font-family:arial, verdana; font-size:15px }
			.center {text-align:center}
			hr { margin:10px 0 }
			
			table { width:100% }
			table thead tr { background-color:#444; color:#ececec }
			table tbody tr { background-color:#eee; }
			table tbody tr td {transition:0.5s }
			table tbody tr td:hover { background-color:#666; font-size:20px; transition:0.2s }
		</style>
		
	</head>
	<body>
	
	<c:import url="_cabecalho.jsp" />
	
		<!-- cria o DAO. De acordo com a arquitetura MVC, instanciar objetos de Model dentro da View(aqui) não é boa prática! -->
		<!--- jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" / --->
		
		<a href="./adiciona-contato.jsp" target="blank">Adicionar</a>
			
		<table cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Endereço</th>
					<th>Data Nasc.</th>
					<th>Lógica</th>
				</tr>
			</thead>
			<tbody>
			
			<c:forEach var="contato" items="${contatos}"> <!-- agora, sem o useBean, nada será listado se não for acessado pelo "mvc?logica=ListaContatoLogica" -->
				<tr>
					<td>${contato.id}</td>
					<td>${contato.nome}</td>
					<td>
						
						<c:choose>
							<c:when test="${!empty contato.email}">
								<a href="mailto:${contato.email}">${contato.email}</a>
							</c:when>
							<c:otherwise>
								Email não informado!
							</c:otherwise>
						</c:choose>
						
					</td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
					<td>
						<a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a>
						|
						<a href="mvc?logica=BuscarContatoLogica&id=${contato.id}">Alterar</a>
					</td> <!-- bem loko! -->
				</tr>
			</c:forEach>
			
			</tbody>
		</table>
		
	<c:import url="_rodape.jsp" />
	
	</body>
	
</html>