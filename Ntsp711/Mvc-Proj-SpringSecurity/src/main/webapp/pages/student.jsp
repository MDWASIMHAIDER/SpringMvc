<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <h1>Student Page</h1>
    Logged User:<%=request.getUserPrincipal().getName()%>
    
   <br> <a href="../index.jsp">Home</a>&nbsp;&nbsp;
<a href="../logout">Logout</a>