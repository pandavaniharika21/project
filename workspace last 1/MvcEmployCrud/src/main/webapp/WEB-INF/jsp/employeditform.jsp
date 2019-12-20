<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Employee</h1>
       <form:form method="POST" action="/MvcEmployCrud/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="empno" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Dept :</td>  
          <td><form:input path="dept" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="desig" /></td>
         </tr> 
          <tr>  
          <td>basic :</td>  
          <td><form:input path="basic" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  