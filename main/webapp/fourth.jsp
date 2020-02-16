<%@ page import="pl.coderlab.servletjee.servlet.session.Fourth" %><%--
  Created by IntelliJ IDEA.
  User: soul
  Date: 2/16/20
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fourth</title>
</head>
<body>


<%--    <div class="${Fourth.value == "true" ? "class1" : "class2"}"></div>--%>
    Name: ${empty cookie.foo.getName() ? "Brak" : cookie.foo.getName()}<br>
    Value: ${empty cookie.foo.value ? "Brak" : cookie.foo.value}
</body>
</html>
