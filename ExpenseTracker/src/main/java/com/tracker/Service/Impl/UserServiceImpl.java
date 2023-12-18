package com.tracker.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.Entity.User;
import com.tracker.Repository.UserRepository;
import com.tracker.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	//Set All User 
	@Override
	public User setAll(User user) {
		return userRepository.save(user);
	}
    
	//Get All User ById With All Expense
	@Override
	public User getUserById(Integer id) {
	          return userRepository.findById(id).orElseThrow();
	}
	
	//Track all Expense 
	@Override
	public List<User> getAll() {
		return (List<User>) userRepository.findAll();
	}

}
