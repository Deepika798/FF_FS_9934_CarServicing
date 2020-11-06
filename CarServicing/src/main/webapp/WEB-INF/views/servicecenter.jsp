<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ServiceCenter Page</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to ServiceCenter</h1>
		<form:form action="servicecenter" method="post" modelAttribute="servicecenter">
			<table border=1>
				
				<tr>
					<td>CenterName</td>
					<td><form:input type="text" path="centerName" style="width: 120px"
							placeholder="Enter your Name" /><font color="red"><form:errors
								path="centerName"></form:errors></font></td>
				</tr>
				
				<tr>
					<td>FullAddress</td>
					<td><form:input type="text" path="fullAddress" style="width: 120px"
							placeholder="Enter your fullAdress" /><font color="red"><form:errors
								path="fullAddress"></form:errors></font></td>
				</tr>
				
				<tr>
					<td>ContactNumber</td>
					<td><form:input type="text" path="contactNumber" style="width: 120px"
							placeholder="Enter your ContactNumber" /><font color="red"><form:errors
								path="contactNumber"></form:errors></font></td>
				</tr>
				<tr>
					<td>StartDate</td>
					<td><form:input type="text" path="startDate" style="width: 120px"
							placeholder="Enter your date" /><font color="red"><form:errors
								path="startDate"></form:errors></font></td>
				</tr>
				<tr>
					<td>EndDate</td>
					<td><form:input type="text" path="endDate" style="width: 120px"
							placeholder="Enter your date" /><font color="red"><form:errors
								path="endDate"></form:errors></font></td>

				</tr>
				<tr>
					<td>rating</td>
					<td><form:select path="rating" id="rating"
							style="width: 127px">
							<option value=1>1</option>
							<option value=2>2</option>
							<option value=3>3</option>
							<option value=4>4</option>
							<option value=5>5</option>				
						</form:select></td>
				</tr>
				<tr>
					<td>DeliveryBoyId</td>
					<td><form:input type="text" path="deliveryBoyId" style="width: 120px"
							placeholder="Enter your Id" /><font color="red"><form:errors
								path="deliveryBoyId"></form:errors></font></td>
				</tr>
				
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="save"> <input type="reset" value="Reset">
						<a href="servicesprovided">ServicesProvided</a></td>
				</tr>
				
			</table>
		</form:form>
	</div>
</body>
</html>
