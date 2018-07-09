<%-- 
    Document   : Login
    Created on : Dec 15, 2017, 5:22:56 PM
    Author     : Sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link href='http://fonts.googleapis.com/css?family=Pacifico|Dancing Script' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="Css/Login.css" type="text/css">
        <link rel="stylesheet" href="Css/animate.css">
        <link rel="stylesheet" href="Css/sweetalert.css">
        <script src="js/sweetalert.min.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/script.js"></script>
        
    </head>
    
    <body>
        <div class="container">
            <div class="col-md-6 col-md-offset-3">
                <h2 class="top-title animated bounceInLeft"> Food Hub</h2>
                <h2 class=" second-title animated zoomIn">" Best in the city "</h2>
                <hr>
            </div>
        </div>
        <ul>
            <!--admin login start-->
            <button class="button animated zoomIn" onclick="document.getElementById('id01').style.display='block'"><span>Admin login</span></button>
            <div id="id01" class="modal">
                <form class="modal-content animate">
                    <div class="imgcontainer">
                        <span onclick="document.getElementById('id01').style.display='none'" class="close" title="close popup">&times;</span>
                        <img src="images/avatar.png" alt="Avatar" class="avatar">
                    </div>
                    <div class="container">
                        <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus=""  id="email" >
                         <input type="password" class="form-control" name="password" placeholder="Password" required="" id="password">      
                         <label class="checkbox">
                        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
                        </label>
                         <button class="btn btn-lg btn-success btn-block" type="submit" onClick="la(this.value)">Login</button> 
                   <script>
                       
                              function la(text) {
if (text.username.value=="foodhub@gmail.com") { 
if (text.password.value=="password@123") {              
location="foradmin.jsp" 
} else {
      swal(
      'Error!',
      'Invalid Password!',
      'error'
    )
}
} else {  
    swal(
      'Error!',
      'Invalid UserID!',
      'error'
    )
}
                              }
    </script>
                    </div>
                </form>
            </div>
            <!--admin login end-->
            <!--login start-->
            <button class="button animated zoomIn" onclick="document.getElementById('id02').style.display='block'"><span> Login</span></button>
            <div id="id02" class="modal">
                <form class="modal-content animate" action="LoginServlet" method="post">
                    <div class="imgcontainer">
                        <span onclick="document.getElementById('id02').style.display='none'" class="close" title="close popup">&times;</span>
                        <img src="images/download.png" alt="Avatar" class="avatar">
                        <div class="container">
                        <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
                        <input type="password" class="form-control" name="password" placeholder="Password" required="" onchange="check(this.value)">
                         <script>
                            function check(pass) {
                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
                                
                                if(pass1.test(pass))
                                {
                                  swal(
                              'Success!',
                             'Valid Password ',
                               'success'
                                      )   
                                }
                                else
                                     {
                                     swal(
                                             'Error!',
                                             'Invalid Password!,"Password must contain at least one number,one special character and  have 6 to 16 valid characters"',
                                                 'error'
                                                       )
                                           }
                                           
    
}
                        </script>
                         <label class="checkbox">
                        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
                        </label>
                      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button> 
                    </div>
                    </div>
                </form>
            </div>
            <!--login end-->
            <!--sign up-->
            <button class="button animated zoomIn" onclick="document.getElementById('id03').style.display='block'"><span>Sign up</span></button>
            <div id="id03" class="modal" style="height: 130%;">
                <form class="modal-content animate" action="Signup" method="post">
                    <div class="imgcontainer">
                    <span onclick="document.getElementById('id03').style.display='none'" class="close" title="close popup">&times;</span>
                    <img src="images/sign up.png" alt="Avatar" class="avatar">
                    <div class="container">
                        
                        <input type="text" class="form-control" name="Signup" placeholder="Name" required=""  />
                        <input type="number" class="form-control" name="Signup" placeholder="Number" required="" onchange="CheckIndianNumber(this.value)"  required maxlength="10">
                        <script>
                         function CheckIndianNumber(IndianNumber)
                         {
                      var Num = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
                       if(Num.test(IndianNumber))
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
                        
                        <input type="email" class="form-control" name="Signup" placeholder="Email-:niit@gmail.com" required="" style="margin-top:5% " onchange="checkmail(this.value)" >
                        <script>
                            function checkmail(id)
                    {
                        var email= /\S+@\S+\.\S+/;
                        if(email.test(id))
                        {
                           swal(
                              'Success!',
                             'Valid Email ',
                               'success'
                                      ) 
                        }
                        else
                                     {
                                     swal(
                                             'Error!',
                                             'Email is not valid!',
                                                 'error'
                                                       )
                                                         }
                    }
             
                        </script>
                        
                        
                        
                        <input type="password" class="form-control" name="Signup" placeholder="Password" required="" onchange="passwordcheck(this.value)" id="pass1">
                        <script>
                            function passwordcheck(pass) {
                                var pass1= /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
                                
                                if(pass1.test(pass))
                                {
                                  swal(
                              'Success!',
                             'Valid Password ',
                               'success'
                                      )   
                                }
                                else
                                     {
                                     swal(
                                             'Error!',
                                             'Invalid Password!,"Password must contain at least one number,one special character and  have 6 to 16 valid characters"',
                                                 'error'
                                                       )
                                           }
                                           
    
}
                        </script>
                        <input type="password" class="form-control" name="Signup" placeholder="Confirm password" required="" id="pass2" onchange="myFunction()">
                        
                         <br>
                         <script>
                             function myFunction() {
        var pass1 = document.getElementById("pass1").value;
        var pass2 = document.getElementById("pass2").value;
        if (pass1 != pass2) {
            //alert("Passwords Do not match");
            swal(
                              'Error!',
                             ' Password may be Different! ',
                               'error'
                                      ) 
        }
        else {
           swal(
                              'Success!',
                             ' Password Match! ',
                               'success'
                                      ) 
        }
    }
                         </script>
                      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button> 
                    </div>
                    </div> 
                 
                </form>
                
            </div>
            <!--sign up end here-->
        </ul>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
