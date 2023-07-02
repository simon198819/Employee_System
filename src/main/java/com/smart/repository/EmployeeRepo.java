package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
