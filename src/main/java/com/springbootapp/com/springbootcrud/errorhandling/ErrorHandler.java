package com.springbootapp.com.springbootcrud.errorhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.springbootapp.com.springbootcrud.Error.Errors;
import com.springbootapp.com.springbootcrud.customexception.ResourceNotFoundException;


@ControllerAdvice
public class ErrorHandler
{
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Errors> employeefiledvalidator(MethodArgumentNotValidException exception)
	{
		Errors error=new Errors(1,"datavalidationexception",exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<Errors>(error,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> employeenotFound(ResourceNotFoundException exception)
	{
		Errors error=new Errors(2, "EmloyeeNotFoundException",exception.getMessage());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
		
		
		
	
	
	

}
}
