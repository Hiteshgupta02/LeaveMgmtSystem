/****************************************************
 * UserRepo.java
 *
 *	Date		Author					Remark
 *	19-Feb-2020	Hitesh Gupta	Initial Version
 *
 *
 *  © 2019
 ***************************************************/
package com.abc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.entity.UserEntity;

/**
 * @author Hitesh Gupta
 *
 */
public interface UserRepo extends JpaRepository<UserEntity, Long>{

	/**
	 * @param username
	 * @return
	 */
	Optional<UserEntity> findByUsername(String username);

}
