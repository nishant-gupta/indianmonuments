<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form name="addDetails" method="POST" action = "add">
<hr>Registration Page:</hr>
        <div align="center">
            <table border="1">
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>Confirm Password:</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="firstName" name="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="lastName" name="lastName" /></td>
                </tr>
                
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" /></td>
                </tr>
                <tr>
                    <td></td>
                   <td><input type="submit" value="Add User"/>  
                   </td>
                </tr>
               
                
            </table>
           
    </form:form>
</body>
</html>