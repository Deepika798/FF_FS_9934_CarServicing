<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Registration</title>
</head>
<body>


	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>FirstName</td>
					<td><form:input type="text" path="firstName"
							style="width: 120px" placeholder="Enter your FirstName" /><font
						color="red"><form:errors path="firstName"></form:errors></font></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><form:input type="text" path="lastName"
							style="width: 120px" placeholder="Enter your LastName" /><font
						color="red"><form:errors path="lastName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input type="text" path="age" style="width: 120px"
							placeholder="Enter your Age" /><font color="red"><form:errors
								path="age"></form:errors></font></td>
				</tr>
				<tr>
					<td>ContactNumber</td>
					<td><form:input type="text" path="contactNumber"
							style="width: 120px" placeholder="Enter your ContactNumber" /><font
						color="red"><form:errors path="contactNumber"></form:errors></font></td>
				</tr>
				<tr>
					<td>Id</td>
					<td><form:input type="text" path="id" style="width: 120px"
							placeholder="Enter your Id" /><font color="red"><form:errors
								path="id"></form:errors></font></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><form:select path="gender" id="Gender"
							style="width: 127px">
							<option value=1>Male</option>
							<option value=2>Female</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color="red"><form:errors
								path="password"></form:errors></font></td>
				</tr>

				<tr>
					<td>Confirm Password</td>
					<td><form:input type="password" path="confirmPassword"
							style="width: 120px" /><font color="red"><form:errors
								path="confirmPassword"></form:errors></font></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><form:select path="roleId" id="Id"
							style="width: 127px">
							<option value=1>User</option>
							<option value=2>DeliveryBoy</option>
							<option value=3>Admin</option>
						</form:select></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Register"> <input type="reset" value="Reset">
						<a href="login">Login</a><a href="home"></a></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
