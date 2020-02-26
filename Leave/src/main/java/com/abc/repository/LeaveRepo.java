package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.entity.LeaveEntity;

@Repository
public interface LeaveRepo extends JpaRepository<LeaveEntity, Long>{
	
}
