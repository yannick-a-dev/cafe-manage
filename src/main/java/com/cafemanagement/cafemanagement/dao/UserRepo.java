package com.cafemanagement.cafemanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cafemanagement.cafemanagement.model.User;
import com.cafemanagement.cafemanagement.wrapper.UserWrapper;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByEmailId(@Param("email") String email);
	
	List<UserWrapper> getAllUser();
}
