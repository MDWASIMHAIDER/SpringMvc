<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<center><h1 style="color:green">Search Employee</h1></center>
<form action="searchEmps.htm" method="POST">
	Emp no: <input type="text" name="eno"/><br>
	Emp Name: <input type="text" name="ename"/><br>
	Emp Desg: <input type="text" name="desg"/><br>
	Emp Salary: <input type="text" name="salary"/><br>
	<input type="submit" name="search"/>
</form>