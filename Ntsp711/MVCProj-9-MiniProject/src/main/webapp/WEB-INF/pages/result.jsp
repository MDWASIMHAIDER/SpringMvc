<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color:green;text-align:center">Result</h1>
<c:choose>
	<c:when test="${!empty listdto}">
<table border="1" style="color:green;background:black">
  <tr>
    <th>SNO</th>
    <th>SNAME</th>
    <th>DOMAIN</th>
    <th>EXPERIANCE</th>
    <th>PATANT COUNT</th>
    </tr>
    <c:forEach items="${listdto}" var="result">
	<tr>
	<td><c:out value="${result.sno}"></c:out></td>
	<td><c:out value="${result.sname}"></c:out></td>
	<td><c:out value="${result.domain}"></c:out></td>
	<td><c:out value="${result.experiance}"></c:out></td>
	<td><c:out value="${result.patantCounts}"></c:out></td>
	</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
        <h1 style="color:red;text-align:center"> Records not Found </h1>
   </c:otherwise>
</c:choose>
<h1>${resMsg}</h1>
<h1><a href="input.htm" style="text-decoration:none">Insert New Scientist</a></h1>

