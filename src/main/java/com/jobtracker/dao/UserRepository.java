package com.jobtracker.dao;

import org.springframework.stereotype.Repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.jobtracker.model.User;
@Repository
public interface UserRepository extends CrudRepository<User,Serializable> 
{

	
	
}
