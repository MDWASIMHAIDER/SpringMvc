<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Upload Files</h1>
<form:form action="upload.htm" method="POST" modelAttribute="fcmd" enctype="multipart/form-data">
	Choose File(resume):<input type="file" name="resumeFile"/><br>
	Choose File(photo):<input type="file" name="photoFile"/><br>
	<input type="submit" value="upload"/>
</form:form>