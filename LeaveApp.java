package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LeaveApp {
	@Id
	private int Rollnumber;
	private String Name;
	private String Department;
	private String Year;
	private String Email;
	public LeaveApp(int rollnumber, String name, String department, String year,String email) {
		super();
		Rollnumber = rollnumber;
		Name = name;
		Department = department;
		Year = year;
		Email=email;
	}
	public LeaveApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollnumber() {
		return Rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
