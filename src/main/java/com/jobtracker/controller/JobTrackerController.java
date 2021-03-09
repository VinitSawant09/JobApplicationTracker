package com.jobtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobtracker.service.JobTrackerLoginService;
import com.jobtracker.model.OutputVO;
import com.jobtracker.model.User;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
public class JobTrackerController {

	Logger logger = LogManager.getLogger(JobTrackerController.class);
	
	@Autowired
	JobTrackerLoginService objJobTrackerLoginService;
	
	@RequestMapping(value ="/register", method = RequestMethod.POST)
	
	public OutputVO register(@RequestBody User  objUser)
	{
		logger.info("Inside register method of class JobTrackerController ");
		
		OutputVO lOutputVO = new OutputVO();
       
        try
        {
	        String userId=objUser.getUsername();
	        
	        String password = objUser.getPassword();
	        
	        if(validatePassword(password) && validateUserName(userId))
	        { 
	        	logger.info("inside if");
	        	lOutputVO.setUser(objJobTrackerLoginService.saveUser(objUser));
	        	logger.info(lOutputVO.getUser().getPassword());
		        if(lOutputVO.getUser()!= null)
		        {
		        	lOutputVO.setStatus("Success creating new User.!!");
		        	lOutputVO.setStatusCode("0");
		        }
		        else
		        {
		        	lOutputVO.setStatus("User Name Already Exists/ Failure Creating User");
		        	lOutputVO.setStatusCode("1");
		        	
		        }
		    }
        }
        catch(Exception e)
        {
        	lOutputVO.setStatus("Failure Creating User");
        	lOutputVO.setStatusCode("1");
        }
        
        logger.info("End of registerUser method of JobTrackerController");
        return lOutputVO; 
		
		}
	
	
	 public boolean validateUserName(String userid)
	 {
		 if(userid==null || userid.equals(""))
		 {
			 return false;
		 }
		 return true;
	 }
	 
	 public boolean validatePassword(String pass)
	 {
		 if(pass==null || pass.equals(""))
		 {
			 return false;
		 }
		 return true;
	 }
	 
	
	
}
