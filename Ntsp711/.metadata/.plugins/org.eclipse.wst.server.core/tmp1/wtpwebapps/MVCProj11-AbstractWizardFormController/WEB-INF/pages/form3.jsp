<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table>
	<form:form method="POST" commandName="rcmd">
		<tr><td>Expected Desg</td><td><form:input path="expected_desg"/></td></tr>
		<tr><td>Expected Intrest</td><td><form:input path="expected_intrest"/></td></tr>
		<tr><td>Expected Age</td><td><form:input path="expected_age" /></td>
		
		<tr>
			<td><input type="submit" name="_target1" value="previous"></td>
			<td><input type="submit" name="_finish" value="finish"></td>
			<td><input type="submit" name="_cancel" value="cancel"></td>
		</tr>
	</form:form>
</table>