<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<!DOCTYPE html>
<html lang="pt">
	<head>
		<title>Adiciona Contatos</title>
		<meta charset="utf-8">
		<style type="text/css">
			* { margin:0;padding:0 }
			body { font-family:arial, verdana; font-size:15px }
			.center {text-align:center}
			hr { margin:10px 0 }
		</style>
		
		<link href="./recursos/css/jquery.css" rel="stylesheet">
		<script src="./recursos/js/jquery.js" type="text/javascript"></script>
		<script src="./recursos/js/jquery-ui.js" type="text/javascript"></script>
		
	</head>
	<body>
	
		<c:import url="_cabecalho.jsp" />
		
		<form action="./adiciona-contato.do" method="post">
			<label>Nome:<br>
				<input name="nome" /> 
			</label> <br>
			<label>E-mail:<br>
				<input name="email" />
			</label> <br>
			<label>Endereço:<br>
				<input name="endereco" />
			</label> <br>
			<label>Dt. Nasc:<br>
				<caelum:campoData id="dtNasc" />
			</label> <br>
			
			<input type="submit" value="enviar!" />
		</form>
		
		<c:import url="_rodape.jsp" />
		
	</body>
</html>