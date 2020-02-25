/****************************************************
 * LeaveService.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.service;

import java.util.List;

import com.abc.exception.AppException;
import com.abc.model.Leave;

/**
 * @author Hitesh Gupta
 *
 */
public interface LeaveService {
	
	List<Leave> findAllLeaves() throws AppException;
	
	Leave findLeaveById(Long Id) throws AppException;
	
	Leave addLeave(Leave leave) throws AppException;
	
	Leave updateLeave(Long Id, Leave leave) throws AppException;
	
	Boolean deleteLeave(Long Id) throws AppException;
	
}
