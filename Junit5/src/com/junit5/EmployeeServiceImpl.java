package com.junit5;

import org.junit.jupiter.api.Test;

@Runwith(value= {MockitoExtension.class})
public class EmployeeServiceImpl  {
	@Mock
	private EmployeeServiceImpl employeeService;
	
	@Test
	public void testFetchEmployeeById() {
		System.out.println(employeeService.hashCode());
		EmployeeServiceImpl employeeServiceImpl= employeeService.fetchEmployeeById(2);
		System.out.println(employeeServiceImpl);
	}

}
//RunEmployeeServiceTest