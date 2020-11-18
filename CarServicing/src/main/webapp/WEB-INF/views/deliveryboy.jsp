<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeliveryBoy </title>
</head>
<body>

	<div align="center">
		<h1>DeliveryBoy Details</h1>
		<form:form action="deliveryboy" method="post" modelAttribute="deliveryboy">
			<table border=1>
				<tr>
					<td>Id</td>
					<td><form:input type="text" path="id" style="width: 120px"
							placeholder="Enter your Id" /><font color="red"><form:errors
								path="id"></form:errors></font></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name" style="width: 120px"
							placeholder="Enter your name" /><font color="red"><form:errors
								path="name"></form:errors></font></td>
				</tr>
				<tr>
					<td>PhoneNumber</td>
					<td><form:input type="text" path="phoneNumber" style="width: 120px"
							placeholder="Enter your phoneNumber" /><font color="red"><form:errors
								path="phoneNumber"></form:errors></font></td>
				</tr>	
				<tr>
					<td>roleId</td>
					<td><form:input type="text" path="roleId" style="width: 120px"
							placeholder="Enter your roleId" /><font color="red"><form:errors
								path="roleId"></form:errors></font></td>
				</tr>	
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="save"> <input type="reset" value="Reset">
				</tr>	
			</table>
		</form:form>
	</div>
</body>
</html>
