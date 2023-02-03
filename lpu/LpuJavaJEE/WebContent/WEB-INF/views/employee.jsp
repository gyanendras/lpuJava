<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="com.lpu.domain.Employee" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red">
<% out.println("Hello World!");
List<Employee> ls = (List)request.getAttribute("empList");
out.println(ls.size());
for(Employee emp:ls){%>

<table style="border: 2px solid red">
<tr style="border: 1px solid yellow">
<td style="border: 1px solid blue">
<%= emp.getName()%>
</td>
<td style="border: 1px solid blue">
<%= emp.getEmpId()%>
</td>
<td style="border: 1px solid blue">
<%= emp.getSalary()%>
</td>

</tr>

</table>

<% 
}
%>

</h1>
<h2 style="color:blue">
<%=new java.util.Date() %>
</h2>

</body>
</html>