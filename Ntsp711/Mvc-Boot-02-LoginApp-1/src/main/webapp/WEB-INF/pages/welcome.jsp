<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="text-align:center;color:green">Login Page</h1>
<form:form action="show.htm" method="POST" modelAttribute="empcmd">
	<%-- <span></span><form:errors path="*"/></span><br> --%>
	UserName:<form:input path="uname"/><br>
	Password:<form:input path="password"/><br>
	<input type="submit" value="validate"/><br>
</form:form>
<h1>${resMsg }</h1>


