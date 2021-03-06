package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.*;
import com.revature.repositories.IAccountDAO;

@Service
public class AccountService {

	private IAccountDAO accountdao;
	private UserService userservice;

	@Autowired
	public AccountService(IAccountDAO accountdao, UserService userservice) {
		super();
		this.accountdao = accountdao;
		this.userservice = userservice;
	}
	
	public Account addAccount(NewAccountDTO newacc) {
		
		Account a = new Account(
						newacc.balance,
						AccType.valueOf(newacc.type),
						AccStatus.PENDING,
						userservice.findByUserid(newacc.ownerid));
		
		return accountdao.save(a);
	}
	
	public Account updateAccount(Account a) {
		
		return accountdao.save(a);
	
	}
	
	public Account findByAccountid(int id) {
		Optional<Account> acc = accountdao.findById(id);
		
		if(acc.isPresent()) {
			return acc.get();
		}
		else {
			return null;
		}
	}
	
	public List<Account> findAll(){
		return accountdao.findAll();
	}
	
	public List<Account> findByApprovedby(String approvedby){
		
		return accountdao.findByApprovedby(approvedby);
		
	}
	
	public List<Account> findByOwner(User owner){
		return accountdao.findByOwner(owner);
	}
	
	
	
	public boolean transfer(int from, int to, double amount) {
		
		Optional<Account> accFrom = accountdao.findById(from);
		Optional<Account> accTo = accountdao.findById(to);
		
		
		Account aFrom = null;
		Account aTo = null;
		
		if(accFrom.isPresent() && accTo.isPresent()) {
			aFrom = accFrom.get();
			aTo = accTo.get();
		}
		else {
			return false;
		}
		
		if(aFrom.getBalance() >= amount) {
			
			aFrom.setBalance( aFrom.getBalance() - amount );
			aTo.setBalance(aTo.getBalance() + amount);
			
			
			// in theory this should be a transaction but y'know
			updateAccount(aFrom);
			updateAccount(aTo);
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean withdraw(int from, double amount) {
		
		Optional<Account> acc = accountdao.findById(from);
		
		Account a = null;
		if(acc.isPresent()) {
			a = acc.get();
		}
		else {
			return false;
		}
		
		if(a.getBalance() >= amount) {

			a.setBalance( a.getBalance() - amount );
			updateAccount(a);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean deposit(int to, double amount) {
		
		Optional<Account> acc = accountdao.findById(to);
		
		Account a = null;
		if(acc.isPresent()) {
			a = acc.get();
		}
		else {
			return false;
		}
		
		a.setBalance( a.getBalance() + amount );
		
		updateAccount(a);
		
		return true;
	}
	
}
