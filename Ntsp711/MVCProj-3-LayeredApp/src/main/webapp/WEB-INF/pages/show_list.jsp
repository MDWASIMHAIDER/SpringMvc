<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:choose>
    <c:when test="${!empty emplist }">
         <table border="1" style="margin-left:420">
             <tr bgcolor="red"><th>empNo</th><th>empName </th><th>job</th><th>salary</th><th>deptNo</tr>
             <c:forEach var="emp"  items="${emplist}">
                  <tr bgcolor="cyan">
                     <td>${emp.empNo}</td>
                     <td>${emp.eName}</td>
                     <td>${emp.job}</td>
                     <td>${emp.salary}</td>
                     <td>${emp.dept}</td>
                  </tr>
             </c:forEach>
         </table>
    </c:when>
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>
<a href="home.htm">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javaScript:printpage()">Print</a>

<script language="javaScript">
	function printpage(){
		frames.focus();
		frames.print();
	}
</script>