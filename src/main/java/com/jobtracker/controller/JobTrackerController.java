package com.jobtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobtracker.service.JobTrackerLoginService;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
@Controller
public class JobTrackerController {

	Logger logger = LogManager.getLogger(JobTrackerController.class);
	
	@Autowired
	JobTrackerLoginService objJobTrackerLoginService;
	
	
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
	
	@RequestMapping(value="/register",method = RequestMethod.GET)

	public String register()
	{
		logger.info("Inside register method of class JobTrackerController ");
		
		return "signup";
		}
	
	
}
