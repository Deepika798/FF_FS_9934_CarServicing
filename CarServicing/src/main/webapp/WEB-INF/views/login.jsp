<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>


	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="login" method="post" modelAttribute="login">
			<table border=1>
				<tr>
					<td>Id</td>
					<td><form:input type="text" path="Id" style="width: 120px"
							placeholder="Enter your Id" /><font color="red"><form:errors
								path="Id"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login">
						<a href="servicecenter">servicecenter</a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
