package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;
import com.revature.models.UserRole;

public interface IUserDAO extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	List<User> findByRole(UserRole role);
}
