<!DOCTYPE html>
<html>
	<head>
		<title>P�gina em jsp</title>
		<meta charset="utf-8" />
	</head>
	<body>
		<%-- coment�rio em JSP aqui: nossa primeira p�gina --%>
		
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