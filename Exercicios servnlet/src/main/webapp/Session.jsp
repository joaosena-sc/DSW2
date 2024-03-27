<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SessionServlet" method="get">
		<button type="submit">Count</button>
	</form>
	<p></p>
	<%if(request.getAttribute("contSession")!=null){%>
	<p><%=request.getAttribute("contSession") %></p>
	<%}%>
	
</body>
</html>