package com.microservice.empsbservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
@Entity
@Table(name = "employee2")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;
@Column(name = "name")
private String name;
@Column(name = "email")
private String email;
@Column(name = "age")
private String age;
@Column(name="salary")
private int salary;


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

}
	
	


