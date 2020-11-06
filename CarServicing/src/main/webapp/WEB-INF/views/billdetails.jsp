<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BillDetails Page</title>
</head>
<body>

	<div align="center">
		<h1>BillDetails</h1>
		<form:form action="billdetails" method="post" modelAttribute="billdetails">
			<table border=1>
				<tr>
					<td>Id</td>
					<td><form:input type="text" path="id" style="width: 120px"
							placeholder="Enter your id" /><font color="red"><form:errors
								path="id"></form:errors></font></td>
				</tr>
				<tr>
					<td>BillAmount</td>
					<td><form:input type="text" path="billAmount" style="width: 120px"
							placeholder="Enter your billAmount" /><font color="red"><form:errors
								path="billAmount"></form:errors></font></td>
				</tr>
		        <tr>
					<td>UserId</td>
					<td><form:input type="text" path="userId" style="width: 120px"
							placeholder="Enter your UserId" /><font color="red"><form:errors
								path="userId"></form:errors></font></td>
				</tr>
				<tr>
					<td>ServiceCenterId</td>
					<td><form:input type="text" path="serviceCenterId" style="width: 120px"
							placeholder="Enter your serviceCenterId" /><font color="red"><form:errors
								path="serviceCenterId"></form:errors></font></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="save"> <input type="reset" value="Reset">
						<a href="deliveryboy">deliveryboy</a></td>
				</tr>	
			</table>
		</form:form>
	</div>
</body>
</html>
