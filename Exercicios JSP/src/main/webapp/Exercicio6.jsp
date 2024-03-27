<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio 6</title>
</head>
<body>
	<h1>Exercicio JSP 6 - Exercício de Uso de Funções</h1>
	<%!
	public int soma(int a, int b) {
    return a + b;
}	
%>
	<p>Resultado: <%=soma(1,2)%></p>
	
</body>
</html>