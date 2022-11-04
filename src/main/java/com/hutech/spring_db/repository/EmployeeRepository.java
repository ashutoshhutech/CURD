package com.hutech.spring_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.spring_db.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	
}
