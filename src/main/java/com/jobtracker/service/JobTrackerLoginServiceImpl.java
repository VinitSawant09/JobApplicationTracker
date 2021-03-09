package com.jobtracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobtracker.dao.UserRepository;

import com.jobtracker.model.User;
@Service("jobTrackerLoginServiceImpl")
public class JobTrackerLoginServiceImpl implements JobTrackerLoginService {

	@Autowired
	UserRepository objUserRepository;

	@Transactional
	public User saveUser(User user) {
		User objUser = objUserRepository.save(user);
		return objUser;
	}

}
