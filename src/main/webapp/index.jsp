<!DOCTYPE html>
<html>
<head>
<title>Welcome to servlet</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">

</head>
<body>

<div class="container">
<%@include file="menu.jsp" %> 
<h1>This is a Index Page</h1>
<p>This is a paragraph.</p>

<form action="<%= request.getContextPath() %>/third" method="post">
<input name="message" type="text" placeholder="Enter text here">
<button type="submit">Submit</button>
</form>
</div>
<script src="<%= request.getContextPath() %>/js/script.js"></script>
</body>
</html>