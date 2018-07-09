
package Servlet;

import Login.login;
import Login.loginDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

     


public class LoginServlet extends HttpServlet {
    
    public LoginServlet(){
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String userName = req.getParameter("username");
       String password = req.getParameter("password");
       
       login bean = new login();
       
       bean.setUsername(userName);
       bean.setPassword(password);
       
       loginDao ldao =new loginDao();
       
       String userValidate = ldao.authenticateUser(bean);
       
       if(userValidate.equals("SUCCESS"))
           {
            req.setAttribute("username", userName); 
            req.getRequestDispatcher("/Home.jsp").forward(req, resp);
            }
           else
           {
            req.setAttribute("errMessage", userValidate); 
            req.getRequestDispatcher("/Login.jsp").forward(req, resp);
           }
            
            
    }
    
    
}
