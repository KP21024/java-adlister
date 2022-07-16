<%--
  Created by IntelliJ IDEA.
  User: kennypittmanii
  Date: 7/16/22
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Login Page</h1>
<form action="/login" method="post">
    <label for="username">USERNAME:</label>
    <input id="username" type="text"name="username" placeholder="Enter Username">
    <label for="password">PASSWORD:</label>
    <input id="password" type="text"name="password" placeholder="Enter password">

    <button>Login</button>
</form>

</body>
</html>
