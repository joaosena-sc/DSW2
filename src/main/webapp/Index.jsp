<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Service" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Clinica de Estetica</title>
</head>
<body>
	<h3>Serviços</h3>
	<ul>
	<%
		List<Service> services = (List) request.getAttribute("services");
		if (services != null) {
			for (Service s: services) {
	%>
			<li>Name: <%=s.getServiceName() %> | Description: <%=s.getServiceDescription() %> 
				| <%=s.getServicePrice() %></li>
		<%}} %>
	</ul>
	<br>
	<br>
	<h3>Adicione um novo serviço</h3>
	<form  action="addService" method="post">
		<p>Nome:</p>
		<input type="text" name="name" requeried><br>
		<p>Descrição:</p>
		<input action="addService" type="text" name="description" requeried><br>
		<p>Preço:</p>
		<input action="addService" type="text" name="price" requeried><br>
		<button type="submit" value="addService">Cadastrar</button>
	</form>
	
	
</body>
</html>