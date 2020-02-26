
package com.abc.exception;
public class AppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4941324519531535016L;
	
	private Integer errorCode;
	
	private String errorDesc;
	
	/**
	 * Default Constructor
	 * @param errorCode
	 * @param errorDesc
	 */
	public AppException(Integer errorCode, String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	@Override
	public String toString() {
		return "AppException [errorCode=" + errorCode + ", errorDesc=" + errorDesc + "]";
	}
	
}
