<%-- 
    Document   : uploadproduct
    Created on : 6 Jan, 2018, 2:27:10 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>upload_product</title>
    </head>
    <body>
        <form>
            <label>ID</label>
            <input type="text" name="id"><br><br>
            <label>NAME</label>
             <input type="text" name="name"><br><br>
             <label>PRICE</label>
            <input type="text" name="price"><br><br>
            <label>UPLOAD PRODUCT</label>
             <input type="file" name="myimg"><br><br>
             <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>
