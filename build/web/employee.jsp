<%-- 
    Document   : employee
    Created on : Dec 25, 2017, 6:12:16 AM
    Author     : Sarthak
--%>



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="employees.employee"%>
<%@page import="employees.employeesDao"%>
<%@page import="employees.employeesImpl"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        
    </head>
    <style>
        nav li a
{
    font-family: Lobster;
    font-size: 18px;
    color: #FF4000;
}
    </style>
     <%
    employeesDao edao =new employeesImpl();
   
    
   List<employee> list = edao.getemployees();         
         
   
   request.setAttribute("products", list);
    
    %>
    
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
        <a class="navbar-brand" href="#" style="font-family: pacifico; color: white;">Food hub</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="foradmin.jsp">Profiles</a></li>
        <li><a href="#">Order Details</a></li>
        <li><a href="#">Upload product</a></li> 
        <li><a href="#">Product_details</a></li> 
        <li class="active"><a href="employee.jsp">Employee Details</a></li> 
        <li><a href="reservationdetails.jsp">Reservation Details</a></li> 
        <li><a href="#"><span class="glyphicon glyphicon-user" style="color:white;"></span> <b style="color:white">Welcome </b><b style="color:white"> Sarthak syal</b></a></li>
        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
      
    </div>
  </div>
</nav>
    <center> <h1 style="font-family: Lobster;">All Employees Details </h1><hr style="width: 50%;"></center>
    <div class="col-md-6">
        <a href="addnewemp.jsp" class="btn btn-primary">Add New Data</a>
    </div>
    <br>
    <br>
    <br>
    
        <div class="container">
            <table class="table table-bordered table-striped table-hover">
                
                <thead>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>NUMBER</th>
                <th>ADDRESS</th>
                <th class="text-center">Edit</th>
                <th class="text-center">Delete</th>
                </thead>
                
                <tbody> 
                    <c:forEach items="${products}" var="x">
                    <tr>
                     <th>${x.getId()}</th>   
                     <th>${x.getName()}</th>
                      <th>${x.getEmail()}</th>
                      <th>${x.getPhone()}</th>
                       <th>${x.getAddress()}</th>
                        <td><a href="edit.jsp?id=${x.getId()}" class="btn btn-warning">Edit</a></td>
                        <td><a href="EmpDelete?id=${x.getId()}" class="btn btn-danger">Delete</a></td>
                    </tr>
                    </c:forEach>
                
                </tbody>
                
            </table>
        </div>
    </body>
</html>
