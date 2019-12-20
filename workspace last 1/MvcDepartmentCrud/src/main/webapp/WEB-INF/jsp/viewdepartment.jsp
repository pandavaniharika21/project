<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Department List</h1>
<table border="2" width="70%" cellpadding="2">
<tr><th>Deptno</th><th>Deptname</th><th>Loc</th><th>City</th><th>Head</th></tr>
<c:forEach var="department" items="${list}">
<tr>
<td>${department.deptno}</td>
<td>${department.Deptname}</td>
<td>${department.loc}</td>
<td>${department.city}</td>
<td>${department.head}</td>
<td><a href="editdepartment/${department.deptno}">Edit</a></td>
<td><a href="deletedepartment/${department.deptno}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br/>
<a href="departmentform">Add New Department</a>
