<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Department</h1>
       <form:form method="POST" action="/MvcDepartmentCrud/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="deptno" /></td>
         </tr> 
         <tr>  
          <td>Department Name : </td> 
          <td><form:input path="Deptname"  /></td>
         </tr>  
         <tr>  
          <td>Location :</td>  
          <td><form:input path="loc" /></td>
         </tr> 
         <tr>  
          <td>City :</td>  
          <td><form:input path="city" /></td>
         </tr> 
          <tr>  
          <td>head :</td>  
          <td><form:input path="head" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  