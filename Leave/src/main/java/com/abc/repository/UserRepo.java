
package com.abc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.entity.UserEntity;


public interface UserRepo extends JpaRepository<UserEntity, Long>{

	/**
	 * @param username
	 * @return
	 */
	Optional<UserEntity> findByUsername(String username);

}
