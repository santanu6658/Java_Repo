package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= 
				new AnnotationConfigApplicationContext(javaConfig.class);
		Student student=context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.studey();
		((ConfigurableApplicationContext) context).close();
	}

}
