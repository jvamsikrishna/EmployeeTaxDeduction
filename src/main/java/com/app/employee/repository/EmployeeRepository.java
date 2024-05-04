package com.app.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
