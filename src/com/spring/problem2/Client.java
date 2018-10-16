package com.spring.problem2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee employee1 = (Employee)context.getBean("employee1");
		EmployeeService employeeService = (EmployeeServiceImpl) context.getBean("employeeService");
		employeeService.checkStatus(employee1);
	}

}
