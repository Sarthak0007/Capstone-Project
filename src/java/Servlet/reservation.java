/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Reservtion.Reservation;
import Reservtion.ReservationImpl;
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
@WebServlet (urlPatterns = "/reservation")
public class reservation extends HttpServlet {

    ReservationImpl rdao =new ReservationImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String val[]=req.getParameterValues("Reservation");
        
        Reservation res =new Reservation();
        
        for(int i=0;i<val.length;i++)
        {
            switch(i)
            {
                case 0 : res.setName(val[i]);
                case 1 : res.setEmail(val[i]);
                case 2 : res.setPhone(val[i]);
                case 3 : res.setDate(val[i]);
                case 4 : res.setTime(val[i]);
                case 5 : res.setMessage(val[i]);    
            }
        }
        rdao.insert(res);
        resp.sendRedirect("reservation.jsp");
    }
    
    
    
}
