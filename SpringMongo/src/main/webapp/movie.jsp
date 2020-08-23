<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h2>Welcome to the Movies</h2>
<sf:form action="getMovie" modelAttribute= "movie" >
<sf:label path = "year">Year</sf:label>
<sf:input path="year" name="year"/> 
<input type="submit" value = "submit">
</sf:form>
</body>
</html>