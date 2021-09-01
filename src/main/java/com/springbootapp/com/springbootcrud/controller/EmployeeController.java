package com.springbootapp.com.springbootcrud.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.com.springbootcrud.customexception.ResourceNotFoundException;
import com.springbootapp.com.springbootcrud.model.Employee;
import com.springbootapp.com.springbootcrud.repository.EmployeeRepository;
import com.springbootapp.com.springbootcrud.service.EmployeeService;
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/wish")
	public String wish()
	{
		return "welcome to spring boot";
	}
	@PostMapping(path="/addemployee")
	public  ResponseEntity<Employee> saveEmployee(@Valid @RequestBody  Employee employee)
	{
		try
		{
		Employee emp=empservice.addEmployee(employee);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
		
		}
		catch(Exception ex)
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(path="/getemployee/{id}")
	public  ResponseEntity<Employee> getEmployeeByid(@PathVariable int id)
	{
		Employee employee=empservice.getEmployeebyid(id)
				.orElseThrow(()->new ResourceNotFoundException("Employee is not Avilable with this contoller in cd ID"+id));
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	
			
		}
	@PutMapping(path="/updateemployee/{id}")
	public  ResponseEntity<Employee> updateEmployee(@Valid @PathVariable int id, @RequestBody Employee updtemployee)
	{
		Optional<Employee> employee=empservice.getEmployeebyid(id);
		if(employee.isPresent())
		{
			updtemployee.setEid(id);
			empservice.updateEmployee(updtemployee);
			
			return new ResponseEntity<Employee>(HttpStatus.OK);
			
		
		}
		else
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
			
		}
	@DeleteMapping(path="/deleteemployee/{id}")
	public  ResponseEntity<Employee> delete(@PathVariable int id)
	{
		Optional<Employee> employee=empservice.getEmployeebyid(id);
		if(employee.isPresent())
		{
			empservice.deleteEmployee(id);
			return new ResponseEntity<Employee>(HttpStatus.OK);
			
			
		
		
		}
		else
		{
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
			
	}
	@GetMapping(path="/getallemployees")
	public  ResponseEntity<List<Employee>> getAllEmployees()
	{
		
	
		List<Employee>listofemps=empservice.getallEmployees();
		if(listofemps.isEmpty())
		{
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
			
		}
		else
		{
			
			return new ResponseEntity<List<Employee>>(listofemps,HttpStatus.OK);
			
		}
			
		}

	

}
