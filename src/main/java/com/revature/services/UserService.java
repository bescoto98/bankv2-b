package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.*;
import com.revature.repositories.*;


@Service
public class UserService {

	private IUserDAO userdao;
	private IInformationDAO infodao;
	
	@Autowired
	public UserService(IUserDAO userdao, IInformationDAO infodao) {
		super();
		this.userdao = userdao;
		this.infodao = infodao;
	}
	
	public User findByUserid(int userid) {
		Optional<User> u = userdao.findById(userid);
		
		if(u.isPresent()) {
			return u.get();
		}
		else {
			return null;
		}
	}
	
	public User findByUsername(String username) {
		User u = userdao.findByUsername(username);
		
		return u;
	}
	
	public User addUser(NewUserDTO newuser) {
		
		User u = new User(
					newuser.firstname, 
					newuser.lastname, 
					newuser.username, 
					newuser.password, 
					UserRole.valueOf(newuser.role.toUpperCase())
					);
		
		u = userdao.save(u);
		
		Information i = new Information(
				newuser.ssn, 
				newuser.address, 
				newuser.city, 
				newuser.state, 
				newuser.zip, 
				newuser.phone, 
				newuser.email,
				u
				);
		
		return u;
	}
	
	public User updateUser(User u) {
		
		return userdao.save(u);
	}
	
	public Information findByOwner(User owner) {
		
		// 
		
		Information i = infodao.findByOwner(owner);
		
		/** to protect a user's ssn this code
			turns 123456789 to
			***-**-6789
		**/
		StringBuilder sb = new StringBuilder("***-**-");
		
		sb.append(i.getSsn().substring(5));
		
		i.setSsn(sb.toString());
		
		return i;
	}
	
	public Information updateInfo(Information i) {
		
		
		return infodao.save(i);
	}
	
	public List<User> findByRole(UserRole role){
		
		List<User> users = userdao.findByRole(role);
		
		return users;
	}
	
	public List<User> findAll(){
		return userdao.findAll();
	}
	
}
