<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>    

    
    <h1 style="color:red;text-align:center">Form1 page</h1>
    
    <form:form  method="POST" commandName="rcmd">
             name :: <form:input path="name"/> <br>
             Address :: <form:input path="address"/> <br>
             Dob :: <form:input path="dob"/> <br>
             <input type="submit"  name="_target1"  value="next"/>
             <input type="submit"  name="_cancel"  value="cancel"/>   
    
    </form:form>

