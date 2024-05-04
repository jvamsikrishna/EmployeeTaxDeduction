package com.app.employee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.dto.TaxDeductionDTO;
import com.app.employee.entity.Employee;
import com.app.employee.service.EmployeeService;

@RestController
@Validated	
public class EmployeeController {

	@Autowired
    private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
	
	@GetMapping("/taxDeduction")
    public ResponseEntity<List<TaxDeductionDTO>> getTaxDeductions() {
        List<Employee> employees = employeeService.getAllEmployees();
        List<TaxDeductionDTO> taxDeductions = new ArrayList<>();
        for (Employee employee : employees) {
            TaxDeductionDTO taxDeduction = calculateTaxDeduction(employee);
            taxDeductions.add(taxDeduction);
        }
        return ResponseEntity.ok(taxDeductions);
    }

	private TaxDeductionDTO calculateTaxDeduction(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
