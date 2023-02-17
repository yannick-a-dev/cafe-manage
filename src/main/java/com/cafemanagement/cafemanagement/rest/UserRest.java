package com.cafemanagement.cafemanagement.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafemanagement.cafemanagement.wrapper.UserWrapper;


@RequestMapping(path = "/user")
public interface UserRest {

	@PostMapping(path = "/signup")
	public ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap);
	
	@GetMapping(path = "/get")
	public ResponseEntity<List<UserWrapper>> getAllUser();
}
