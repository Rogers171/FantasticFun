<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The House of Mad Madam Lib</title>
</head>
<body>
	<h1>Welcome to Mad Madam Lib's</h1>
	<h3>Mad Madam Lib would love to tell you a story, but first she needs some magic words. <br>
	Please give her the following types of magic words!</h3>
	<form action="getMadLibServlet" method="post">
	Please enter a name:
	<input type="text" name="name" size="15"> <br>
	Next, enter an occupation:
	<input type="text" name="occupation" size="20"> <br>
	Next, enter a verb:
	<input type="text" name="verb" size="10"> <br>
	Next, enter a creature:
	<input type="text" name="creature" size="15"> <br>
	Next, enter an adjective:
	<input type="text" name="adjective" size="15"> <br>
	Next, enter a number:
	<input type="text" name="number" size="10"> <br>
	Finally, enter the name of a game:
	<input type="text" name="game" size="15"> <br>
	<input type="submit" value="Submit" />
	</form>
	<a href="index.jsp">Return Home</a>
</body>
</html>