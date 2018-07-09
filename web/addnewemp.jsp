<%-- 
    Document   : addnewemp
    Created on : Dec 26, 2017, 3:18:32 PM
    Author     : Sarthak
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add data</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        
    </head>
    <body>
        <br>
        <br>
        <div class="container">
            <form action="addemployee" method="post">

                <div class="form-group">
                    <label>Name</label>
                    <input class="form-control" type="text" name="employee" placeholder="Your name"/>
                </div>
                <div class="form-group">
                    <label>Email</label>
                    <input class="form-control" type="text" name="employee" placeholder="Email"/>
                </div>
                <div class="form-group">
                    <label>Phone</label>
                    <input class="form-control" type="text" name="employee" placeholder="Number"/>
                </div>
                <div class="form-group">
                    <label>Address</label>
                    <textarea  class="form-control" type="text" name="employee" placeholder="Your Address"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
                <a href="employee.jsp" class="btn btn-default">Back</a>
            </form>
            
        </div>
        
    </body>
</html>
