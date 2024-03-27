<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio 3</title>
</head>
<body>
	<h1>Exercicio JSP 3 - Exercício de Condição</h1>
	<p1>Resgate o segredo informando a senha abaixo:</p1>
	<p></p>
	<form>
		<input type="text" id="senha" name="senha">
		<button type="submit">Autenticar</button>
	</form>
	<p></p>
	<%String userInput = request.getParameter("senha"); 
	  
	 if(userInput != null && userInput.equals("12345")){%>
	  	<p1>R. Heitor Lacerda Guedes, 1000 - Cidade Satélite Íris, Campinas</p1>
    <%}%>
    <%if(userInput != null && !userInput.equals("12345")){%>
	  	<p1>Senha errada!</p1>
	<%} %>
</body>
</html>