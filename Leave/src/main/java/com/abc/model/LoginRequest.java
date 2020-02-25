/****************************************************
 * LoginRequest.java
 *
 *	Date		Author					Remark
 *	20-Feb-2020	Gurpreet Singh Saini	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.model;

import javax.validation.constraints.NotBlank;

/**
 * @author Gurpreet.Saini
 *
 */
public class LoginRequest {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
