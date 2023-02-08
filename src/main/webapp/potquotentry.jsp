<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Potent Quotables</title>
</head>
<body>
	<h1>Welcome to Potent Quotables!</h1>
	<form action="getPotableServlet" method="post">
	Pick your potion: <br>
	<input type="radio" id="green" name="potionPick" value="GREEN">
    <label for="green">Green Dragon</label><br>
	<input type="radio" id="mauve" name="potionPick" value="MAUVE">
	<label for="mauve">Mauve Pixie</label><br>
	<input type="radio" id="orange" name="potionPick" value="ORANGE">
	<label for="orange">Orange Elf</label><br>
	<input type="radio" id="blue" name="potionPick" value="BLUE">
	<label for="blue">Blue Sphinx</label><br>
	<input type="submit" value="Submit"/>
	</form>
	<a href="index.jsp">Return Home</a>
</body>
</html>