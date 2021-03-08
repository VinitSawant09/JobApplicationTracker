package com.jobtracker.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jobtracker.service.JobTrackerLoginService;

@Component
public class JobTrackerLoginDAO {

	
	
	Logger logger = LogManager.getLogger(JobTrackerLoginDAO.class);
	
	public boolean register()
	{
		logger.info("Inside register method of class JobTrackerLoginDAO ");
		boolean result = false;
		
		return result;
		}
}
