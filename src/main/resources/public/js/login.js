function registerUser()
{

 var password = document.getElementById("password").value;
 var username = document.getElementById("username").value;

if(validateCredentials())

{
	 console.log("Valid");
     document.getElementById("errorLogin").innerHTML="";
     
}
else
{
	console.log("Invalid");
	document.getElementById("errorLogin").innerHTML="Please Enter Credentials.";
}
}

function login()
{

 var password = document.getElementById("password").value;
 var username = document.getElementById("username").value;

if(validateCredentials())

{
	 console.log("Valid");
     document.getElementById("errorLogin").innerHTML="";
     
}
else
{
	console.log("Invalid");
	document.getElementById("errorLogin").innerHTML="Please Enter Credentials.";
}
}




function validateCredentials()
{
	 var pass = document.getElementById("password").value;
     var username = document.getElementById("username").value;
     if(pass == null || pass=="" || username == null || username =="")
     {
	     return false;
      }
    return true;
	
}