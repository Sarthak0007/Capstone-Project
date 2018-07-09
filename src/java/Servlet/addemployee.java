
package Servlet;

import employees.employee;
import employees.employeesImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet (urlPatterns = "/addemployee")
public class addemployee extends HttpServlet {
employeesImpl edao =new employeesImpl();
        
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String val[]=req.getParameterValues("employee");
        
        
        employee e =new employee();
        for(int i=0;i<val.length;i++)
        {
            switch(i)
            {
                case 0 : e.setName(val[i]);
                case 1 : e.setEmail(val[i]);
                case 2 : e.setPhone(val[i]);
                case 3 : e.setAddress(val[i]);    
            }
        }
        
        
 edao.insert(e);
 resp.sendRedirect("employee.jsp");
 
    
}
}