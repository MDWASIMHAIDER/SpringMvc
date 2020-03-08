<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:green;text-align:center">Insert Scientist Details</h1><br>
<table>
 	<form:form action="set.htm" method="POST" modelAttribute="scmd">
 		<tr>
      		<td> Scientist ID:: </td>
      		<td> <form:input path="id"/> </td>
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
  		 	<td>Scientist Experiance::</td>
  		 	<td><form:input path="experiance"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Scientist PatentCount</td>
  		 	<td><form:input path="patentsCount"/></td>
  		 </tr>
  		 
  		 <tr>
      		<td><input type="submit"  value="Insert"/></td>
   		</tr>
 	</form:form>
 		
</table>
<a href="home.htm">Home</a>