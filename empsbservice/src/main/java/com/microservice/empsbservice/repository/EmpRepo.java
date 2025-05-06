package com.microservice.empsbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.empsbservice.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
