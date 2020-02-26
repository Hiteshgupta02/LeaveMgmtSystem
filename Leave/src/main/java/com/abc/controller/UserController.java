package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.exception.AppException;
import com.abc.model.JwtAuthenticationResponse;
import com.abc.model.LoginRequest;
import com.abc.model.User;
import com.abc.service.UserService;


@RestController
@RequestMapping("/api/v1.0/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/signup")
	public ResponseEntity<User> signUp(@RequestBody User user) throws AppException {
		userService.createUser(user);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	@PostMapping("/signin")
	public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody LoginRequest loginRequest)
			throws AppException {
		JwtAuthenticationResponse jwtRes = userService.login(loginRequest);
		return new ResponseEntity<JwtAuthenticationResponse>(jwtRes, HttpStatus.OK);
	}
}
