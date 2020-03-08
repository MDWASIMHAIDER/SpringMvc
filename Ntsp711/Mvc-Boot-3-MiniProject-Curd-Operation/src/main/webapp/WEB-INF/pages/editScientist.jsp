<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    <h1 style="color:green;text-align:center">Edit Scientist Details</h1><br>
<table>
 	<form:form method="POST" modelAttribute="scmd">
 		<tr>
      		<td> Scientist ID:: </td>
      		<td> <form:input path="id"  disabled="true"/> </td>
  		 </tr>
  		 <tr>
  		 	<td>Scientist Name::</td>
  		 	<td><form:input path="name"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Scientist Domain::</td>
  		 	<td><form:input path="domain"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Scientist e::</td>
  		 	<td><form:input path="experiance"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Scientist PatentCount</td>
  		 	<td><form:input path="patentsCount"/></td>
  		 </tr>
  		 
  		 <tr>
      		<td><input type="submit"  value="Edit"/></td>
      		<td><input type="reset"  value="Cancel"/></td>
   		</tr>
 	</form:form>
 		
</table>

    