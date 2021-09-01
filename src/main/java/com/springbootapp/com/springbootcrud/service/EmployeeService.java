package com.springbootapp.com.springbootcrud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapp.com.springbootcrud.model.Employee;
import com.springbootapp.com.springbootcrud.repository.EmployeeRepository;


@Service
public class EmployeeService 
{
	
	@Autowired
	private EmployeeRepository emprep;
	public Employee addEmployee(Employee emp)
	{
		return emprep.save(emp);
		
	}
	
	public Optional<Employee> getEmployeebyid(int id)
	{
	   Optional<Employee> emp=null;
	
		return emp=emprep.findById(id);
		
			
		
	}
	
	public void updateEmployee(Employee emp)
	{
		emprep.save(emp);
	}
	
	public void deleteEmployee(int id)
	{
		emprep.deleteById(id);
	}
	
	public List<Employee> getallEmployees()
	{
		List<Employee> emplist=emprep.findAll();
		return emplist;
		
	}
	
	

}
