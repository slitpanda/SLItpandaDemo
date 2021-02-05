package com.itpanda.tution.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itpanda.tution.entities.User;
import com.itpanda.tution.repositories.UserRepository;
import com.itpanda.tution.services.MainServices;

@Service
public class MainServicesImpl implements MainServices{

	
	@Autowired
	UserRepository userRepository; 
	@Override
	public List<User> getAllUsersFromDB() {
		
		//fetch all users from user table through user repository
		List<User> userList=userRepository.findAll();
		
		return userList;
	}

}
