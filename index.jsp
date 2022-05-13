<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css" />
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <title>Italian Zest</title>
  </head>
  <body>
    <!-- Start  Navigation bar  -->
    <section class="Navigation">
    <div class="nav-bar">
      <img src="${pageContext.request.contextPath}/resources/images/logo.png" class="logo" >
      
      <ul>
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
       <li><a href="${pageContext.request.contextPath}/dish/showmenuforcustomer">Menu </a></li>
        <li><a href="" onclick="window.location.href='reservation/showFormForAdd'; return false;" >Reservation</a></li>
        <li><a href="${pageContext.request.contextPath}/dish/aboutus">About us</a></li>
       
       
        <li class="signin"><i class="fas fa-user"></i><a href="${pageContext.request.contextPath}/login1"> Signin</a></li>
       
      </ul>
    </div>
  </section>
<!-- End Navigation bar  -->

<!-- main section   -->
  <section class="main">
    <div class="contaniar">
    <div class="left">
        <h1> Italian Zest </h1>
        <h2>THE BEST EXPERIENCE </h2>
        <button class="reservation-btn"  onclick="window.location.href='reservation/showFormForAdd'; return false;" >Make A Reservation</button>
    </div>
      <div class="right"></div> 
    </div>
  </section>

<!-- end main section   -->
  


    <!-- Start  why-us  -->

  <div class="Why-us">
		<div class="title">
			<h2>Why Choose Our Food</h2>
		</div>

		<div class="whyus-container">
		

			<div class="card">
				
        <img src="${pageContext.request.contextPath}/resources/images/whyusimg1.png" alt="ItalianZest" class="card-image" >
				<h5>Quality Food</h5>
				<div class="description">
					<p>Our restaurant sets a high standard for its food quality and ensures that guests receive the same quality with every meal.our restaruant earn a good reputation for compel your guests to return for repeat visits.</p>

					<p style="text-align: center;">
					
					</p>
				</div>
			</div>

			<div class="card">
				
        <img src="${pageContext.request.contextPath}/resources/images/whyusimg2.png" class="card-image" >
				<h5>Best Service</h5>
				<div class="description">
					<p>Our staff who interact with our guests be courteous and maintain a positive attitude. Our servers  know the menu well, deliver guests food and drinks on time</p>

					<p style="text-align: center;">
					
					</p>
				</div>
			</div>

      <div class="card">
				
        <img src="${pageContext.request.contextPath}/resources/images/whyusimg3.png" class="card-image"  >
				<h5>Skilled Chef </h5>
				<div class="description">
					<p>Our Chef understands your guests' needs and works well with the kitchen staff to ensure that guests receive their meal the way they ordered it every time.</p>

					<p style="text-align: center;">
					
					</p>
				</div>
			</div>
		</div>
	</div>
<!-- End  why-us  -->
<!-- Start  footor  -->

  <footer class="footer">
    <div class="footer-container">
      <div class="row">
        <div class="footer-col">
          <h4>Location</h4>
          <ul>
            <li><a href="#">ItalianZest Restaruant</a></li>
            <li><a href="#">777 tastyfood lane,</a></li>
            <li><a href="#">Dallas,Tx</a></li>
            
          </ul>
        </div>
        <div class="footer-col">
          <h4>OPENING HOURS</h4>
          <ul>
            <li><a href="#">Monday: Closed</a></li>
            <li><a href="#">Tue-Wed : 9:Am - 10PM</a></li>
            <li><a href="#">Thu-Fri : 9:Am - 10PM</a></li>
            <li><a href="#">Sat-Sun : 5:PM - 10PM</a></li>
            
          </ul>
        </div>
        <div class="footer-col">
          <h4>CONTACT INFORMATION</h4>
          <ul>
            <li><a href="#">Email: italianzest@gmail.com</a></li>
            <li><a href="#">Phone No: 949-67-7777</a></li>
                       </ul>
        </div>
        <div class="footer-col">
          <h4>follow us</h4>
          <div class="social-links">
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-linkedin-in"></i></a>
          </div>
        </div>
      </div>
    </div>
 </footer>


  
  </body>

  
</html>