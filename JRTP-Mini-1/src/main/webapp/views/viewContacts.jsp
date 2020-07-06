<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css" rel="stylesheet" type="text/javascript"/>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<script>
	function deleteConfirmation() {
		return confirm("Are you sure you want to delete the contact ?");
	}
	
	$(document).ready(function() {
	    $('#contact').DataTable( {
	        "pagingType": "full_numbers"
	    } );
	} );
</script>
</head>
<body>

	<p><a href="addContact">Add New Contact</a>
	<table border = "1" id="contact">
		<thead>
			<th>SN</th>
			<th>Contact Name</th>
			<th>Contact Email</th>
			<th>Contact Phone</th>
			<th>Action</th>
		</thead>
		<tbody>
			<c:forEach items="${cdto}" var="c" varStatus="index">
		<tr>
				<td>${index.count }</td>
				<td>${c.contactName }</td>
				<td>${c.contactEmail }</td>
				<td>${c.contactPhone }
				<td>
					<a href="editContact?contactId=${c.contactId}">Edit</a> |
					<a href="deleteContact?contactId=${c.contactId }" onclick="deleteConfirmation()">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>