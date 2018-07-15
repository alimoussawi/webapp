<%--
  Created by IntelliJ IDEA.
  User: alous
  Date: 2/11/2018
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-9">
    <title>admin</title>
    <link rel="stylesheet" href="style2.css">

</head>
<body>
<div class="Admin">
        <h2>Admin </h2>
        <form method="post" action="Register">
    <p>username:</p>
            <input type="text" name="username" />
    <p>Password:</p>
            <input type="password" name="pass" />

    <input type="submit" value="add user" />

    <input type="button" value="return home" onclick=window.location.href='index.jsp' />
</form>
</div>
</body>
</html>
