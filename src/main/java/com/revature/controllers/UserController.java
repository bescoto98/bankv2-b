package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.*;
import com.revature.services.*;

@RestController
@CrossOrigin
@RequestMapping(value="/user")
public class UserController {

	private UserService userservice;

	@Autowired
	public UserController(UserService userservice) {
		super();
		this.userservice = userservice;
	}
	
	@GetMapping(value="/{userid}")
	public ResponseEntity<User> getUserByUserid(@PathVariable("userid")int userid){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.findByUserid(userid));
	}
	
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User u){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.updateUser(u));
		
	}
	
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody NewUserDTO newuser){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.addUser(newuser));
	
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.findAll());
		
	}
	
	@GetMapping(value="/customer")
	public ResponseEntity<List<User>> getAllCustomers(){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.findByRole(UserRole.CUSTOMER));
		
	}
	
	@GetMapping(value="/employee")
	public ResponseEntity<List<User>> getAllEmployees() {
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.findByRole(UserRole.EMPLOYEE));
		
	}
	
	@GetMapping(value="/info/{userid}")
	public ResponseEntity<Information> getUserInfo(@PathVariable("userid")int userid){
		
		User owner = userservice.findByUserid(userid);
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.findByOwner(owner));
		
	}
	
	@PutMapping(value="/info")
	public ResponseEntity<Information> updateInformation(@RequestBody Information i){
		
		return ResponseEntity.status(HttpStatus.OK).body(userservice.updateInfo(i));
	
	}
	
	
}
