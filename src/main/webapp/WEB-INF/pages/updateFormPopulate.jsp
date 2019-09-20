<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

	<fr:form action="updateSuccess" modelAttribute="student">
		ID: <fr:input path="id"/><br>
		Name:<fr:input path="name"/><br>
		Branch:<fr:input path="branch"/><br>
	
			<input type="submit" value="submit">
	</fr:form>
</body>
</html>