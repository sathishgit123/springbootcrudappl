package com.springbootapp.com.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapp.com.springbootcrud.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	

}
