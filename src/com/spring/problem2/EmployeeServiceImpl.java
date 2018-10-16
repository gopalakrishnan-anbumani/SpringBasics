package com.spring.problem2;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void checkStatus(Employee employee) {
		if(employee.getRole() =="Manager" || employee.getRole() == "GM"){
			System.out.println(employee.getFirstName() +" is Not Eligible for Loan");
		}else{
			System.out.println(employee.getFirstName() +" is Eligible for Loan");
		}
		
	}

}
