package com.jobtracker.service;


import org.springframework.stereotype.Component;



import com.jobtracker.model.User;

@Component
public interface JobTrackerLoginService {

	public User saveUser(User user);
	
	
}
