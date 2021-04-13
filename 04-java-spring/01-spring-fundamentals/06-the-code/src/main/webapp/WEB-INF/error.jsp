<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error!</title>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
	<h1>You must train harder!</h1>
	<h2>What is the code?</h2>
	<form method="POST" action="/">
		<label>Code: <input type="text" name="guess"></label>
		<button>Try Code</button>
	</form>
</body>