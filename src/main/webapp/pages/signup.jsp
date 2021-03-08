<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   
    <link rel="stylesheet" href="<c:url value="css/style.css"/>">
   
    
  
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  
 
 <script src="<c:url value="js/login.js"/>"></script>

  <title>Sign up</title>
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
				<input type="button" onClick="registerUser()" value="Sign Up">
				<br>
				<span id="errorLogin"> </span>
				<br>
				
		</div>
   
</body>

</html>

