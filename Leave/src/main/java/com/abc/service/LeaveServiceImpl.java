package com.abc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.entity.LeaveEntity;
import com.abc.exception.AppException;
import com.abc.model.Leave;
import com.abc.repository.LeaveRepo;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	LeaveRepo leaveRepo;

	
	@Override
	public List<Leave> findAllLeaves() throws AppException {
		List<Leave> leaves = new ArrayList<>();
		List<LeaveEntity> leaveEntities = leaveRepo.findAll();
		leaveEntities.forEach(leave -> {
			Leave l = new Leave();
			BeanUtils.copyProperties(leave, l);
			leaves.add(l);
		});
		return leaves;
	}

	@Override
	public Leave findLeaveById(Long id) throws AppException {
		Optional<LeaveEntity> leaveEntity = leaveRepo.findById(id);
		if (leaveEntity.isPresent()) {
			Leave leave = new Leave();
			BeanUtils.copyProperties(leaveEntity.get(), leave);
			return leave;
		} else {
			throw new AppException(11, "No such leave");
		}
	}

	
	@Override
	public Leave addLeave(Leave leave) throws AppException {
		LeaveEntity leaveEntity = new LeaveEntity();
		BeanUtils.copyProperties(leave, leaveEntity);
		leaveEntity = leaveRepo.save(leaveEntity);
		leave.setId(leaveEntity.getId());
		return leave;
	}

	
	@Override
	public Leave updateLeave(Long Id, Leave leave) throws AppException {
		LeaveEntity leaveEntity = leaveRepo.getOne(Id);
		String ignore[] = { "id" };
		if (leaveEntity != null) {
			BeanUtils.copyProperties(leave, leaveEntity, ignore);
			leaveRepo.save(leaveEntity);
		} else {
			throw new AppException(11, "No such leave");
		}
		return leave;
	}

	
	@Override
	public Boolean deleteLeave(Long Id) throws AppException {
		LeaveEntity leaveEntity = leaveRepo.getOne(Id);
		if (leaveEntity == null) {
			throw new AppException(11, "No such leave");
		}
		leaveRepo.deleteById(Id);
		return true;
	}

}
