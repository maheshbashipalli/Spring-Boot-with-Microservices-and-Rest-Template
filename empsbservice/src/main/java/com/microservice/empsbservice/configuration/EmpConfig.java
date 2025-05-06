package com.microservice.empsbservice.configuration;

import org.modelmapper.ModelMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.microservice.empsbservice.service.EmpService;

@Configuration
public class EmpConfig {

//	@Bean
//	public EmpService employeeBean() {
//	return new EmpService();
//	}
	@Bean
	public ModelMapper modelMapperBean() {
	return new ModelMapper();
	}
	@Bean
	public RestTemplate restTemplateBean() {
	return new RestTemplate();
	}
	
	}
	
	
	
	

