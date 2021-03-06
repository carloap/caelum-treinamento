<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>

	<a href="novaTarefa">Criar nova tarefa</a>
	<br /><br />
	
	<table>
		<tr>
			<th>ID</th>
			<th>Descri��o</th>
			<th>Finalizado?</th>
			<th>Data de finaliza��o</th>
			<th>A��es</th>
		</tr>
		<c:forEach items="${tarefas}" var="tarefa">
			<tr>
				<td>${tarefa.id}</td>
				<td>${tarefa.descricao}</td>
				<c:if test="${tarefa.finalizado eq false}">
					<td>N�o finalizado</td>
				</c:if>
				<c:if test="${tarefa.finalizado eq true}">
					<td>Finalizado</td>
				</c:if>
				<td>
					<fmt:formatDate
						value="${tarefa.dataFinalizacao.time}"
						pattern="dd/MM/yyyy" />
				</td>
				<td>
					<a href="removeTarefa?id=${tarefa.id}">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>