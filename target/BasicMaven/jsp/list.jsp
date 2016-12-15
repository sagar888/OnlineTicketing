<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Requote SUmmary Page</title>
</head>
<body>
<h1>Welcome for your </h1>
<form method = "post" action="/requote/affectedProduct/">


<input name="name" value ="${user.name}"/>
<input type="text" name="id" value ="${user.id}"/>
<input name="serialId" value ="${user.serialId}"/>
<input name="cost" value ="${user.cost}"/>
<input name="product" value ="${user.product}"/>

<input type="submit" value="save"/>


</form>
<h1>Requote data</h1>
</body>
</html>