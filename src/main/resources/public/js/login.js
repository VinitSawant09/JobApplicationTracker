function registerUser()
{

 var password = document.getElementById("password").value;
 var username = document.getElementById("username").value;

if(validateCredentials())

{
	
     document.getElementById("errorLogin").innerHTML="";
     var registerData = {
			"username": username, 
	        "password": password
           
  		   }
       

     $.ajax(
       {
        url  : "/register",
       headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
			
        },
        type:"POST",
        data : JSON.stringify(registerData),
        contentType: 'application/json',
        cache: false,
        processData: false,
        success: function(response)
		{
			console.log(response);
	         if(response.statusCode == "0")
	        { 
		     document.getElementById("errorLogin").innerHTML="";
			 alert("Successfully registered. Please Sign In now.");
             console.log(response);
			 window.location.replace("./");
             }
            else if(response.statusCode == "1")
            {
	       
	         document.getElementById("errorLogin").innerHTML="User Name already Exists.";
            }
            else 
            {
	          document.getElementById("errorLogin").innerHTML="Please try again later";
            }
	    }
});
     
}
else
{	
	document.getElementById("errorLogin").innerHTML="Please Enter Credentials.";
}
}

function login()
{

 var password = document.getElementById("password").value;
 var username = document.getElementById("username").value;

if(validateCredentials())

{
	
     document.getElementById("errorLogin").innerHTML="";
	
     
}
else
{
	
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