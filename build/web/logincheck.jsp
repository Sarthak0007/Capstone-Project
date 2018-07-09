<%-- 
    Document   : logincheck
    Created on : Dec 17, 2017, 8:02:24 PM
    Author     : Sarthak
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Css/sweetalert.css">
        <script src="js/sweetalert.min.js"></script>
    </head>
    <body>
        <%
           String loge = request.getParameter("username");
           String logp = request.getParameter("password");
           String driverName = "org.apache.derby.jdbc.ClientDriver";
           String connectionUrl = "jdbc:derby://localhost:1527/";
           String dbName = "register";
           String userId = "hr";
           String password = "hr";
           
               try {
               Class.forName(driverName);} 
               catch (ClassNotFoundException e) {
               e.printStackTrace();
                       }
                   Connection connection = null;
                  Statement statement = null;
                  ResultSet resultSet = null;
 
          %>
          <%
                  try { 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM REGISTRATION";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	               String dbUsername = resultSet.getString("username");
	               String dbPassword = resultSet.getString("password");
                       String username = resultSet.getString("name");
                        if((dbUsername.equals(loge)) && (dbPassword.equals(logp))){
                            HttpSession  hs= request.getSession();
                       hs.setAttribute("userdb",username);
	                    response.sendRedirect("Home.jsp");
                             response.getWriter().append("<script>alert('Login Successfully');"
	       					+ " location.replace('Home.jsp') </script>");
                        }
                        
	                 else{
	                	 
	                   System.out.println("<script type=\"text/javascript\">");
	                   System.out.println("alert('invalid login user');");
	                   System.out.println("</script>");	
                           response.getWriter().append("<script>alert('Invalid Email and Password');"
	       					+ " location.replace('Login.jsp') </script>");
	                }
			 }


} catch (Exception e) {
e.printStackTrace();
}
          %>
    </body>
</html>
