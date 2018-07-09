<%-- 
    Document   : menu
    Created on : Dec 17, 2017, 2:27:32 AM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Pacifico|Lobster|Tangerine|Alex Brush" rel="stylesheet">
        <link href="Css/menu.css" rel="stylesheet" type="text/css">
        
    </head>
    <style>
        .footer-distributed{
	background-color: #292c2f;
	box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);
	box-sizing: border-box;
	width: 100%;
	text-align: left;
	font: bold 16px sans-serif;

	padding: 55px 50px;
	margin-top: 0px;
}

.footer-distributed .footer-left,
.footer-distributed .footer-center,
.footer-distributed .footer-right{
	display: inline-block;
	vertical-align: top;
}

/* Footer left */

.footer-distributed .footer-left{
	width: 40%;
}

/* The company logo */

.footer-distributed h3{
	color:  #ffffff;
	font: normal 36px 'Cookie', cursive;
	margin: 0;
}

.footer-distributed h3 span{
	color:  #5383d3;
}

/* Footer links */

.footer-distributed .footer-links{
	color:  #ffffff;
	margin: 20px 0 12px;
	padding: 0;
}

.footer-distributed .footer-links a{
	display:inline-block;
	line-height: 1.8;
	text-decoration: none;
	color:  inherit;
}

.footer-distributed .footer-company-name{
	color:  #8f9296;
	font-size: 14px;
	font-weight: normal;
	margin: 0;
}

/* Footer Center */

.footer-distributed .footer-center{
	width: 35%;
}

.footer-distributed .footer-center i{
	background-color:  #33383b;
	color: #ffffff;
	font-size: 25px;
	width: 38px;
	height: 38px;
	border-radius: 50%;
	text-align: center;
	line-height: 42px;
	margin: 10px 15px;
	vertical-align: middle;
}

.footer-distributed .footer-center i.fa-envelope{
	font-size: 17px;
	line-height: 38px;
}

.footer-distributed .footer-center p{
	display: inline-block;
	color: #ffffff;
	vertical-align: middle;
	margin:0;
}

.footer-distributed .footer-center p span{
	display:block;
	font-weight: normal;
	font-size:14px;
	line-height:2;
}

.footer-distributed .footer-center p a{
	color:  #5383d3;
	text-decoration: none;;
}


/* Footer Right */

.footer-distributed .footer-right{
	width: 20%;
}

.footer-distributed .footer-company-about{
	line-height: 20px;
	color:  #92999f;
	font-size: 13px;
	font-weight: normal;
	margin: 0;
}

.footer-distributed .footer-company-about span{
	display: block;
	color:  #ffffff;
	font-size: 14px;
	font-weight: bold;
	margin-bottom: 20px;
}

.footer-distributed .footer-icons{
	margin-top: 25px;
}

.footer-distributed .footer-icons a{
	display: inline-block;
	width: 35px;
	height: 35px;
	cursor: pointer;
	background-color:  #33383b;
	border-radius: 2px;

	font-size: 20px;
	color: #ffffff;
	text-align: center;
	line-height: 35px;

	margin-right: 3px;
	margin-bottom: 5px;
}
@media (max-width: 880px) {

	.footer-distributed{
		font: bold 14px sans-serif;
	}

	.footer-distributed .footer-left,
	.footer-distributed .footer-center,
	.footer-distributed .footer-right{
		display: block;
		width: 100%;
		margin-bottom: 40px;
		text-align: center;
	}

	.footer-distributed .footer-center i{
		margin-left: 0;
	}

}
li .active
{
    background-color: #f4511e;
}

    </style>
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
        <h1 class="title" style="font-family: Pacifico">The Menu</h1>
        <h3 class="subtitle" style="font-family: Pacifico"> Always best for you !</h3>
    </div>
    
  </div>
  
