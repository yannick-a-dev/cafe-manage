package com.cafemanagement.cafemanagement.JWT;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.cafemanagement.cafemanagement.dao.UserRepo;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CustomerUsersDetailsService implements UserDetailsService{

	@Autowired
	UserRepo userRepo;
	
	private com.cafemanagement.cafemanagement.model.User userDetail;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("Inside loadUserByUsername {}", username);
		userDetail = userRepo.findByEmailId(username);
		if(!Objects.isNull(userDetail)) {
			return new User(userDetail.getEmail(), userDetail.getPassword(), new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("User not found");
		}
	}

	public com.cafemanagement.cafemanagement.model.User getUserDetail(){
		return userDetail;
	}
}
