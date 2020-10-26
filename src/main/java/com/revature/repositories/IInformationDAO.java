package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Information;
import com.revature.models.User;

public interface IInformationDAO extends JpaRepository<Information, Integer> {

	Information findByOwner(User owner);
}
