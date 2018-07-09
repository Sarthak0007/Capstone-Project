<%-- 
    Document   : foradmin
    Created on : Dec 20, 2017, 3:40:24 AM
    Author     : Sarthak
--%>

<%@page import="Signup.Signupbean"%>
<%@page import="Signup.SignupDao"%>
<%@page import="Signup.SignupImpl"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
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
   SignupDao sdao =new SignupImpl();
   
   List<Signupbean> list =sdao.getSignupbean();
   
  request.setAttribute("REGISTRATION", list);
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
        <li class="active"><a href="foradmin.jsp">Profiles</a></li>
        <li><a href="#">Order Details</a></li>
        <li><a href="uploadproduct.jsp">Upload product</a></li> 
        <li><a href="#">Product_details</a></li> 
        <li><a href="employee.jsp">Employee Details</a></li> 
        <li><a href="reservationdetails.jsp">Reservation Details</a></li> 
        <li><a href="#"><span class="glyphicon glyphicon-user" style="color:white;"></span> <b style="color:white">Welcome </b><b style="color:white"> Sarthak syal</b></a></li>
        <li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
      </ul>
      
    </div>
  </div>
</nav>
       
        <div class="container">
            <center>
                <h2 style="font-family: Lobster;">SIGNED USERS</h2>
                <br>
        <table class="table table-striped table-hover table-bordered" >
         <thead>
      
             <tr><th>ID</th><th>Name</th><th>Number</th><th>Email</th><th>Password</th><th>confirmed_password</th></tr>
      
    </thead>  
    
        
        <tbody>
        <c:forEach items="${REGISTRATION}" var="x">
                    <tr>
                     <th>${x.getId()}</th>   
                     <th>${x.getName()}</th>
                      <th>${x.getNumber()}</th>
                      <th>${x.getUsername()}</th>
                       <th>${x.getPassword()}</th>
                       <th>${x.getConfirm_password()}</th>
                    </tr>
                    </c:forEach>
        </tbody>
        
        
        </table>
            </center>
        </div>
    </body>
</html>
