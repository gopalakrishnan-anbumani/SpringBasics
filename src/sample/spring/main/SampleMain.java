package sample.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sample.spring.beans.DisplayBean;

public class SampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Resource resource = new ClassPathResource("config.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		beanFactory.getBean("bean");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DisplayBean bean =  (DisplayBean) context.getBean("bean");
		bean.display();

	}

}
