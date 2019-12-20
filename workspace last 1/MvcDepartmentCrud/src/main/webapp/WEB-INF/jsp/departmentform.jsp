<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<h1>Add New Department</h1>
       <form:form method="post" action="save">  
      	<table >  
      	<tr>  
          <td>Department No : </td> 
          <td><form:input path="deptno"  /></td>
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
         <tr>  
          <td>Head :</td>  
          <td><form:input path="head" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  