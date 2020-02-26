
package com.abc.service;

import com.abc.exception.AppException;
import com.abc.model.JwtAuthenticationResponse;
import com.abc.model.LoginRequest;
import com.abc.model.User;

public interface UserService {
	
	User createUser(User user) throws AppException;
	
	JwtAuthenticationResponse login(LoginRequest login) throws AppException;

}
