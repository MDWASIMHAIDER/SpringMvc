<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form action="result.htm" method="POST" modelAttribute="empcmd">
	<table>
		<tr><td>Ename:</td><td><form:input path="ename"/></td></tr>
		<tr><td>Desg:</td><td><form:input path="desg"/></td></tr>
		<tr><td>Salary:</td><td><form:input path="salary"/></td></tr>
		<tr><td>Dept:</td><td><form:input path="deptno"/></td></tr>
		<tr><td>MgrNo:</td><td><form:input path="mgrno"/></td></tr>
		<tr><td><input type="submit" value="save"/></td></tr>
	</table>
</form:form>
