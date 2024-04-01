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
	<ul>
	<%
		List<Service> services = (List) request.getAttribute("services");
		if (services != null) {
			for (Service s: services) {
	%>
			<li>Name: <%=s.getServiceName() %> | "Description: <%=s.getServiceDescription() %> 
				| <%=s.getServicePrice() %>"</li>
		<%}} %>
	</ul>
</body>
</html>