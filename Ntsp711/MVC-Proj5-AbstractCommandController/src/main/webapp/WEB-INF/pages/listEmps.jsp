<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Search Result</h1>
<%-- <c:if test="${not empty searchResult}"> --%>
<table border="1">
	<tr>
		<th>PID</th>
		<th>PNAME</th>
		<th>PDEPT</th>
		<th>ADDRESS</th>
		<th>T-STATUS</th>
		<th>T_BILL</th>
	</tr>
	<c:forEach items="${searchResult}" var="result">
		<tr>
			<td><c:out value="${result.pid}"></c:out></td>
			<td><c:out value="${result.pname}"></c:out></td>
			<td><c:out value="${result.pdept}"></c:out></td>
			<td><c:out value="${result.address}"></c:out></td>
			<td><c:out value="${result.tstatus}"></c:out></td>
			<td><c:out value="${result.tbill}"></c:out></td>
		</tr>
	</c:forEach>
</table>
<%-- </c:if> --%>