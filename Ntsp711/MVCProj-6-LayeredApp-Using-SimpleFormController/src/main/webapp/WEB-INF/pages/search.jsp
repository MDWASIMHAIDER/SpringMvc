<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center><h1 style="color:green">Search Employee</h1></center>
<div style="border:5px;text-align:center;border-radius:25px;
			background-color:cyan;width:400;height:200;margin-left:400;
			border-bottom-width:10px;margin-top:40;text-shadow:red;">

<form:form method="POST" commandName="empcmd">
	Emp Name:<form:input path="ename"/><br>
	Emp Desg:<form:input path="desg"/><br>
	Emp Salary:<form:input path="salary"/><br>
	Emp DesptNO:<form:input path="deptno"/><br>
	Emp MgrNO:<form:input path="mgrno"/><br>
	<input type="submit" name="save"/>
</form:form>
</div>