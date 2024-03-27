<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio 4</title>
</head>
<body>
	<h1>Exercicio JSP 4 - Exercício de Interação com o Usuário</h1>
	
	<%String nomeUser = request.getParameter("nomeUser");
	  if(nomeUser==null || nomeUser.equals("")){%>
	<p1><b>Informe seu nome:</b></p1>
	<%}%>
	
	<form>
		<input type="text" id="nomeUser" name="nomeUser">
		<button type="submit">Enviar</button>
	</form>
	<p></p>
	<p></p>
	
	<%
	  if(nomeUser != null && !nomeUser.equals("")){%>
	<p1><%=nomeUser%>, seja bem-vindo!</p1>
	<%}%>
</body>
</html>