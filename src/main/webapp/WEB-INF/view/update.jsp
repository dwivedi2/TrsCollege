<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update student data</title>
</head>
<body>
   <h1>update hear....</h1>
   <form action="updatestudent" method="post">
     <pre>
     <input type="hidden" name="id" value="${student.id }"/>
         Name<input type="text" name="name" value="${student.name}"/>
         Stander<input type="text" name="stander" value="${student.stander}"/>
         Email<input type="email" name="email" value="${student.email}"/>
         Mobile<input type="number" name="mobile" value="${student.mobile}"/>
         <input type="submit" value="update"/>
     </pre>
     
     ${msg}
   
   </form>
</body>
</html>