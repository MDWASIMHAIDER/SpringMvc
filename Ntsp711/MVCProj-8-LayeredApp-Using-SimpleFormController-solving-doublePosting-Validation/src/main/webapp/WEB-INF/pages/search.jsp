<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script type="text/javascript" src="Validator.js"></script>
<center><h1 style="color:green">Search Employee</h1></center>
<div style="border:5px;border-radius:25px;
			background-color:cyan;width:600;height:400;margin-left:200;
			border-bottom-width:10px;margin-top:40;text-shadow:red;" class="ee">

<form:form method="POST" name="frm" commandName="empcmd">
<%-- <form:errors path="*"/> --%>
	Emp No:<form:input path="eno" id="eno.err"/><form:errors path="eno"/><br>
	Emp Name:<form:input path="ename" id="ename.err"/><form:errors path="ename" cssStyle="color:red"/><br>
	Emp Desg:<form:input path="desg"/><form:errors path="desg"/><br>
	Emp Salary:<form:input path="salary"/><form:errors path="salary"/><br>
	Emp DesptNO:<form:input path="deptno"/><form:errors path="deptno"/><br>
	Emp MgrNO:<form:input path="mgrno"/><form:errors path="mgrno"/><br>
	<input type="submit" name="save" onclick="validate(frm);"/>
</form:form>
</div>