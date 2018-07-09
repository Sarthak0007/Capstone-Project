<%-- 
    Document   : edit
    Created on : Dec 21, 2017, 10:24:40 AM
    Author     : Sarthak
--%>

<%@page import="employees.employee"%>
<%@page import="employees.employeesDao"%>
<%@page import="employees.employeesImpl"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit_profile</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
    
    <%
    employeesDao edao =new employeesImpl();
    int id = Integer.parseInt(request.getParameter("id"));
    
    employee e =edao.getemployees(id);
    
    request.setAttribute("employees", e);
    %>
    <body>
        
       <form action="EmpEdit" method="post" style="margin: auto; width: 80%; text-align: center;">
            <h1> Update Profile</h1>
            
            <input type="hidden" name ="update" value="${employees.getId()}">
            
            <input type="text" name ="update" class="form-control" value="${employees.getName()}" placeholder="username">
            <br>
            
            <input type="email" name="update" class="form-control" value="${employees.getEmail()}"  required>
              <br>
             <input type="number" name="update" class="form-control" value="${employees.getPhone()}">
              <br>
              
              <textarea  name="update" class="form-control" value="" placeholder="address">${employees.getAddress()}</textarea>
              <br>
              
              <input type="submit" value="Submit" class="btn btn-success">
              <a href="employee.jsp" class="btn btn-default">Back</a>
        </form>
        
    </body>
    
</html>
