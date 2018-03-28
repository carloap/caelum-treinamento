<!DOCTYPE html>
<html>
	<head>
		<title>Página em jsp</title>
		<meta charset="utf-8" />
	</head>
	<body>
		<%-- comentário em JSP aqui: nossa primeira página --%>
		
		<% 
			String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
		%>
		<% out.println(mensagem); %>
		
		<br />
		
		<% 
			String desenvolvido = "Desenvolvido por Carlos"; 
		%>
		<%= desenvolvido %>
		
		<br />
		
		<% System.out.println("Tudo foi executado"); %>
		
		
	</body>
</html>