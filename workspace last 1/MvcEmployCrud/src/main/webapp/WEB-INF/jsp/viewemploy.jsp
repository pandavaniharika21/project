<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Empno</th><th>Name</th><th>Dept</th><th>Desig</th><th>Basic</th></tr>
<c:forEach var="employ" items="${list}">
<tr>
<td>${employ.empno}</td>
<td>${employ.name}</td>
<td>${employ.dept}</td>
<td>${employ.desig}</td>
<td>${employ.basic}</td>
<td><a href="editemploy/${employ.empno}">Edit</a></td>
<td><a href="deleteemploy/${employ.empno}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br/>
<a href="employform">Add New Employee</a>
