package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Css/home.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <!--header start-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("      <div class=\"container-fluid main\">\n");
      out.write("\n");
      out.write("  <nav class=\"navbar navbar-default\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span> \n");
      out.write("        </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\" style=\"font-family: Pacifico\">Food Hub</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"menu.jsp\">Menu</a></li>\n");
      out.write("          <li><a href=\"reservation.jsp\">Reservation</a></li>\n");
      out.write("          <li><a href=\"About.jsp\">About Us </a></li>\n");
      out.write("          <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Welcome ");
      out.print( request.getSession().getAttribute("name") );
      out.write("</a></li>\n");
      out.write("          <li ><a href=\"Login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("          <li><a  href=\"#\"><div id=\"ex4\">\n");
      out.write("  <span class=\"p1 fa-stack fa-2x has-badge\" data-count=\"4\">\n");
      out.write("    <!--<i class=\"p2 fa fa-circle fa-stack-2x\"></i>-->\n");
      out.write("    <i class=\"p3 fa fa-shopping-cart fa-stack-1x xfa-inverse\" data-count=\"4b\"></i>\n");
      out.write("  </span>\n");
      out.write("</div>\n");
      out.write("</a> </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel carousel-fade slide\" data-ride=\"carousel\" data-interval=\"3000\">\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active background a\"></div>\n");
      out.write("      <div class=\"item background b\"></div>\n");
      out.write("      <div class=\"item background c\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"covertext\">\n");
      out.write("    <div class=\"col-lg-10\" style=\"float:none; margin:0 auto;\">\n");
      out.write("        <h1 class=\"title\" style=\"font-family: Pacifico\">Welcome to Food Hub</h1>\n");
      out.write("        <h3 class=\"subtitle\" style=\"font-family: Pacifico\"> Now That Your Tastes Have Grown Up!</h3>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <!--header end-->\n");
      out.write("        <!-- about -->\n");
      out.write("<section class=\"about-us\" id=\"about-us\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-5 about-left\">\n");
      out.write("                            <h2 style=\"font-family: Lobster; text-align: center;  \">About Us</h2><hr style=\" border-width:2px;\">\n");
      out.write("                            <p style=\"font-family: Lobster\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget \n");
      out.write("                                    libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit \n");
      out.write("                                    amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget \n");
      out.write("                                    vulputate. Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales\n");
      out.write("                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla\n");
      out.write("                                    vitae.  Integer placerat tincidunt sem, at sodales justo.Integer placerat tincidunt\n");
      out.write("                                    sem, at sodales justo.. </p>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-md-6 about-img\" >\n");
      out.write("                            <img src=\"images/about1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6 about-img\">\n");
      out.write("                            <img src=\"images/about2.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-5 about-right\">\n");
      out.write("                            <p style=\"font-family: Lobster;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget \n");
      out.write("                                    libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit \n");
      out.write("                                    amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget \n");
      out.write("                                    vulputate. Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales\n");
      out.write("                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla\n");
      out.write("                                    vitae.  Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales \n");
      out.write("                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla \n");
      out.write("                                    vitae. sheets containing Lorem Ipsum passages </p>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</section>\n");
      out.write("<!-- //about end -->\n");
      out.write("<!-- service-type-grid -->\n");
      out.write("\t<div class=\"service\" id=\"services\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<!---728x90--->\n");
      out.write("                <h2 class=\"tittle\" style=\"font-family: Lobster; text-align: center; font-size: 50px;\" >Our Services</h2><hr style=\"width: 50%; border-width:2px;\">\n");
      out.write("\t\t\t<div class=\"arrows-serve\"></div>\n");
      out.write("                        <br>\n");
      out.write("\t\t\t\t<div class=\"inst-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 services-gd text-center wow slideInLeft\"  data-wow-duration=\"1s\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"hi-icon\"><img src=\"images/serve1.png\" alt=\" \" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h4>View our Menu</h4>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 services-gd text-center wow slideInDown\"  data-wow-duration=\"1s\" data-wow-delay=\".2s\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"hi-icon\"><img src=\"images/serve2.png\" alt=\" \" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h4>Reservation</h4>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 services-gd text-center wow slideInUp\"  data-wow-duration=\"1s\" data-wow-delay=\".2s\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"hi-icon\"><img src=\"images/serve3.png\" alt=\" \" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h4>Fine Recipes</h4>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 services-gd text-center wow slideInRight\"  data-wow-duration=\"1s\" data-wow-delay=\".3s\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"hi-icon\"><img src=\"images/serve4.png\" alt=\" \" /></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<h4>Spicy Recipes</h4>\n");
      out.write("\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<br>\n");
      out.write("<!-- //service-type-grid -->\n");
      out.write("<!-- team -->\n");
      out.write("<section class=\"team\" id=\"team\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"team-heading\">\n");
      out.write("                            <h3 style=\"font-family: pacifico; text-align: center; color: #FFFFFF\">Team</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"team-members\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 image1\">\n");
      out.write("                                    <img src=\"images/1.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t<ul class=\"social-icons1\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h5>Johnson</h5>\n");
      out.write("\t\t\t\t\t<p>“Master Chef”</p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 image1\">\n");
      out.write("                                    <img src=\"images/2.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t<ul class=\"social-icons1\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h5>Enrique</h5>\n");
      out.write("\t\t\t\t\t<p>“Master Grill”</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 image1\">\n");
      out.write("                                    <img src=\"images/4.jpg\" alt=\" \" class=\"img-responsive\"/>\n");
      out.write("\t\t\t\t\t<ul class=\"social-icons1\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<h5>forkler</h5>\n");
      out.write("\t\t\t\t\t<p>“Head Chef”</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</section>\n");
      out.write("<!-- //team -->\n");
      out.write("<!-- gallery -->\n");
      out.write("\t<div class=\"gallery\" id=\"gallery\">\n");
      out.write("\t\t\t<div class=\"agileits_w3layouts_head\">\n");
      out.write("                            <h3 style=\"text-align: center; font-family: Lobster; margin-bottom: 5%;\">Food Gallery</h3><hr style=\"width: 50%; border-width:2px; margin-top: -4%;\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3layouts_gallery_grids\">\t\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p1.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p1.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Butter pizza</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p2.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p2.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Pasta</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p13.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p13.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Lemon cheese</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p4.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p4.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Toasted puff</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p6.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p6.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Burger Cheese</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p5.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p5.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>fried broccoli</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p7.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p7.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Apple almond salad</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p8.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p8.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Roasted meat</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p9.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p9.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Pasta rolls</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p10.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p10.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>fruits</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p11.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p11.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Meat Pizza</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3layouts_gallery_grid\">\n");
      out.write("\t\t\t\t\t<a href=\"images/p12.jpg\" class=\"lsb-preview\" data-lsb-group=\"header\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3layouts_news_grid\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/p12.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3layouts_news_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wthree_text\"><h3>Boiled eggs</h3></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- //gallery end -->\n");
      out.write("<!-- gallery js -->\n");
      out.write("\t<script src=\"js/lsb.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t$(window).load(function() {\n");
      out.write("\t\t  $.fn.lightspeedBox();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //gallery js -->\n");
      out.write("<!--testomonial start-->\n");
      out.write("<p style=\"font-family: Pacifico; font-size: 50px; text-align: center;\">Our customer says</p><hr style=\"width: 50%; border-width:2px;\">\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("<div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"carousel slide\" data-ride=\"carousel\" id=\"quote-carousel\">\n");
      out.write("                    <!-- Carousel Slides / Quotes -->\n");
      out.write("                    <div class=\"carousel-inner text-center\">\n");
      out.write("                        <!-- Quote 1 -->\n");
      out.write("                        <div class=\"item active\">\n");
      out.write("                            <blockquote>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                                        <p style=\"color: white;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt \n");
      out.write("                                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation \n");
      out.write("                                            ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \n");
      out.write("                                            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. !</p>\n");
      out.write("                                        <small>Someone famous</small>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </blockquote>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Quote 2 -->\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <blockquote>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                                        <p style=\"color: white;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt \n");
      out.write("                                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation \n");
      out.write("                                            ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \n");
      out.write("                                            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. </p>\n");
      out.write("                                        <small>Someone famous</small>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </blockquote>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Quote 3 -->\n");
      out.write("                        <div class=\"item\">\n");
      out.write("                            <blockquote>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("                                        <p style=\"color: white;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor \n");
      out.write("                                            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud \n");
      out.write("                                            exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure \n");
      out.write("                                            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. .</p>\n");
      out.write("                                        <small>Someone famous</small>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </blockquote>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Bottom Carousel Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <li data-target=\"#quote-carousel\" data-slide-to=\"0\" class=\"active\"><img class=\"img-responsive \" src=\"https://s3.amazonaws.com/uifaces/faces/twitter/mantia/128.jpg\" alt=\"\">\n");
      out.write("                        </li>\n");
      out.write("                        <li data-target=\"#quote-carousel\" data-slide-to=\"1\"><img class=\"img-responsive\" src=\"https://s3.amazonaws.com/uifaces/faces/twitter/adhamdannaway/128.jpg\" alt=\"\">\n");
      out.write("                        </li>\n");
      out.write("                        <li data-target=\"#quote-carousel\" data-slide-to=\"2\"><img class=\"img-responsive\" src=\"https://s3.amazonaws.com/uifaces/faces/twitter/brad_frost/128.jpg\" alt=\"\">\n");
      out.write("                        </li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!-- Carousel Buttons Next/Prev -->\n");
      out.write("                    <a data-slide=\"prev\" href=\"#quote-carousel\" class=\"left carousel-control\"><i class=\"fa fa-chevron-left\"></i></a>\n");
      out.write("                    <a data-slide=\"next\" href=\"#quote-carousel\" class=\"right carousel-control\"><i class=\"fa fa-chevron-right\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("<!--testmonial end-->\n");
      out.write("<!--map start-->\n");
      out.write("<div>\n");
      out.write("    <section>\n");
      out.write("        <h3 style=\"font-family: Pacifico; text-align: center; font-size: 50px;\">Contact us</h3><hr style=\"width: 50%; border-width:2px;\"><br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("           <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d224457.68937691895!2d77.20698482729465!3d28.474986907732525!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x390ce25cec302ea5%3A0xb9205fdecb25f898!2sNIIT+Delhi+South+Extension+Centre!5e0!3m2!1sen!2sin!4v1512770870734\" width=\"1235\" height=\"400\" frameborder=\"0\" style=\"border:0 \" allowfullscreen ></iframe> \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--map end-->\n");
      out.write("<!--footer-->\n");
      out.write("<footer class=\"footer-distributed\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-left\">\n");
      out.write("\n");
      out.write("                            <h3 style=\"font-family: Pacifico;\"> Food Hub</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-links\">\n");
      out.write("\t\t\t\t\t<a href=\"Home.jsp\">Home</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"reservation.jsp\">Reservation</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"menu.jsp\">Menu</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"about.jsp\">About us</a>\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t·\n");
      out.write("\t\t\t\t\t<a href=\"contact.jsp\">Contact us</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-company-name\">Owner Sarthak Syal | made @2017 </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-center\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-map-marker\"></i>\n");
      out.write("\t\t\t\t\t<p><span>D-7 South-ex</span> New Delhi-110048</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-phone\"></i>\n");
      out.write("\t\t\t\t\t<p>+1 555 123456</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i>\n");
      out.write("\t\t\t\t\t<p><a href=\"http://www.niitstudent.com/india/studentweb/index.aspx\"><span class=\"__cf_email__\" data-cfemail=\"b9caccc9c9d6cbcdf9dad6d4c9d8d7c097dad6d4\">Sarthak@niit.com</span></a></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"footer-right\">\n");
      out.write("\n");
      out.write("\t\t\t\t<p class=\"footer-company-about\">\n");
      out.write("\t\t\t\t\t<span>About the company</span>\n");
      out.write("\t\t\t\t\tLorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"footer-icons\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"https://twitter.com/login?lang=en\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/?hl=en\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("\t\t\t\t\t<a href=\"https://github.com/login\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</footer>\n");
      out.write("<!--smooth scroll js code start-->\n");
      out.write("<script src=\"js/SmoothScroll.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function () {\n");
      out.write("\t\t\tsize_li = $(\"#myList li\").size();\n");
      out.write("\t\t\tx = 1;\n");
      out.write("\t\t\t$('#myList li:lt(' + x + ')').show();\n");
      out.write("\t\t\t$('#loadMore').click(function () {\n");
      out.write("\t\t\t\tx = (x + 1 <= size_li) ? x + 1 : size_li;\n");
      out.write("\t\t\t\t$('#myList li:lt(' + x + ')').show();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#showLess').click(function () {\n");
      out.write("\t\t\t\tx = (x - 1 < 0) ? 1 : x - 1;\n");
      out.write("\t\t\t\t$('#myList li').not(':lt(' + x + ')').hide();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!--smooth scroll js code end-->\n");
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
