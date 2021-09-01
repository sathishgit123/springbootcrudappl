package com.springbootapp.com.springbootcrud.junit;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootapp.com.springbootcrud.controller.EmployeeController;
import com.springbootapp.com.springbootcrud.model.Employee;
import com.springbootapp.com.springbootcrud.service.EmployeeService;

@WebMvcTest(value=EmployeeController.class)
public class TestEmployeeController
{
	/*@MockBean
	private EmployeeService empser;
	
	@Autowired
	private MockMvc mockmvc;
	@Test
	public void TestsaveEmployee() throws Exception
	{
		Employee employee=new Employee();
		employee.setEid(220);
		employee.setEname("payal");
		employee.setEsal(5000.0);
		employee.setEaddr("hyd");
		employee.setEemail("payal@gmail.com");
	employee.setDateofjoing("2021-06-09");
		
		when(empser.addEmployee(employee)).thenReturn(employee);
		
		ObjectMapper mapper=new ObjectMapper();
		String empjson=mapper.writeValueAsString(employee);
		MockHttpServletRequestBuilder reqbilder=MockMvcRequestBuilders.post("/addemployee").contentType(MediaType.APPLICATION_JSON).content(empjson);
		MockHttpServletResponse response = mockmvc.perform(reqbilder).andReturn().getResponse();
		System.out.println(response);
	                         // ResultActions action;
							//action.andReturn();
	                           //MockHttpServletResponse response=results.getResponse();
	                         // int status= response.getStatus();
	                          assertEquals(201,response);*/
	                         
		
		
		
		
		
	}
	
	
	
	
	
	

}
