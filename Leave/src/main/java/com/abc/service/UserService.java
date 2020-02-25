/****************************************************
 * UserService.java
 *
 *	Date		Author					Remark
 *	20-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.service;

import com.abc.exception.AppException;
import com.abc.model.JwtAuthenticationResponse;
import com.abc.model.LoginRequest;
import com.abc.model.User;

/**
 * @author Hitesh Gupta
 *
 */
public interface UserService {
	
	User createUser(User user) throws AppException;
	
	JwtAuthenticationResponse login(LoginRequest login) throws AppException;

}
