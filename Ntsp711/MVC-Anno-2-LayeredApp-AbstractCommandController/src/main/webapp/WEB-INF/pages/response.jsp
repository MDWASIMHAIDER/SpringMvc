<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<c:choose>
	<c:when test="${!empty listdto}">
		<table   border="1"  style="color:green;background:black;align-self: center"> 
      <tr><th>ENO</th><th>ENAME</th><th>DESG</th><th>SALARY </th> <th>DEPTNO</th><th>MGRNO </th></tr>
      	<c:forEach var="res" items="${listdto}">
      		<tr><td>${res.eno}</td>
      			<td>${res.ename}  </td>
           <td>${res.desg}  </td>
           <td>${res.salary}  </td>
           <td>${res.deptno}  </td>
           <td>${res.mgrno}  </td>
           
           <%--  <td>
            <a href="edit.htm?id=${res.id}"><img src="images/edit1.png" width="30" height="30"></a>
              		&nbsp;&nbsp;
              <a href="delete.htm?id=${res.id}"  onclick=" confirmDelete(${dto.name})"><img src="images/delete1.png" width="30" height="30"></a>
             </td> --%>
      		</tr>
      	</c:forEach>
      </table>
	</c:when>

 <c:otherwise>
        <h1 style="color:red;text-align:center"> Records not Found </h1>
   </c:otherwise>
</c:choose>

    	
    </table>
