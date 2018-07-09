<%-- 
    Document   : Home
    Created on : Dec 15, 2017, 7:43:48 PM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        <link href="Css/home.css" rel="stylesheet" type="text/css">
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
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome <%= request.getSession().getAttribute("name") %></a></li>
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
        <h1 class="title" style="font-family: Pacifico">Welcome to Food Hub</h1>
        <h3 class="subtitle" style="font-family: Pacifico"> Now That Your Tastes Have Grown Up!</h3>
    </div>
    
  </div>
  
</div>
        </div>
        <!--header end-->
        <!-- about -->
<section class="about-us" id="about-us">
		<div class="container">
			<div class="col-md-5 about-left">
                            <h2 style="font-family: Lobster; text-align: center;  ">About Us</h2><hr style=" border-width:2px;">
                            <p style="font-family: Lobster">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget 
                                    libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit 
                                    amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget 
                                    vulputate. Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales
                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla
                                    vitae.  Integer placerat tincidunt sem, at sodales justo.Integer placerat tincidunt
                                    sem, at sodales justo.. </p>
				<div class="clearfix"></div>
			</div>
			
			<div class="col-md-6 about-img" >
                            <img src="images/about1.jpg" alt="" />
				<div class="clearfix"></div>
			</div>
			<div class="col-md-6 about-img">
                            <img src="images/about2.jpg" alt="" />
				<div class="clearfix"></div>
			</div>
			<div class="col-md-5 about-right">
                            <p style="font-family: Lobster;">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget 
                                    libero finibus facilisis. Phasellus tempus hendrerit sem ut iaculis. Sed sit 
                                    amet augue sit amet mauris gravida interdum. Donec vulputate tempus sem eget 
                                    vulputate. Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales
                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla
                                    vitae.  Integer placerat tincidunt sem, at sodales justo. Vestibulum sodales 
                                    dictum scelerisque. Phasellus viverra rutrum erat, nec consequat tortor fringilla 
                                    vitae. sheets containing Lorem Ipsum passages </p>
				<div class="clearfix"></div>
			</div>
		</div>
</section>
<!-- //about end -->
<!-- service-type-grid -->
	<div class="service" id="services">
		<div class="container">
		<!---728x90--->
                <h2 class="tittle" style="font-family: Lobster; text-align: center; font-size: 50px;" >Our Services</h2><hr style="width: 50%; border-width:2px;">
			<div class="arrows-serve"></div>
                        <br>
				<div class="inst-grids">
					<div class="col-md-3 services-gd text-center wow slideInLeft"  data-wow-duration="1s" data-wow-delay=".3s">
						<div class="hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a">
							<a href="#" class="hi-icon"><img src="images/serve1.png" alt=" " /></a>
						</div>
						<h4>View our Menu</h4>
						 
					</div>
					<div class="col-md-3 services-gd text-center wow slideInDown"  data-wow-duration="1s" data-wow-delay=".2s">
						<div class="hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a">
							<a href="#" class="hi-icon"><img src="images/serve2.png" alt=" " /></a>
						</div>
						<h4>Reservation</h4>
						 
					</div>
					<div class="col-md-3 services-gd text-center wow slideInUp"  data-wow-duration="1s" data-wow-delay=".2s">
						<div class="hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a">
							<a href="#" class="hi-icon"><img src="images/serve3.png" alt=" " /></a>
						</div>
						<h4>Fine Recipes</h4>
						 
					</div>
					<div class="col-md-3 services-gd text-center wow slideInRight"  data-wow-duration="1s" data-wow-delay=".3s">
						<div class="hi-icon-wrap hi-icon-effect-9 hi-icon-effect-9a">
							<a href="#" class="hi-icon"><img src="images/serve4.png" alt=" " /></a>
						</div>
						<h4>Spicy Recipes</h4>
						 
					</div>
					<div class="clearfix"> </div>		
				</div>

		</div>
	</div>
<br>
<!-- //service-type-grid -->
<!-- team -->
<section class="team" id="team">
		<div class="container">
			<div class="team-heading">
                            <h3 style="font-family: pacifico; text-align: center; color: #FFFFFF">Team</h3>
			</div>
			<div class="team-members">
				<div class="col-md-4 image1">
                                    <img src="images/1.jpg" alt=" " class="img-responsive" />
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
                                    <img src="images/4.jpg" alt=" " class="img-responsive"/>
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
<!-- gallery -->
	<div class="gallery" id="gallery">
			<div class="agileits_w3layouts_head">
                            <h3 style="text-align: center; font-family: Lobster; margin-bottom: 5%;">Food Gallery</h3><hr style="width: 50%; border-width:2px; margin-top: -4%;">
			</div>
			<div class="w3layouts_gallery_grids">	
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p1.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p1.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Butter pizza</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p2.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p2.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Pasta</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p13.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p13.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Lemon cheese</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p4.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p4.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Toasted puff</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p6.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p6.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Burger Cheese</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p5.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p5.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>fried broccoli</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p7.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p7.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Apple almond salad</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p8.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p8.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Roasted meat</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p9.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p9.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Pasta rolls</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p10.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p10.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>fruits</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p11.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p11.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Meat Pizza</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="col-md-3 w3layouts_gallery_grid">
					<a href="images/p12.jpg" class="lsb-preview" data-lsb-group="header">
						<div class="w3layouts_news_grid">
							<img src="images/p12.jpg" alt=" " class="img-responsive">
							<div class="w3layouts_news_grid_pos">
								<div class="wthree_text"><h3>Boiled eggs</h3></div>
							</div>
						</div>
					</a>
				</div>
				<div class="clearfix"> </div>
			</div>
</div>
<!-- //gallery end -->
<!-- gallery js -->
	<script src="js/lsb.min.js"></script>
	<script>
	$(window).load(function() {
		  $.fn.lightspeedBox();
		});
	</script>
<!-- //gallery js -->
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
