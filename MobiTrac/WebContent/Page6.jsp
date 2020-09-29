<%@page import="java.io.PrintWriter"%>
<%@page import="com.model.UserLog"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.MobiTracImpl"%>
<%@page import="com.dao.MobiTracDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="mystyle6.css">
</head>
<body>
	<br>
	<div class="container">
		<div class="navbar navbar-inverse" height=30%>
			<div class="container-fluid">
				<div class="navbar-logo">
					<a href="" class="navbar-brand"> <img src="logo2.png"></a>
				</div>
				<form action="" class="navbar-form">
					<div class="form-group input-group">
						<input type="text" placeholder="Search IMEI Number" class="form-control" style="border-radius: 10px;width:8cm;height:1cm;">

						<div class="input-group-btn">

							
						</div>
					</div>
				</form>
				<div class="nav navbar-nav navbar-right">
					<p><a href="#" style="color: white;margin-left: -8px;"><img src="photo.png" alt="HI">
<%
String email = request.getParameter("email");
String password = request.getParameter("password");


 	MobiTracDao dao = new MobiTracImpl();
 	ArrayList<UserLog> al = dao.listInfo();
 	for (UserLog b : al) {
 		if(b.getEmail().equalsIgnoreCase(email) && b.getPassword().equals(password)){
 			out.println(b.getFirstName());
 		}
 		if(b.getMno().equals(email) && b.getPassword().equals(password)){
 			out.println(b.getFirstName());
 		}
 	}
 %>
</a><a href="MainPage.html" style="color: white"><span
							class="glyphicon glyphicon-user active"></span> LogOut</a>
				</p>
				</div>
			</div>
		</div>

		<div>
			<img src="girl.png" class="img-fluid" alt="Responsive image">
			<div class="image">
				<div class="txt">
					<h1>MobiTracApplication</h1>
					<h3 style="font-style: italic;line-height: 1cm;">   DownloadFromHere</h3><br>
					<div class="row">
						<div class="column">
							<img src="appstore.png">
						</div>
						<div class="column">
							<img src="playstore.png">
						</div>
					</div>
				</div>
			</div>

		</div>
		<br>
		<div>
			<img src="bottomlogo.png" class="img-fluid1" alt="Responsive image">
		</div>
		<br>
		<div class="plan">
			<form>
				<p
					style="margin-left: 50px; height: 350px; width: 350px; margin-top: 0px"></p>
				<img src="aboutimg.png"
					style="margin-top: -320px; height: 350px; width: 350px; margin-left: 80px;">
			</form>
			<h1
				style="margin-top: -350px; margin-left: 450px; font-size: 80px; opacity: 10%;">ABOUT</h1>
			<div class="data">
				<br> Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's standard
				dummy text ever since the 1500s, when an unknown printer took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged.
			</div>

		</div>
		<br>
		<br>
		<div class="app">
			<center>
				<br>
				<h1 style="color: white">Hurry up!Get your Mobitrak Application</h1>
				<span class="column"><img src="appstore.png"></span> <span
					class="column"><img src="playstore.png"></span>
			</center>
		</div>
		<div class="im" style="opacity: 90%;">
			<img src="img.png" class="img-fluid3" alt="Responsive image">
			<div class="inputs">
				<h1 style="color: white">
					<a class="img" href="#"><img src="Group.png"></a>GET IN TOUCH
				</h1>
			</div>
			<div class="input">
				<input type="text" placeholder="Name"><br>
				<br> <input type="text" placeholder="Phone"><br>
				<br> <input type="text" placeholder="Email"><br>
				<br>
				<button style="background-color: #0383CD; color: white;">Submit&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;>></button>
				<br>
			</div>
		</div>
		<div class="plane1">
			<br> <br>
			<div class="footer">
				<a href="" style="color: white">Home /</a> <a href=""
					style="color: white">SignIn /</a> <a href="" style="color: white">SignUp
					/</a> <a href="" style="color: white">Contact /</a> <a href=""
					style="color: white">About /</a> <a href="" style="color: white">Newsletter
					/</a>

				<div class="icon">
					<a href=""><img src="Group 41.svg"></a> <a href=""><img
						src="Group 43.svg"></a> <a href=""><img src="Group 46.svg"></a><br>
				</div>
			</div>
		</div>

		<div class="line">
			<br>
			<hr style="width: 90%">
		</div>
		<div class="text1">
			<br>
			<center>Copyright-2020 Ojas Innovative Technologies. All
				Rights Reserved.</center>
		</div>


	</div>
</body>
</html>
