<%-- 
    Document   : About
    Created on : Dec 18, 2017, 3:20:16 AM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About_us</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        <link href="Css/about.css" rel="stylesheet" type="text/css">
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
        <h1 class="title" style="font-family: Pacifico ; font-size: 80px;">About Us</h1>
        <h3 class="subtitle" style="font-family: Pacifico"> Know Somthing about history and ourself!</h3>
    </div>
    
  </div>
  
</div>
        </div>
        <!--header end-->
        <br>
        <br>
        <br>
        
        <!-- About Page 2 Area Start Here -->
            <div class="about-page2-area section-space">
                <img src="images/about1-bottom-back.png" class="img-responsive" alt="about1-bottom-back">
                <div class="container">
                    <div class="row no-gutters about-page2-inner">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="about-page2-content">
                                <h1 style="font-family: Lobster; font-size: 60px;">Who We Are</h1>
                                <p style="font-family: Lobster;">We Are Just A Normal Person And We Want To See Happy To All Because The food is a One Of The Most Beautiful Thing In Life So 
        We Are Create A This Movement For A Our Customer For Feel Happy And Free To Contact Us.To achieve this goal, we aim to empower Indian consumers to make informed car buying and ownership decisions with exhaustive and un-biased information on cars through our expert reviews, owner reviews, detailed specifications and comparisons.
    We understand that a car is by and large the second-most expensive asset a consumer associates his lifestyle with.</p>
                                 </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="about-page2-img-holder">
                                <img src="images/aboutbanner1.jpeg" class="img-responsive" alt="about-banner">
                            </div>
                        </div>
                    </div>
                    <div class="row no-gutters about-page2-inner">
                        <div class="col-lg-6 col-md-6 col-sm-6 hidden-xs">
                            <div class="about-page2-img-holder">
                                <img src="images/about1-banner2.jpg" class="img-responsive" alt="about-banner">
                            </div>
                        </div>
                         <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="about-page2-content">
                                <h1 style="font-family: Lobster; font-size: 60px;">Our History</h2>
                                <p style="font-family: Lobster;"><span><span>1947</span> Welcome to FoodHub.com - India's largest Restorent. FoodHub.com has always striven to serve car buyers and owners in the most comprehensive and convenient way possible. We provide a platform where car buyers and owners can research, buy, sell and come together to discuss and talk about their cars. 
    Our mission is to bring joy and delight into car buying and ownership To achieve this goal, we aim to empower Indian consumers to make informed car buying and ownership decisions with exhaustive and un-biased information on cars through our expert reviews, owner reviews, detailed specifications and comparisons.
    We understand that a car is by and large the second-most expensive asset a consumer associates his lifestyle with..</span></p>
                            
                            </div>
                        </div>
                        <div class="hidden-lg hidden-md hidden-sm col-xs-12">
                            <div class="about-page2-img-holder">
                                <img src="images/about1-banner2.jpg" class="img-responsive" alt="about-banner">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- About Page 2 Area End Here -->
            <br>
            <br>
            
            <!-- team -->	
<section class="team" id="team">
		<div class="container">
			<div class="team-heading">
                            <h1 style="font-family: pacifico; text-align: center; color: #FFFFFF; font-size: 50px;">Team</h1>
			</div>
			<div class="team-members">
				<div class="col-md-4 image1">
                                    <img src="images/1.jpg" alt=" "  class="img-responsive"/>
					<ul class="social-icons1">
						<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					</ul>
					<h5>Johnson</h5>
					<p>“Master Chef”</p>
					
				</div>
				<div class="col-md-4 image1">
                                    <img src="images/2.jpg" alt=" " class="img-responsive" />
					<ul class="social-icons1">
						<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					</ul>
					<h5>Enrique</h5>
					<p>“Master Grill”</p>
				</div>
				<div class="col-md-4 image1">
                                    <img src="images/4.jpg" alt=" "  class="img-responsive"/>
					<ul class="social-icons1">
						<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
					</ul>
					<h5>forkler</h5>
					<p>“Head Chef”</p>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
</section>
<!-- //team -->
<br>
<br>
<!--testomonial start-->
<p style="font-family: Pacifico; font-size: 50px; text-align: center;">Our customer says</p><hr style="width: 50%; border-width:2px;">

<div class="jumbotron">
<div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="carousel slide" data-ride="carousel" id="quote-carousel">
                    <!-- Carousel Slides / Quotes -->
                    <div class="carousel-inner text-center">
                        <!-- Quote 1 -->
                        <div class="item active">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-8 col-sm-offset-2">
                                        <p style="color: white;">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt 
                                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation 
                                            ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit 
                                            in voluptate velit esse cillum dolore eu fugiat nulla pariatur. !</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 2 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-8 col-sm-offset-2">
                                        <p style="color: white;">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt 
                                            ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation 
                                            ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in 
                                            reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. </p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                        <!-- Quote 3 -->
                        <div class="item">
                            <blockquote>
                                <div class="row">
                                    <div class="col-sm-8 col-sm-offset-2">
                                        <p style="color: white;">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor 
                                            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud 
                                            exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure 
                                            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. .</p>
                                        <small>Someone famous</small>
                                    </div>
                                </div>
                            </blockquote>
                        </div>
                    </div>
                    <!-- Bottom Carousel Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#quote-carousel" data-slide-to="0" class="active"><img class="img-responsive " src="https://s3.amazonaws.com/uifaces/faces/twitter/mantia/128.jpg" alt="">
                        </li>
                        <li data-target="#quote-carousel" data-slide-to="1"><img class="img-responsive" src="https://s3.amazonaws.com/uifaces/faces/twitter/adhamdannaway/128.jpg" alt="">
                        </li>
                        <li data-target="#quote-carousel" data-slide-to="2"><img class="img-responsive" src="https://s3.amazonaws.com/uifaces/faces/twitter/brad_frost/128.jpg" alt="">
                        </li>
                    </ol>

                    <!-- Carousel Buttons Next/Prev -->
                    <a data-slide="prev" href="#quote-carousel" class="left carousel-control"><i class="fa fa-chevron-left"></i></a>
                    <a data-slide="next" href="#quote-carousel" class="right carousel-control"><i class="fa fa-chevron-right"></i></a>
                </div>
            </div>
        </div>
       </div>
    </div>
<!--testmonial end-->
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

	<script>
		$(document).ready(function () {
			size_li = $("#myList li").size();
			x = 1;
			$('#myList li:lt(' + x + ')').show();
			$('#loadMore').click(function () {
				x = (x + 1 <= size_li) ? x + 1 : size_li;
				$('#myList li:lt(' + x + ')').show();
			});
			$('#showLess').click(function () {
				x = (x - 1 < 0) ? 1 : x - 1;
				$('#myList li').not(':lt(' + x + ')').hide();
			});
		});
	</script>
        <script src="js/jquery-2.1.4.min.js"></script>
        <!--smooth scroll js code end-->
    </body>
</html>
