<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Madam Lib's Story</title>
</head>
<body>
	<p>${madLibStory.createMadLib()}</p>
	<a href="madlibentry.jsp">Craft a New Story</a>
	<a href="index.jsp">Return to Home</a>
</body>
</html>