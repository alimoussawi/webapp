<%--
  Created by IntelliJ IDEA.
  User: alous
  Date: 2/6/2018
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>login form</title>
</head>
<body>
<body style="background-color:#e6396f;"</body>

<form method="post" action="login">
  <b>username:</b><input type="text" name="username" /><br/>
  <b>Password:</b><input type="password" name="pass" /><br/>
  <input type="submit" value="login" />
  <% String date=new java.util.Date().toString();
    out.println(date);%>
</form>


</body>
</html>

