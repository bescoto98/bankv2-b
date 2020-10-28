//package com.revature.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.revature.models.*;
//import com.revature.services.*;
//
//@RestController
//@CrossOrigin
//@RequestMapping(value="/home")
//public class StartUpController {
//	
//	private UserService userservice;
//	private AccountService accservice;
//	
//	@Autowired
//	public StartUpController(UserService userservice, AccountService accservice) {
//		super();
//		this.userservice = userservice;
//		this.accservice = accservice;
//	}
//	
//	@GetMapping
//	public ResponseEntity<Boolean> loadValues(){
//		
//		
//		return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
//	}
//	
//
//}
