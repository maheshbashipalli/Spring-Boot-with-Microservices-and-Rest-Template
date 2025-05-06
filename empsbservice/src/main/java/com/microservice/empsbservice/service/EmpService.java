package com.microservice.empsbservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.empsbservice.entity.Employee;
import com.microservice.empsbservice.repository.EmpRepo;
import com.microservice.empsbservice.response.EmpResponse;
import com.vcube.address_service.response.AddressResponse;
@Service
public class EmpService {
	
	
	
	@Autowired
	private EmpRepo employeeRepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private RestTemplate restTemplate;
	public EmpResponse getEmployeeById(int eid) {
	Optional<Employee> employee = employeeRepo.findById(eid);
	EmpResponse employeeResponse = mapper.map(employee, EmpResponse.class);
	
	AddressResponse addressResponse =
			restTemplate.getForObject("http://localhost:8181/address/{id}", AddressResponse.class,eid);
			employeeResponse.setAddressResponse(addressResponse);
	return employeeResponse;
	}
	}


