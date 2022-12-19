<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
 	<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body >
	<div class="container  text-center">
		<h2 class="form-heading">Welcome</h2>
		<h4 class="text-center"><a href="${contextPath}/register">Sign Up</a></h4>
		<h4 class="text-center"><a href="${contextPath}/login">Sign In</a></h4>
	</div>
</body>
</html>