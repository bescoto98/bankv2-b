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
@RequestMapping(value="/account")
public class AccountController {
	
	private AccountService accservice;
	private UserService userservice;
	
	@Autowired
	public AccountController(AccountService accservice, UserService userservice) {
		super();
		this.accservice = accservice;
		this.userservice = userservice;
	}
	
	
	@GetMapping
	public ResponseEntity<List<Account>> getAllAccounts(){
		
		return ResponseEntity.status(HttpStatus.OK).body(accservice.findAll());
		
	}
	
	@GetMapping(value="/{userid}")
	public ResponseEntity<List<Account>> getCustomersAccounts(@PathVariable("userid")int userid){
		
		User owner = userservice.findByUserid(userid);
		
		return ResponseEntity.status(HttpStatus.OK).body(accservice.findByOwner(owner));
		
	}
	
	@PostMapping
	public ResponseEntity<Account> addAccount(@RequestBody NewAccountDTO newacc){
		
		return ResponseEntity.status(HttpStatus.OK).body(accservice.addAccount(newacc));
		
	}
	
	@PutMapping(value="/transaction")
	public ResponseEntity<Boolean> accountTransaction(@RequestBody TransactionDTO todo){
		
		switch(TransactionType.valueOf(todo.transtype.toUpperCase())) {
		
			case WITHDRAW:
				accservice.withdraw(todo.fromAccount, todo.amount);
				break;
			case DEPOSIT:
				accservice.deposit(todo.toAccount, todo.amount);
				break;
			case TRANSFER:
				accservice.transfer(todo.fromAccount, todo.toAccount, todo.amount);
				break;
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
		
	}
	
	
	

}
