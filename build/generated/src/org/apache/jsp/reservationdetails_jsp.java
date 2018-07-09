package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Reservtion.Reservation;
import java.util.List;
import Reservtion.ReservationDao;
import Reservtion.ReservationImpl;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class reservationdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reservation_details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            nav li a\n");
      out.write("{\n");
      out.write("    font-family: Lobster;\n");
      out.write("    font-size: 18px;\n");
      out.write("    color: #FF4000;\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    ");

    ReservationDao rdao = new ReservationImpl();
    
    List<Reservation> list =rdao.getReservation();
    
    request.setAttribute("Reserve", list);
    
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span> \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\" style=\"font-family: pacifico; color: white;\">Food hub</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"foradmin.jsp\">Profiles</a></li>\n");
      out.write("        <li><a href=\"#\">Order Details</a></li>\n");
      out.write("        <li><a href=\"#\">Upload product</a></li> \n");
      out.write("        <li><a href=\"#\">Product_details</a></li> \n");
      out.write("        <li><a href=\"employee.jsp\">Employee Details</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"reservationdetails.jsp\">Reservation Details</a></li> \n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\" style=\"color:white;\"></span> <b style=\"color:white\">Welcome </b><b style=\"color:white\"> Sarthak syal</b></a></li>\n");
      out.write("        <li><a href=\"Login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("                <h2 style=\"font-family: Lobster;\">Reservation Details</h2>\n");
      out.write("                <br>\n");
      out.write("        <table class=\"table table-striped table-hover table-bordered\" >\n");
      out.write("         <thead>\n");
      out.write("      \n");
      out.write("             <tr>\n");
      out.write("                 <th>ID</th>\n");
      out.write("                 <th>Name</th>\n");
      out.write("                 <th>Email</th>\n");
      out.write("                 <th>Number</th>\n");
      out.write("                 <th>Date</th>\n");
      out.write("                 <th>Time</th>\n");
      out.write("                 <th>Message</th>\n");
      out.write("             </tr>\n");
      out.write("      \n");
      out.write("    </thead>  \n");
      out.write("    <tbody>\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Reserve}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"x\">\n");
      out.write("                    <tr>\n");
      out.write("                     <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>   \n");
      out.write("                     <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                      <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                      <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                       <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                       <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                       <th>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${x.getMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                    </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("    </tbody>\n");
      out.write("       </table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
