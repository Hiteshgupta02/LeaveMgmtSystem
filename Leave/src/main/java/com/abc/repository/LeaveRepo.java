/****************************************************
 * LeaveRepo.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.LeaveEntity;

/**
 * @author Hitesh Gupta
 *
 */
@Repository
public interface LeaveRepo extends JpaRepository<LeaveEntity, Long>{
	
}
