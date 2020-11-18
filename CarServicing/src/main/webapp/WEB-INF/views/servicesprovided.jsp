<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ServicesProvided Page</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to ServicesProvided</h1>
		<form:form action="servicesprovided" method="post" modelAttribute="servicesprovided">
			<table border=1>
				<tr>
					<td>ServiceName</td>
					<td><form:input type="text" path="serviceName" style="width: 120px"
							placeholder="Enter your serviceName" /><font color="red"><form:errors
								path="serviceName"></form:errors></font></td>
				</tr>
				<tr>
					<td>ServiceCost</td>
					<td><form:input type="text" path="serviceCost" style="width: 120px"
							placeholder="Enter your ServiceCost" /><font color="red"><form:errors
								path="serviceCost"></form:errors></font></td>
				</tr>	
				<tr>
					<td>ServiceCenterId</td>
					<td><form:input type="text" path="serviceCenterId" style="width: 120px"
							placeholder="Enter your ServiceCenterId" /><font color="red"><form:errors
								path="serviceCenterId"></form:errors></font></td>
				</tr>	
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Save"> <input type="reset" value="Reset">
						</td>
				</tr>	
			</table>
			
			<a href="billdetails">billdetails</a>
			<a href="deliveryboy">DeliveryBoy</a>
			
		</form:form>
	</div>
</body>
</html>
