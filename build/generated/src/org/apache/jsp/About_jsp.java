package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About_us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Css/about.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("    </head>\n");
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
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</a></li>\n");
      out.write("          <li ><a href=\"Login.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("          <li><a  href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i> </a></li>\n");
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
      out.write("        <h1 class=\"title\" style=\"font-family: Pacifico ; font-size: 80px;\">About Us</h1>\n");
      out.write("        <h3 class=\"subtitle\" style=\"font-family: Pacifico\"> Know Somthing about history and ourself!</h3>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <!--header end-->\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <!-- About Page 2 Area Start Here -->\n");
      out.write("            <div class=\"about-page2-area section-space\">\n");
      out.write("                <img src=\"images/about1-bottom-back.png\" class=\"img-responsive\" alt=\"about1-bottom-back\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row no-gutters about-page2-inner\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <div class=\"about-page2-content\">\n");
      out.write("                                <h1 style=\"font-family: Lobster; font-size: 60px;\">Who We Are</h1>\n");
      out.write("                                <p style=\"font-family: Lobster;\">We Are Just A Normal Person And We Want To See Happy To All Because The food is a One Of The Most Beautiful Thing In Life So \n");
      out.write("        We Are Create A This Movement For A Our Customer For Feel Happy And Free To Contact Us.To achieve this goal, we aim to empower Indian consumers to make informed car buying and ownership decisions with exhaustive and un-biased information on cars through our expert reviews, owner reviews, detailed specifications and comparisons.\n");
      out.write("    We understand that a car is by and large the second-most expensive asset a consumer associates his lifestyle with.</p>\n");
      out.write("                                 </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <div class=\"about-page2-img-holder\">\n");
      out.write("                                <img src=\"images/aboutbanner1.jpeg\" class=\"img-responsive\" alt=\"about-banner\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row no-gutters about-page2-inner\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-6 col-sm-6 hidden-xs\">\n");
      out.write("                            <div class=\"about-page2-img-holder\">\n");
      out.write("                                <img src=\"images/about1-banner2.jpg\" class=\"img-responsive\" alt=\"about-banner\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                            <div class=\"about-page2-content\">\n");
      out.write("                                <h1 style=\"font-family: Lobster; font-size: 60px;\">Our History</h2>\n");
      out.write("                                <p style=\"font-family: Lobster;\"><span><span>1947</span> Welcome to FoodHub.com - India's largest Restorent. FoodHub.com has always striven to serve car buyers and owners in the most comprehensive and convenient way possible. We provide a platform where car buyers and owners can research, buy, sell and come together to discuss and talk about their cars. \n");
      out.write("    Our mission is to bring joy and delight into car buying and ownership To achieve this goal, we aim to empower Indian consumers to make informed car buying and ownership decisions with exhaustive and un-biased information on cars through our expert reviews, owner reviews, detailed specifications and comparisons.\n");
      out.write("    We understand that a car is by and large the second-most expensive asset a consumer associates his lifestyle with..</span></p>\n");
      out.write("                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"hidden-lg hidden-md hidden-sm col-xs-12\">\n");
      out.write("                            <div class=\"about-page2-img-holder\">\n");
      out.write("                                <img src=\"images/about1-banner2.jpg\" class=\"img-responsive\" alt=\"about-banner\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- About Page 2 Area End Here -->\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <!-- team -->\t\n");
      out.write("<section class=\"team\" id=\"team\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"team-heading\">\n");
      out.write("                            <h1 style=\"font-family: pacifico; text-align: center; color: #FFFFFF; font-size: 50px;\">Team</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"team-members\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 image1\">\n");
      out.write("                                    <img src=\"images/1.jpg\" alt=\" \"  class=\"img-responsive\"/>\n");
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
      out.write("                                    <img src=\"images/4.jpg\" alt=\" \"  class=\"img-responsive\"/>\n");
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
      out.write("<br>\n");
      out.write("<br>\n");
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
