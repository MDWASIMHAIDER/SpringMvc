<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
	<%-- <table>
	<form:form method="POST" name="frm" commandName="scmd">
		<tr><td>Scientist No::<form:input path="sno"/></td></tr><br>
		<tr><td>Scientist Name::<form:input path="sname"/></td></tr><br>
		<tr><td>Scientist domain::<form:input path="domain"/></td></tr><br>
		<tr><td>Scientist experiance::<form:input path="experiance"/></td></tr><br>
		<tr><td>Scientist patants::<form:input path="patantCounts"/></td></tr><br>
		</form:form><input type="submit" name="Add">
	</table> --%>
	
	
	<form:form method="POST" commandName="scmd">
		Scientist No::<form:input path="sno"/><br>
		Scientist Name::<form:input path="sname"/><br>
		Scientist domain::<form:input path="domain"/><br>
		Scientist experiance::<form:input path="experiance"/><br>
		Scientist patants::<form:input path="patantCounts"/><br>
	<input type="submit" value="Add Scientist">
</form:form>
	
	