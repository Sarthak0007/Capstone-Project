<%-- 
    Document   : reservation
    Created on : Dec 18, 2017, 1:39:16 AM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservation</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        <link rel="stylesheet" href="Css/reservation.css" type="text/css">
        <script src="js/sweetalert.min.js"></script>
<link rel="stylesheet" href="Css/sweetalert.css">
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
        <h1 class="title" style="font-family: Pacifico; font-size: 80px;" >Reservation</h1>
        <h3 class="subtitle" style="font-family: Pacifico"> Reserve best for your occasion!</h3>
    </div>
    
  </div>
  
</div>
        </div>
        <!--header end-->
        
        <!-- about -->
<section class="about-us" id="about-us">
		<div class="container">
			<div class="col-md-5 about-left">
                            <h2 style="font-family: Lobster; text-align: center;  ">Private Dining & Events</h2><hr style=" border-width:2px;">
                            <p style="font-family: Lobster">Whatever your event or celebration, we are here to make your 
                                special day a truly memorable one. Food hub private dining experts are more than happy to 
                                create custom floral arrangements and arrange for guests to meet Chef Moise during the 
                                course of their meal. For parties of 8-12 we have the roastery table which is available 
                                for private hire.
                                     </p>
				<div class="clearfix"></div>
			</div>
			
			<div class="col-md-6 about-img" >
                            <img src="images/reservation.jpeg" alt="" />
				<div class="clearfix"></div>
			</div>
			<div class="col-md-6 about-img">
                            <img src="images/reservation2.jpeg" alt="" />
				<div class="clearfix"></div>
			</div>
                    <h2 style="font-family: Lobster; text-align: center; margin-top: 37%; ">Reserve By Phone</h2><hr style=" border-width:2px;">
			<div class="col-md-5 about-right">
                            <p style="font-family: Lobster;">We take reservations for lunch and dinner. To make a reservation, please call us at +1 555 123456 between 10am-6pm, Monday to Friday.

We do not book the bar area – we leave this for walk-in guests to ensure that we always offer some tables for those who have not booked. </p>
				<div class="clearfix"></div>
			</div>
		</div>
</section>
<!-- //about end -->
<br>
        <br>
        
<!-- reservation-page-area Start Here -->
            <div class="reservation-page-area">
                <div class="container">                    
                    <div class="reservation-page-inner">
                        <div class="reservation-page-left">
                            <div class="reservation-page-form"> 
                                <span>Take A</span>
                                <h2>RESERVATION</h2>
                                <form id="reservation-form" action="reservation" method="post">                                        
                                    <div class="reservation-page-input-box">
                                        <input type="text" class="form-control" placeholder="Name" name="Reservation" id="form-name" data-error="Subject field is required" required />
                                    </div>
                                    <div class="reservation-page-input-box">
                                        <input type="text" class="form-control" placeholder="E-mail" name="Reservation" id="form-subject" data-error="Subject field is required" required/>
                                    </div>
                                    <div class="reservation-page-input-box">
                                        <input type="text" class="form-control" placeholder="Phone" name="Reservation" id="form-phone" data-error="Subject field is required" required onchange="CheckIndianNumber(this.value)"/>
                                        
                                    </div>
                                    <script>
                                        function CheckIndianNumber(IndianNumber)
{
var IndNum = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
if(IndNum.test(IndianNumber))
       {
           swal(
  'Success!',
  'Valid Mobile Number',
  'success'
)
       }
       else
       {
           swal(
      'Error!',
      'Mobile number is not valid!',
      'error'
    )
       }
}
                                    </script>
                                    <div class="reservation-page-input-box">
                                        <i class="fa fa-calendar" aria-hidden="true"></i>
                                        <input type="text" class="form-control rt-date" placeholder="Date" name="Reservation" id="form-date" data-error="Subject field is required" required/>
                                    </div>
                                    <div class="reservation-page-input-box">
                                        <i class="fa fa-clock-o" aria-hidden="true"></i>
                                        <input type="text" class="form-control rt-time" placeholder="Time" name="Reservation" id="form-time" data-error="Subject field is required" required/>
                                    </div>
                                     <div class="reservation-page-input-box">
                                        <textarea class="form-control" placeholder="Message" name="Reservation" id="form-message" data-error="Message field is required" required></textarea>
                                    </div>
                                    <button type="submit" class="book-now-btn">Book A Table</button>
                                    <div class='form-response'></div>
                                </form>                                 
                            </div>
                        </div>
                        <div class="reservation-page-right">
                            <img src="images/reservation-banner.png" class="img-responsive" alt="reservation-banner"> 
                        </div>
                    </div>
                </div>
            </div>
            <!-- Table Reservation 2 Area End Here -->
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
					<p><a href="/cdn-cgi/l/email-protection#16656366667964625675797b6677786f3875797b"><span class="__cf_email__" data-cfemail="b9caccc9c9d6cbcdf9dad6d4c9d8d7c097dad6d4">Sarthak@niit.com</span></a></p>
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
