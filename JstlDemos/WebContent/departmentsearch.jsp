<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
  driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3307/sqlpractice"
  user="root"
  password="root"
  />
  <sql:query var="deptQuery" dataSource="${conn}">
    select * from Department WHERE Deptno=?
    <sql:param value="${param.Deptno}"/>
   </sql:query>
  
  <c:forEach var="d" items="${deptQuery.rows}">
  
  Department No : 
  <c:out value="${d.Deptno}" /> <br/>
  Department Name : 
  <c:out value="${d.Dname}" /> <br/>
  Department Loc :
  <c:out value="${d.Loc}" /> <br/>
  Department city :
  <c:out value="${d.City}" /> <br/>
  Department head :
  <c:out value="${d.Head}" /> <br/><hr/>
  </c:forEach>
</body>
</html>