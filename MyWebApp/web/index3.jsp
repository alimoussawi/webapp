<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <title>Welcome User</title>
  <link rel="stylesheet" href="style3.css">
</head>
<body>
<div class="Welcome">
<h2>Welcome User You Are Signed In</h2>
<input type="button" value="return home" onclick=window.location.href='index.jsp' />
</div> </body> </html>

<!doctype html>
<html>
<head>
    <meta charset="utf-8"> +
    <title>Welcome User</title>
    <link rel="stylesheet" href="style3.css">
</head>
<body>
<div class="Welcome2">
the logged user is :
    <%String name = (String)request.getParameter("username"); %>
    <%= name%>

</div></body></html>