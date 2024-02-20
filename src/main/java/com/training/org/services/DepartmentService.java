package com.training.org.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.org.entities.Department;
import com.training.org.repositories.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDept(Department department) {
		System.out.println("Inside saveDept");
		log.info("Inside saveDept");
		return departmentRepository.save(department);
	}

	public Department getDeptById(long departmentId) {
		System.out.println("Inside getDeptById" + departmentId);
		log.info("Inside getDeptById");
		return departmentRepository.findById(departmentId).get();
	}

}
