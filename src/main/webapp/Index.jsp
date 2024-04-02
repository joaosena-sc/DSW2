<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Service" %>
<%@ page import="model.Session" %>
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
			<li>ID Servico: <%=s.getServiceId()%> | Name: <%=s.getServiceName()%> | Description: <%=s.getServiceDescription() %> 
				| <%=s.getServicePrice()%> 
				<a href="deleteService?id=<%=s.getServiceId()%>">Delete</a></li>
		<%}} %>
	</ul>
	<br>
	<br>
	<h3>Cadastrar um novo serviço</h3>
	<form  action="addService" method="post">
		Nome:<input type="text" name="name" requeried>
		Descrição:<input action="addService" type="text" name="description" requeried>
		Preço:<input action="addService" type="number" name="price" requeried>
		<p></p>
		<button type="submit" value="addService">Cadastrar</button>
	</form>
	<p>
	</p>
	<h3>Agendar uma nova sessao</h3>
	<form method="post" action="addSession">
		ID Servico:<input type="text" name="idServiceForSession" requeried>
		<button type="submit" value="addSession">Concluir</button>
	</form>
	<h3>Sessoes agendadas</h3>
	<ul>
	<%
		List<Session> sessions = (List) request.getAttribute("sessions");
		if (sessions != null) {
			for (Session se: sessions) {
	%>
			<li>ID Session: <%=se.getSessionId() %> | ServiceId: <%=se.getSessionServiceId() %> 
			| Date Time: <%=se.getSessionDateTime() %> 
				<a href="deleteSession?id=<%=se.getSessionId() %>">Delete</a></li>
		<%}} %>
	</ul>
</body>
</html>