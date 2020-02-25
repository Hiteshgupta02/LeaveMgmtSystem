/****************************************************
 * JwtAuthenticationResponse.java
 *
 *	Date		Author					Remark
 *	20-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.model;

/**
 * @author Hitesh Gupta
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
