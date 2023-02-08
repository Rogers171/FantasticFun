<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quote</title>
</head>
<body>
	<h3>As you drink the potion, a quote comes to mind...</h3>
	<p>${quotable.determineQuote()}</p>
	<a href="potquotentry.jsp">Consume Another Potion</a>
	<a href="index.jsp">Return Home</a>
</body>
</html>