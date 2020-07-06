<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	<form:form 	action="saveContact"
				modelAttribute="contactDTO"
				method="POST">
		<table>
			<tr>
				<td><form:hidden path="contactId"/></td>
			</tr>
			<tr>
				<td>Contact Name : </td>
				<td><form:input path="contactName"/></td>
			</tr>
			<tr>
				<td>Contact Email : </td>
				<td><form:input path="contactEmail"/></td>
			</tr>
			<tr>
				<td>Contact Phone : </td>
				<td><form:input path="contactPhone"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"/></td>
				<td><input type="submit" value="submit"/></td>
			</tr>
		</table>
	</form:form>
	
	<a href="viewAllContacts">View all Contacts</a>
</body>
</html>