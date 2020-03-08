<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<table>
	<form:form method="POST" commandName="rcmd">
		<tr><td>Customer Name</td><td><form:input path="cName"/></td></tr>
		<tr><td>Customer Address</td><td><form:input path="cAddress"/></td></tr>
		<tr><td>Customer Gender</td><td><form:radiobuttons path="gender" items="${genderlist}"/></td></tr>
		<tr><td>Customer Country</td><td><form:select path="country">
		<form:options items="${countrylist}"/>
		</form:select></td></tr>
		<tr><td>Customer Hobby</td><td><form:checkboxes path="hobbies" items="${hobbieslist}"/></td></tr>
		<tr><td>Customer Product</td><td><form:select path="products">
			<form:options items="${productlist}"/>
		</form:select></td></tr>
		<tr><td><input type="submit"  value="register"/></td></tr>
	</form:form>
</table>