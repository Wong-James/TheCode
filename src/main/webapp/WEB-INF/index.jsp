<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ALL DONE!</title>
	</head>
	<body>
		<p><c:out value="${error}"/></p>
		<form method="POST" action="/login">
    		<label>What is the code? </label>
    		<br/>
    		<input type="text" name="secretcode">
    		<br/>
    		
    		<button>Try Code</button>
		</form>
	</body>
</html>