package com.training.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.org.entities.Department;

@Repository
public interface  DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(long departmentId);
}
