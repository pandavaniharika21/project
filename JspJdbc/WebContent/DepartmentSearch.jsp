<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jdbc.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DepartmentSearch.jsp">
<center>
Department No:
<input type="text" name="Deptno" /> <br/><br/>
<input type="submit" value="Search" />
</center>
</form>
<%
if(request.getParameter("Deptno") != null) {
	int Deptno=Integer.parseInt(request.getParameter("Deptno"));
	String cmd="select * from Department where Deptno=?";
	Connection con=DaoConnection.getConnection();
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setInt(1, Deptno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		out.println("Dept Name "+ rs.getString ("Dname") +"<br/>");
		out.println("Location "+rs.getString("Loc")+"<br/>");
		out.println("City "+rs.getString("City") +"<br/>");
		out.println("head "+rs.getString("Head") +"<br/><hr/>");
	}
	else
	{
		out.println("**Record not found**");
	}
}
%>

</body>
</html>