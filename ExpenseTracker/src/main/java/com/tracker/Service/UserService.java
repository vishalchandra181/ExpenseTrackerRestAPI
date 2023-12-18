package com.tracker.Service;

import java.util.List;

import com.tracker.Entity.User;

public interface UserService {
	
	public User setAll(User user);
	
	public User getUserById(Integer id);
	
	public List<User> getAll();

}
