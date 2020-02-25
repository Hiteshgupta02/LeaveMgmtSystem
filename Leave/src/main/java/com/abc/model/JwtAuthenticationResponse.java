/****************************************************
 * JwtAuthenticationResponse.java
 *
 *	Date		Author					Remark
 *	20-Feb-2020	Gurpreet Singh Saini	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.model;

/**
 * @author Gurpreet.Saini
 *
 */
public class JwtAuthenticationResponse {
	
	private String accessToken;
    
	private String tokenType = "Bearer";
	
	public JwtAuthenticationResponse(String accessToken){
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

}
