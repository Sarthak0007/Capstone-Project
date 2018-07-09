/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author User
 */

@WebListener
public class dbconnection implements ServletContextListener  {

    private static Connection conn;

public static Connection getConnection()
{
   
    return conn;
}

    
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
         System.out.println("app started");
        try
        {
         conn =DriverManager.getConnection("jdbc:derby://localhost:1527/register","hr","hr");
         
         if(conn!=null)
                System.out.println("database connected");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
        try
        {
            conn.close();
            
            System.out.println("Database Disconnected");
        }
        catch (Exception e)
                {
                  e.printStackTrace();
                }
    }
    
}
