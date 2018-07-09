/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class loginDao {
    
    public String authenticateUser(login loginBean)
    {
        String userName = loginBean.getUsername(); //Keeping user entered values in temporary variables.
        String password = loginBean.getPassword();
        
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String userNameDB = "";
        String passwordDB = "";
        
        try
        {
           conn = dbconnection.dbconnection.getConnection();
        statement = conn.createStatement();
         resultSet = statement.executeQuery("select username,password,name from REGISTRATION");
         
         while(resultSet.next())
             {
  userNameDB = resultSet.getString("username"); //fetch the values present in database
  passwordDB = resultSet.getString("password");
  
  
  
  
  if(userName.equals(userNameDB) && password.equals(passwordDB))
  {
     
      return "SUCCESS";
  } 
        
         }
        }
        
         catch(SQLException e)
             {
            e.printStackTrace();
            }
         return "Invalid user credentials";
 }    
}
    
