/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import employees.employee;
import employees.employeesDao;
import employees.employeesImpl;
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
@WebServlet (urlPatterns = "/EmpEdit")
public class EmpEdit extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String val[]=req.getParameterValues("update");
       
        employeesDao edao =new employeesImpl();
        
        employee emp =new employee();
        for(int i=0; i<val.length; i++)
        {
            switch(i)
            {
              case 0 : emp.setId(Integer.parseInt(val[i])); break; 
              case 1 : emp.setName(val[i]); break;
              case 2 : emp.setEmail(val[i]); break;
              case 3 : emp.setPhone(val[i]); break;
              case 4 : emp.setAddress(val[i]); break;    
                  
            }
        }
        edao.update(emp);
        resp.sendRedirect("employee.jsp");
    }

    
     
    }
    
    
    

