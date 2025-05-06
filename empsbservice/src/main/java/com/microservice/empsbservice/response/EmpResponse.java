package com.microservice.empsbservice.response;

import com.vcube.address_service.response.AddressResponse;

public class EmpResponse {
	
	private int id;
	private String name;
	private String email;
	private String age;
	private int salary;
	 AddressResponse addressResponse;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getAge() {
	return age;
	}
	public void setAge(String age) {
	this.age = age;

}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public AddressResponse getAddressResponse() {
		return addressResponse;
		}
		public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
		}
		}
	

