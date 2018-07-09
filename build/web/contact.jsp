<%-- 
    Document   : contact
    Created on : Dec 18, 2017, 5:17:38 AM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact_us</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        <link href="Css/contact.css" rel="stylesheet" type="text/css">
        <script src="js/jquery-2.1.4.min.js"></script>
        
    </head>
    <body>
        <!--header start-->
        <div class="header">
      <div class="container-fluid main">

  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span> 
        </button>
          <a class="navbar-brand" href="#" style="font-family: Pacifico">Food Hub</a>
      </div>
      <div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="Home.jsp">Home</a></li>
          <li><a href="menu.jsp">Menu</a></li>
          <li><a href="reservation.jsp">Reservation</a></li>
          <li><a href="About.jsp">About Us </a></li>
          <li><a href="contact.jsp">Contact Us</a></li>
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome <%= request.getSession().getAttribute("userdb") %></a></li>
          <li ><a href="Login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
          <li><a  href="#"><i class="fa fa-shopping-cart" aria-hidden="true"></i> </a></li>
          
          
        </ul>
      </div>
    </div>
  </nav>

  <div id="myCarousel" class="carousel carousel-fade slide" data-ride="carousel" data-interval="3000">
    <div class="carousel-inner" role="listbox">
      <div class="item active background a"></div>
      <div class="item background b"></div>
      <div class="item background c"></div>
    </div>
  </div>
  
  <div class="covertext">
    <div class="col-lg-10" style="float:none; margin:0 auto;">
        <h1 class="title" style="font-family: Pacifico">Contact Us</h1>
        <h3 class="subtitle" style="font-family: Pacifico"> We always with you to feel you better!</h3>
    </div>
    
  </div>
  
</div>
        </div>
          <br>
          
        <!--header end-->
        <div class="container">
        <h2 style="font-family: Lobster; text-align: center; font-size: 50px;   ">Get In Touch</h2><hr style=" border-width:2px; width: 50%;">
        <p style="font-family: Lobster;text-align: center; font-size: 30px;margin-top: 5%;">Food hub restaurant and bar are located on the ground and first floor within the Winchester Grade VI listed building of the Royal Institution of Chartered Surveyors. The restaurant and bar both have their own entrances.

If you have questions or comments, please get a hold of us in whichever way is most convenient. Ask away. There is no reasonable question that our team can not answer</p>
        </div>
        <!--map start-->
<div>
    <section>
        <h3 style="font-family: Pacifico; text-align: center; font-size: 50px;">Contact us</h3><hr style="width: 50%; border-width:2px;"><br>
        <div class="container-fluid">
           <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d224457.68937691895!2d77.20698482729465!3d28.474986907732525!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x390ce25cec302ea5%3A0xb9205fdecb25f898!2sNIIT+Delhi+South+Extension+Centre!5e0!3m2!1sen!2sin!4v1512770870734" width="1235" height="400" frameborder="0" style="border:0 " allowfullscreen ></iframe> 
        </div>
    </section>
</div>

<!--map end-->
<!--footer-->
<footer class="footer-distributed">

			<div class="footer-left">

                            <h3 style="font-family: Pacifico;"> Food Hub</h3>

				<p class="footer-links">
					<a href="Home.jsp">Home</a>
					·
					<a href="reservation.jsp">Reservation</a>
					·
					<a href="menu.jsp">Menu</a>
					·
					<a href="about.jsp">About us</a>
					·
					
					·
					<a href="contact.jsp">Contact us</a>
				</p>

				<p class="footer-company-name">Owner Sarthak Syal | made @2017 </p>
			</div>

			<div class="footer-center">

				<div>
					<i class="fa fa-map-marker"></i>
					<p><span>D-7 South-ex</span> New Delhi-110048</p>
				</div>

				<div>
					<i class="fa fa-phone"></i>
					<p>+1 555 123456</p>
				</div>

				<div>
					<i class="fa fa-envelope"></i>
					<p><a href="http://www.niitstudent.com/india/studentweb/index.aspx"><span class="__cf_email__" data-cfemail="b9caccc9c9d6cbcdf9dad6d4c9d8d7c097dad6d4">Sarthak@niit.com</span></a></p>
				</div>

			</div>

			<div class="footer-right">

				<p class="footer-company-about">
					<span>About the company</span>
					Lorem ipsum dolor sit amet, consectateur adispicing elit. Fusce euismod convallis velit, eu auctor lacus vehicula sit amet.
				</p>

				<div class="footer-icons">

					<a href="https://www.facebook.com/"><i class="fa fa-facebook"></i></a>
					<a href="https://twitter.com/login?lang=en"><i class="fa fa-twitter"></i></a>
					<a href="https://www.instagram.com/?hl=en"><i class="fa fa-instagram"></i></a>
					<a href="https://github.com/login"><i class="fa fa-github"></i></a>

				</div>

			</div>

		</footer>
<!--smooth scroll js code start-->
<script src="js/SmoothScroll.min.js"></script>

        </body>
</html>