</div>
        </div>
        <br>
        <!--header end-->
        <!--menu start here-->
        <section>
            <h2 style="font-family: Lobster; text-align: center; font-size: 50px;  ">Breakfast</h2><hr style=" border-width:2px; width: 50%;">
            <div class="container-fluid">
                <div class="row">
                <div class="special-top-grids" style="margin-top: 5%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem1.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Fried egg and bread pklatter 10$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem2.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
									<h2>Pan Cake 15$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem4.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Tacos 20$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem3.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Sandwich 15$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    
                                </div>			
                                
                </div>
                </div>
                <div class="row">
            <div class="special-top-grids" style="margin-top: 2%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem5.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Dosa 25$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem6.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Pizza 20$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem7.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Pasta with sauce 22$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem8.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Noodles 25$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                </div>
            </div>
            
            </div>
            </div>
            <h2 style="font-family: Lobster; text-align: center; font-size: 50px; margin-top: 3%; ">Lunch</h2><hr style=" border-width:2px; width: 30%;">
            <div class="container-fluid">
                <div class="row">
                <div class="special-top-grids" style="margin-top: 5%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem9.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Brown fish fillet 30$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem10.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
									<h2>Grilled Chicken 25$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem11.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Fried Broccoli 20$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem12.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Rice with curry 15$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    
                                </div>			
                                
                </div>
                </div>
                <div class="row">
            <div class="special-top-grids" style="margin-top: 2%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem13.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Fried rice with egg 22$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem14.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Rosted Mutton 35$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem15.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Salad  15$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem16.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Grilled beef 25$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                </div>
            </div>
            
            </div>
            </div>
            <h2 style="font-family: Lobster; text-align: center; font-size: 50px; margin-top: 3%; ">Dinner</h2><hr style=" border-width:2px; width: 30%;">
            <div class="container-fluid">
                <div class="row">
                <div class="special-top-grids" style="margin-top: 5%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem17.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Lemon Rice 12$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem18.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
									<h2> Stuffed Roll 20$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem19.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Grilled Kebab 24$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem20.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Rosted Chicken 35$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    
                                </div>			
                                
                </div>
                </div>
                <div class="row">
            <div class="special-top-grids" style="margin-top: 2%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem21.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Sausage 22$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem13.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Fried Rice with egg 22$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem23.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Salad  15$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem16.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Grilled beef 25$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                </div>
            </div>
            
            </div>
            </div>
            <h2 style="font-family: Lobster; text-align: center; font-size: 50px; margin-top: 3%; ">Desserts</h2><hr style=" border-width:2px; width: 30%;">
            <div class="container-fluid">
                <div class="row">
                <div class="special-top-grids" style="margin-top: 5%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem24.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Strawberry with whipped cream glass 20$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem25.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
									<h2> Chilled Cherry 17$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem26.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Dark Cup cake with whipped cream 12$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem27.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Cream Puffs 15$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    
                                </div>			
                                
                </div>
                </div>
                <div class="row">
            <div class="special-top-grids" style="margin-top: 2%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem28.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Chocolate Bread 12$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem29.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Strawberry Cake 22$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem30.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Pot Pie  25$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem31.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> King Crown Cake 25  $</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                </div>
            </div>
            
            </div>
            </div>
            <h2 style="font-family: Lobster; text-align: center; font-size: 50px; margin-top: 3%; ">Drinks</h2><hr style=" border-width:2px; width: 30%;">
            <div class="container-fluid">
                <div class="row">
                <div class="special-top-grids" style="margin-top: 5%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem32.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Lemon and Strawberry Chilled 15$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem33.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
									<h2> Apple Juice 12$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem34.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Orange Juice 10$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem35.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Green Apple Shake 15$</h2>
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    
                                </div>			
                                
                </div>
                </div>
                <div class="row">
            <div class="special-top-grids" style="margin-top: 2%;">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem36.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Wine 35$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem37.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Blue Berry Shake 18$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem38.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2>Red wine  30$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                    <div class="col-md-3 special-grids">
						<div class="special-img">
                                                    <img class="img-responsive img-thumbnail" src="images/menuitem39.jpeg" alt="">
							<div class="captn">
								<div class="captn-top">
                                                                    <h2> Coca Cola 10$</h2>
                                                                        
								</div>
								<div class="wthree-special-info">
                                                                    <a href="#"><button class="btn btn-success">Add to Cart</button></a>
								</div>
							</div>
						</div>
                                        </div>
                                </div>
            </div>
            
            </div>
            </div>
        </section>
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

					<a href="#"><i class="fa fa-facebook"></i></a>
					<a href="#"><i class="fa fa-twitter"></i></a>
					<a href="#"><i class="fa fa-linkedin"></i></a>
					<a href="#"><i class="fa fa-github"></i></a>

				</div>

			</div>

		</footer>
<!--smooth scroll js code start-->
<script src="js/SmoothScroll.min.js"></script>

	
        <script src="js/jquery-2.1.4.min.js"></script>
        <!--smooth scroll js code end-->
    </body>
</html>
