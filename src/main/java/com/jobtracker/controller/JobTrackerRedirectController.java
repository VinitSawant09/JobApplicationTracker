package com.jobtracker.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class JobTrackerRedirectController {

	Logger logger = LogManager.getLogger(JobTrackerController.class);
	
	@RequestMapping(value="/",method = RequestMethod.GET)

	public String landing()
	{
		logger.info("Redirecting to Login Page.");
		
		return "home";
		}
	
	@RequestMapping(value="/signup",method = RequestMethod.GET)

	public String redirectToSignup()
	{
		logger.info("Redirecting to Signup Page.");
		
		return "signup";
		}
}
