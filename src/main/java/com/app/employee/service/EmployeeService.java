package com.app.employee.service;

import java.util.List;

import com.app.employee.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

}
