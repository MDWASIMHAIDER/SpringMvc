<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table>
	<form:form commandName="cmdData">
		<tr><td>Student Name:</td><td><form:input path="name"/></td></tr>
		<tr><td>Date of Birth:</td><td><form:input path="dob"/></td></tr>
		<tr><td>Date of joining:</td><td><form:input path="doj"/></td></tr>
		<tr><td>Date of Marriage:</td><td><form:input path="dom"/></td></tr>
		<tr><td><input type="submit" value="Register"/></td></tr>
	</form:form>
</table>
<c:if test="${!empty cmdData}">
	<h1>${cmdData}</h1>
</c:if>
 --%>
 
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style="color:red;text-align:center">Registration Page </h1>

<form:form method="POST" commandName="cmdData">
  <%--  <p style="color:red">
       <form:errors path="*"/>
   </p> --%> <br>
     Employee name:: <form:input path="name"/> <br>
     DOB:: <form:input path="dob"/>(dd-MM-yyyy) <br>
     DOJ:: <form:input path="doj"/>(dd-MM-yyyy) <br>
     DOM:: <form:input path="dom"/>(dd-MM-yyyy) <br>
     <input type="submit"  value="register"/>
</form:form>
 <%-- <br><br>
  <c:if test="${!empty cmdData }">
      command obj data is :: ${cmdData}
 </c:if> --%>
 
    
    