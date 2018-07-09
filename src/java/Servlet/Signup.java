/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Signup.SignupImpl;
import Signup.Signupbean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet (urlPatterns = "/Signup")
public class Signup extends HttpServlet {

    SignupImpl sign =new SignupImpl();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String val[]=req.getParameterValues("Signup");
        
        Signupbean bean =new Signupbean();
        
        for(int i=0;i<val.length;i++)
        {
            switch(i)
            {
                case 0 : bean.setName(val[i]);
                case 1 : bean.setNumber(val[i]);
                case 2 : bean.setUsername(val[i]);
                case 3 : bean.setPassword(val[i]);
                case 4 : bean.setConfirm_password(val[i]);
            }
        }
      sign.insert(bean);
      resp.sendRedirect("Login.jsp");
    }
    
    
    
}
