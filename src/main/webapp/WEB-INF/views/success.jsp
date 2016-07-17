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
 ${msg} <a href="logout">Logout</a> 
 <form:form action="citylst" commandName="cityBean">
  <tr>
				<td>City :</td>
				<td><form:select path="city">
					  <form:option value="NONE" label="--- Select ---" />
					  <form:options items="${cityList}" />
				       </form:select>
                                </td>
                                </tr>
 </form:form>
</body>
</html>