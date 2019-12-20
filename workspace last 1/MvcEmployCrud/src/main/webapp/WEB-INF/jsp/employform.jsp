<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table >  
      	<tr>  
          <td>Employ No : </td> 
          <td><form:input path="empno"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Department :</td>  
          <td><form:input path="dept" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="desig" /></td>
         </tr> 
         <tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="basic" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  