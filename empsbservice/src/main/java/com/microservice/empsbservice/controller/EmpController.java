package com.microservice.empsbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.empsbservice.response.EmpResponse;
import com.microservice.empsbservice.service.EmpService;

@RestController
@RequestMapping("/api/v1")
public class EmpController {

	@Autowired
	private EmpService employeeService;

	@GetMapping("/employees/{eid}")
	private ResponseEntity<EmpResponse> getEmployeeDetails(@PathVariable("eid") int eid) {
		EmpResponse employee = employeeService.getEmployeeById(eid);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
}
