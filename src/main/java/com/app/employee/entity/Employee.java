package com.app.employee.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Employee Id must not be empty or null")
    private String employeeId;

    @NotBlank(message = "First name must not be empty or null")
    private String firstName;

    @NotBlank(message = "Last name must not be empty or null")
    private String lastName;

    @Email
    @NotBlank(message = "Email must not be empty or null")
    private String email;

    @NotNull(message = "Salary should not be null")
    private BigDecimal salary;

    @NotNull(message = "Date of Joining should not be null")
    private LocalDate doj;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PhoneNumber> phoneNumbers;
    
}
