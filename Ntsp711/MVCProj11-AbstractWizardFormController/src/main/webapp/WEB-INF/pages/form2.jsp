<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<table>
	<form:form method="POST" commandName="rcmd">
		<tr><td>Qualification</td><td><form:input path="qualification"/></td></tr>
		<tr><td>Designation</td><td><form:input path="desg"/></td></tr>
		<tr><td>Salary</td><td><form:input path="salary"/>
		<tr>
		<td><input type="submit"  name="_target0"  value="previous"></td>
		<td><input type="submit"  name="_target2"  value="next"></td>
            <td><input type="submit"  name="_cancel"  value="cancel"></td></tr>
		</form:form>
</table>