<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="false" %>
 <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<form:form  action="loginresult.htm" method="POST"  modelAttribute="logincmd">
    username :: <form:input path="uname"/> <br>
    password :: <form:input path="password"/> <br>
    <input type="submit"  value="Login">
</form:form>     <br><br>

<c:if test="${!empty resMsg}">
   ${resMsg}
</c:if>


