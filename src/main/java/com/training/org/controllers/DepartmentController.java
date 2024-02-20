package com.training.org.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.org.entities.Department;
import com.training.org.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department ) {
		log.info("inside saveDepartment");
		return departmentService.saveDept(department);
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentByDeptId(@PathVariable("id") long departmentId ) {
		System.out.println("inside getDepartmentByDeptId" + departmentId);
		log.info("inside getDepartmentByDeptId" + departmentId);
		return departmentService.getDeptById(departmentId);
	}
}
