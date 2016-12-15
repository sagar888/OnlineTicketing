<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ page import ="com.test.basic.web.entity.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="/final">

<input name ="id" value ="${basicSession.getDataFromSession("UserData").id}"/>
<input name ="name" value ="${basicSession.getDataFromSession("UserData").name}"/>
<input name ="newPrice" value ="${basicSession.getDataFromSession("UserData").newPrice}"/>


</form>

</body>
</html>