<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student data</title>
</head>
<body>
   <h1>Lock hear....</h1>
   <form action="savestudent" method="post">
     <pre>
         Name<input type="text" name="name"/>
         Stander<input type="text" name="stander"/>
         Email<input type="email" name="email"/>
         Mobile<input type="number" name="mobile"/>
         <input type="submit" value="save"/>
     </pre>
     
     ${msg}
   
   </form>
</body>
</html>