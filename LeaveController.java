package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LeaveApp;
import com.example.demo.repository.LeaveRepository;
import com.example.demo.service.LeaveService;


@RestController
@CrossOrigin
public class LeaveController {
	@Autowired
	LeaveRepository LeaveAppRepository;
	@Autowired
	LeaveService service;
	@GetMapping("/get")
	List<com.example.demo.model.LeaveApp> getList(){
		return LeaveAppRepository.findAll();
	}
	@PostMapping("/post")
	public LeaveApp create(@RequestBody LeaveApp obj) {
		return LeaveAppRepository.save(obj);
	}
	
	@DeleteMapping("/del/{roll}")
	public String delete(@PathVariable int roll) {
		return service.deleteDetails(roll);
    }
    @PutMapping("/put/{id}")
    public String putD(@PathVariable int id,@RequestBody LeaveApp x) {
    	return service.update(id, x);
    }
}