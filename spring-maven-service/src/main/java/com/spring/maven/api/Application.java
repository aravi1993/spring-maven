package com.spring.maven.api;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.maven.data.Student;

public class Application {

	public String getMessage() {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration.xml");
		
		Student student = (Student) applicationContext.getBean("getName");
		return student.getName();
		
	}
}
