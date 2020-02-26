
package com.abc.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.abc.entity.UserEntity;
import com.abc.exception.AppException;
import com.abc.model.JwtAuthenticationResponse;
import com.abc.model.LoginRequest;
import com.abc.model.User;
import com.abc.repository.UserRepo;
import com.abc.security.JwtTokenProvider;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtTokenProvider tokenProvider;

	@Autowired
	PasswordEncoder passwordEncoder;

	
	@Override
	public User createUser(User user) throws AppException {
		Optional<UserEntity> userEntity = userRepo.findByUsername(user.getUsername());
		if (userEntity.isPresent()) {
			throw new AppException(100, "Username already exist");
		}
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);
		entity.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepo.save(entity);
		return user;
	}

	
	@Override
	public JwtAuthenticationResponse login(LoginRequest login) throws AppException {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = tokenProvider.generateToken(authentication);
		return new JwtAuthenticationResponse(jwt);
	}

}
