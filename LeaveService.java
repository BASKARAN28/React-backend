package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.LeaveApp;
import com.example.demo.repository.LeaveRepository;

@Service
public class LeaveService {
	@Autowired
    LeaveRepository repository;
	public  String deleteDetails(Integer id)
	{
		if(repository.existsById(id))
		{repository.deleteById(id);
		return "deleted";
		}
		else {
			return "roll_no not found";
		}
	}
	public String update(int id,LeaveApp x)	{
		if(repository.existsById(id)) {
			LeaveApp temp=repository.getReferenceById(id);
			temp.setRollnumber(id);
			temp.setName(x.getName());
			temp.setDepartment(x.getDepartment());
			temp.setYear(x.getYear());
			temp.setEmail(x.getEmail());
			repository.save(temp);
			return"updated";
		}
		return "";
	}
}
