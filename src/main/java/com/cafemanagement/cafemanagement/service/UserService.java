package com.cafemanagement.cafemanagement.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.cafemanagement.cafemanagement.wrapper.UserWrapper;

public interface UserService {

	ResponseEntity<String> signUp(Map<String, String> requestMap);

	ResponseEntity<List<UserWrapper>> getAllUser();

}
