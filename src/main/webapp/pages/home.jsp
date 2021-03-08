 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   
    <link href="<c:url value="css/style.css"/>" rel="stylesheet" type="text/css"> 
    <script src="<c:url value="js/login.js"/>"></script>
   
  

  
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Job Application Tracker SignIn</title>
  </head>
<body>

<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>Job Application<span>Tracker</span></div>
		</div>
		<br>
		<div class="login">
				<input type="text" id="username" placeholder="username" name="user" maxlength="30"><br>
				<input type="password" id="password" placeholder="password" name="password" maxlength="30"><br>
				<input type="button" value="Login" onClick="login()">
				<br>
				<span id="errorLogin"> </span>
				<br>
				<a onclick="location.href='./signup'">New User ?</a>
		</div>
		
		


<!--  
  <div class="main">
    <p class="sign" align="center">Log in</p>
    <form class="form1">
      <input class="un " id="username" type="text" align="center" placeholder="Username" maxlength="30">
      <input class="pass" id="pass" type="password" align="center" placeholder="Password" maxlength="30">
      <a class="submit" align="center" onClick="login()">Sign in</a>
      <br>
      
       <p class="newuser" align="center"><a  onclick="location.href='./signup'">New User?</p>
       <br>
       
       <span id="registerError" class="errorLogin">
     </span>
      
      </form>          
    </div>
   -->
</body>

</html>

