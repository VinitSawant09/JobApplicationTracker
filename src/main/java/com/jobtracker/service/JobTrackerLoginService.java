package com.jobtracker.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jobtracker.dao.JobTrackerLoginDAO;

@Component
public class JobTrackerLoginService {

	Logger logger = LogManager.getLogger(JobTrackerLoginService.class);
	
	@Autowired
	JobTrackerLoginDAO objJobTrackerLoginDAO;
	
	public boolean register()
	{
		logger.info("Inside register method of class JobTrackerLoginService ");
		boolean result = false;
		
		return result;
		}
}
