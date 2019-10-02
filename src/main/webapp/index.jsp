
<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello, Servlets!</title>
</head>
<body>

<c:set var="firstName" value="Marek" scope="session"/>
${firstName}

<h1>Hello, ${firstNameForm}!</h1>
<form action="/hello" method="get">
    <input type="text" name="firstNameForm">
    <input type="submit" value="add">
</form>
</body>
</html>
