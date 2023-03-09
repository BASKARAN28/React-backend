package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LeaveApp;

public interface LeaveRepository extends JpaRepository<LeaveApp,Integer>{

}
