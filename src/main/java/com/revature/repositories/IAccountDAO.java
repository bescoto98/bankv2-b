package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.AccStatus;
import com.revature.models.Account;
import com.revature.models.User;

public interface IAccountDAO extends JpaRepository<Account, Integer> {

	List<Account> findByApprovedby(String approvedby);
	List<Account> findByOwner(User owner);
	List<Account> findByStatus(AccStatus status);
}