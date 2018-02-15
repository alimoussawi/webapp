<!doctype html>
<html>
<head>
  <meta charset="utf-9">
  <title>Welcome Admin</title>
  <link rel="stylesheet" href="style4.css">
</head>
<body>
<div class="Welcome3">
<h2>Welcome ADMIN <%String name = (String)request.getParameter("username"); %>
    <%= name%> You Are Signed In</h2>
<input type="button" value="edit users" onclick=window.location.href='index2.jsp' />
</div>
</body>
</html>

