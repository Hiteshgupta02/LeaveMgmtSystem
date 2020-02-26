package com.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.exception.AppException;
import com.abc.model.Leave;
import com.abc.service.LeaveService;


@RestController
@RequestMapping(value = "/api/v1.0/leave")
public class LeaveController {

	@Autowired
	LeaveService leaveService;

	@GetMapping
	public ResponseEntity<List<Leave>> getLeaves() throws AppException {
		List<Leave> leaves = leaveService.findAllLeaves();
		return new ResponseEntity<List<Leave>>(leaves, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Leave> getLeave(@PathVariable(name = "id") Long id) throws AppException 
	{
		Leave leave = leaveService.findLeaveById(id);
		return new ResponseEntity<Leave>(leave, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Leave> addLeave(@RequestBody(required = true) Leave leave) throws AppException 
	{
		Leave leaveRes = leaveService.addLeave(leave);
		return new ResponseEntity<Leave>(leaveRes, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Leave> addLeave(@PathVariable(name = "id") Long Id, @RequestBody(required = true) Leave leave)
			throws AppException {
		Leave leaveRes = leaveService.updateLeave(Id, leave);
		return new ResponseEntity<Leave>(leaveRes, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteLeave(@PathVariable(name = "id") Long Id) throws AppException 
	{
		Boolean res = leaveService.deleteLeave(Id);
		if (res) {
			return new ResponseEntity<>("Success", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Failure", HttpStatus.OK);
		}
	}

}
