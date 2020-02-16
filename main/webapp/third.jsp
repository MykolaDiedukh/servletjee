<%--
  Created by IntelliJ IDEA.
  User: soul
  Date: 2/16/20
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>third</title>
</head>
<body>
<%--    ${empty param.a ? null : not null}--%>
    ${empty param.a ? "Brak" : param.a} <br>
    ${empty param.b ? "Brak" : param.b}

</body>
</html>
