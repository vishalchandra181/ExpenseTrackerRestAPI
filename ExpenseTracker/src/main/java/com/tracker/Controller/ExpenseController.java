package com.tracker.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.Entity.User;
import com.tracker.Service.UserService;

@RestController
@RequestMapping("/tracking")
public class ExpenseController {
	
	@Autowired
	UserService userService;
	
	//Post All User 
	@PostMapping("/createUser")
	public ResponseEntity<User> createHotel(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.setAll(user));
	}
	
	//Get User By Id With User All Expense
	@GetMapping("/{id}")
	public ResponseEntity<User> setAllTransaction(@PathVariable Integer id) {
	      return ResponseEntity.status(HttpStatus.CREATED).body(userService.getUserById(id));
    }
	 
    //Get All User with All Expense
	@GetMapping("/All")
	public ResponseEntity<List<User>> getAllTransaction() {
	      return ResponseEntity.status(HttpStatus.CREATED).body(userService.getAll());
	      }
}
