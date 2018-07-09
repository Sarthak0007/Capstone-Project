package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Pacifico|Dancing Script' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/Login.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Css/sweetalert.css\">\n");
      out.write("        <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                <h2 class=\"top-title animated bounceInLeft\"> Food Hub</h2>\n");
      out.write("                <h2 class=\" second-title animated zoomIn\">\" Best in the city \"</h2>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <ul>\n");
      out.write("            <!--admin login start-->\n");
      out.write("            <button class=\"button animated zoomIn\" onclick=\"document.getElementById('id01').style.display='block'\"><span>Admin login</span></button>\n");
      out.write("            <div id=\"id01\" class=\"modal\">\n");
      out.write("                <form class=\"modal-content animate\">\n");
      out.write("                    <div class=\"imgcontainer\">\n");
      out.write("                        <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"close popup\">&times;</span>\n");
      out.write("                        <img src=\"images/avatar.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email Address\" required=\"\" autofocus=\"\"  id=\"email\" >\n");
      out.write("                         <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\" id=\"password\">      \n");
      out.write("                         <label class=\"checkbox\">\n");
      out.write("                        <input type=\"checkbox\" value=\"remember-me\" id=\"rememberMe\" name=\"rememberMe\"> Remember me\n");
      out.write("                        </label>\n");
      out.write("                         <button class=\"btn btn-lg btn-success btn-block\" type=\"submit\" onClick=\"la(this.value)\">Login</button> \n");
      out.write("                   <script>\n");
      out.write("                       \n");
      out.write("                              function la(text) {\n");
      out.write("if (text.username.value==\"foodhub@gmail.com\") { \n");
      out.write("if (text.password.value==\"password@123\") {              \n");
      out.write("location=\"foradmin.jsp\" \n");
      out.write("} else {\n");
      out.write("      swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Invalid Password!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("}\n");
      out.write("} else {  \n");
      out.write("    swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Invalid UserID!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("}\n");
      out.write("                              }\n");
      out.write("    </script>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!--admin login end-->\n");
      out.write("            <!--login start-->\n");
      out.write("            <button class=\"button animated zoomIn\" onclick=\"document.getElementById('id02').style.display='block'\"><span> Login</span></button>\n");
      out.write("            <div id=\"id02\" class=\"modal\">\n");
      out.write("                <form class=\"modal-content animate\" action=\"LoginServlet\" method=\"post\">\n");
      out.write("                    <div class=\"imgcontainer\">\n");
      out.write("                        <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"close popup\">&times;</span>\n");
      out.write("                        <img src=\"images/download.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email Address\" required=\"\" autofocus=\"\" />\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\" onchange=\"check(this.value)\">\n");
      out.write("                         <script>\n");
      out.write("                            function check(pass) {\n");
      out.write("                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;\n");
      out.write("                                \n");
      out.write("                                if(pass1.test(pass))\n");
      out.write("                                {\n");
      out.write("                                  swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Password ',\n");
      out.write("                               'success'\n");
      out.write("                                      )   \n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                             'Error!',\n");
      out.write("                                             'Invalid Password!,\"Password must contain at least one number,one special character and  have 6 to 16 valid characters\"',\n");
      out.write("                                                 'error'\n");
      out.write("                                                       )\n");
      out.write("                                           }\n");
      out.write("                                           \n");
      out.write("    \n");
      out.write("}\n");
      out.write("                        </script>\n");
      out.write("                         <label class=\"checkbox\">\n");
      out.write("                        <input type=\"checkbox\" value=\"remember-me\" id=\"rememberMe\" name=\"rememberMe\"> Remember me\n");
      out.write("                        </label>\n");
      out.write("                      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Login</button> \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!--login end-->\n");
      out.write("            <!--sign up-->\n");
      out.write("            <button class=\"button animated zoomIn\" onclick=\"document.getElementById('id03').style.display='block'\"><span>Sign up</span></button>\n");
      out.write("            <div id=\"id03\" class=\"modal\" style=\"height: 130%;\">\n");
      out.write("                <form class=\"modal-content animate\" action=\"Signup\" method=\"post\">\n");
      out.write("                    <div class=\"imgcontainer\">\n");
      out.write("                    <span onclick=\"document.getElementById('id03').style.display='none'\" class=\"close\" title=\"close popup\">&times;</span>\n");
      out.write("                    <img src=\"images/sign up.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        \n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"Signup\" placeholder=\"Name\" required=\"\"  />\n");
      out.write("                        <input type=\"number\" class=\"form-control\" name=\"Signup\" placeholder=\"Number\" required=\"\" onchange=\"CheckIndianNumber(this.value)\"  required maxlength=\"10\">\n");
      out.write("                        <script>\n");
      out.write("                         function CheckIndianNumber(IndianNumber)\n");
      out.write("                         {\n");
      out.write("                      var Num = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("                       if(Num.test(IndianNumber))\n");
      out.write("                           {\n");
      out.write("                           swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Mobile Number',\n");
      out.write("                               'success'\n");
      out.write("                                      )\n");
      out.write("                                     }\n");
      out.write("                                      else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                             'Error!',\n");
      out.write("                                             'Mobile number is not valid!',\n");
      out.write("                                                 'error'\n");
      out.write("                                                       )\n");
      out.write("                                                         }\n");
      out.write("                                                 }\n");
      out.write("                        </script>\n");
      out.write("                        \n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"Signup\" placeholder=\"Email-:niit@gmail.com\" required=\"\" style=\"margin-top:5% \" onchange=\"checkmail(this.value)\" >\n");
      out.write("                        <script>\n");
      out.write("                            function checkmail(id)\n");
      out.write("                    {\n");
      out.write("                        var email= /\\S+@\\S+\\.\\S+/;\n");
      out.write("                        if(email.test(id))\n");
      out.write("                        {\n");
      out.write("                           swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Email ',\n");
      out.write("                               'success'\n");
      out.write("                                      ) \n");
      out.write("                        }\n");
      out.write("                        else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                             'Error!',\n");
      out.write("                                             'Email is not valid!',\n");
      out.write("                                                 'error'\n");
      out.write("                                                       )\n");
      out.write("                                                         }\n");
      out.write("                    }\n");
      out.write("             \n");
      out.write("                        </script>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"Signup\" placeholder=\"Password\" required=\"\" onchange=\"passwordcheck(this.value)\" id=\"pass1\">\n");
      out.write("                        <script>\n");
      out.write("                            function passwordcheck(pass) {\n");
      out.write("                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;\n");
      out.write("                                \n");
      out.write("                                if(pass1.test(pass))\n");
      out.write("                                {\n");
      out.write("                                  swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             'Valid Password ',\n");
      out.write("                               'success'\n");
      out.write("                                      )   \n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                     {\n");
      out.write("                                     swal(\n");
      out.write("                                             'Error!',\n");
      out.write("                                             'Invalid Password!,\"Password must contain at least one number,one special character and  have 6 to 16 valid characters\"',\n");
      out.write("                                                 'error'\n");
      out.write("                                                       )\n");
      out.write("                                           }\n");
      out.write("                                           \n");
      out.write("    \n");
      out.write("}\n");
      out.write("                        </script>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"Signup\" placeholder=\"Confirm password\" required=\"\" id=\"pass2\" onchange=\"myFunction()\">\n");
      out.write("                        \n");
      out.write("                         <br>\n");
      out.write("                         <script>\n");
      out.write("                             function myFunction() {\n");
      out.write("        var pass1 = document.getElementById(\"pass1\").value;\n");
      out.write("        var pass2 = document.getElementById(\"pass2\").value;\n");
      out.write("        if (pass1 != pass2) {\n");
      out.write("            //alert(\"Passwords Do not match\");\n");
      out.write("            swal(\n");
      out.write("                              'Error!',\n");
      out.write("                             ' Password may be Different! ',\n");
      out.write("                               'error'\n");
      out.write("                                      ) \n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("           swal(\n");
      out.write("                              'Success!',\n");
      out.write("                             ' Password Match! ',\n");
      out.write("                               'success'\n");
      out.write("                                      ) \n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("                         </script>\n");
      out.write("                      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign Up</button> \n");
      out.write("                    </div>\n");
      out.write("                    </div> \n");
      out.write("                 \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!--sign up end here-->\n");
      out.write("        </ul>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
