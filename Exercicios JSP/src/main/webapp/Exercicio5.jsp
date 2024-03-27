<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Scanner" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio 5</title>
</head>
<body>
	<h1>Exercicio JSP 5 - Exercício de Manipulação de Dados</h1>
	<%ArrayList<String> nomeList = new ArrayList<String>();
	  nomeList.add("Thomas Edson");
	  nomeList.add("Airton Senna");
	  nomeList.add("Marechal Rondon");%>
	  
	   <%for(int i = 0; i < nomeList.size(); i++) {
	           String nome = (String)nomeList.get(i);
	   %>
	   <p></p>
	   <p1><%=nome%></p1>
	  <%} %>
</body>
</html>