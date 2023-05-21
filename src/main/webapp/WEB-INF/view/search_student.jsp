<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Stander</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Action</th>
       </tr>
            
       <c:forEach var="student" items="${student}">
            
            <tr>
            <td>${student.name}</td>
            <td>${student.stander}</td>
            <td>${student.email}</td>
            <td>${student.mobile}</td>
            <td><a href="delete?id=${student.id}">delete</a></td>
            <td><a href="update?id=${student.id}">update</a></td>
       </tr>
        </c:forEach>
        
    </table>

</body>
</html>