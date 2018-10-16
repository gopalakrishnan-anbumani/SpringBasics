package com.spring.springex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Example 1
//		ReportService reportService = (ReportService) context.getBean("reportService");
//		reportService.display();
		
		// Example 2
//		ReportService reportService1 = (ReportService) context.getBean(ReportService.class);
//		reportService1.display();
		
		//Example 3
//		ReportService reportService1 = (ReportService) context.getBean("reportService1");
//		reportService1.display();

		//Example 4
		ReportService reportService1 = (ReportService) context.getBean("reportService1",ReportService.class);
		reportService1.display();
		

	}

}
