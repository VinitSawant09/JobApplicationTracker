package com.jobtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JobTrackerController {

	@RequestMapping(value="/",method = RequestMethod.GET)

	public String landing()
	{
		
		return "home";
		}
	
	@RequestMapping(value="/signup",method = RequestMethod.GET)

	public String redirectToSignup()
	{
		System.out.println("Redirecting to Signup Page.");
		
		return "signup";
		}
	
	
}
