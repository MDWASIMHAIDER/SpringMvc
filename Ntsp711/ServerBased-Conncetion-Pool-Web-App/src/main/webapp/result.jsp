<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${not empty result}">
		<table>
			 <tr>
    			<th>SNO</th><th>SNAME</th><th>SADD</th>
  			 </tr>
  			 <c:forEach var="map" items="${result}">
  			 	<tr>
  					<td><c:out value="${map.sno}"/></td>
  					<td><c:out value="${map.sname}"/></td>
  					<td><c:out value="${map.sadd}"/></td>
  				</tr>
  			 </c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		no employee found
	</c:otherwise>
</c:choose>
 --%>
<%@page import="java.util.*" %>
<% //read request attribute
	List<Map<String,Object>>listStud=(List<Map<String,Object>>)request.getAttribute("result");
	
	if(listStud!=null){%>
	<table>
  <tr>
    <th>SNO</th><th>SNAME</th><th>SADD</th>
  </tr>
  <% for(Map map:listStud){%>
  <tr>
  	<td><%=map.get("sno")%></td>
  	<td><%=map.get("sname")%></td>
  	<td><%=map.get("sadd")%></td>
  </tr>
  </table>

	<%}//
	}
%>



