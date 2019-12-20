<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>ToastElevators</title>
</head>
<body>
	<p>There are <c:out value="${ toasters.size() }"/> toaster to look at today!</p>
	<c:forEach var="toaster" items="${ toasters }">
		<h2>
			<c:out value="${ toaster.brand }"/>
		</h2>
		<p>
		Number of slots: <c:out value="${ toaster.numberOfSlots }"/>
		</p>
		<p>
		$ <c:out value="${ toaster.cost }"/>
	</c:forEach>
</body>
</html>