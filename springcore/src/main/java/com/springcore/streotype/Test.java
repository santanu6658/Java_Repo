package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=
				new ClassPathXmlApplicationContext("com/springcore/streotype/config.xml");
Student student=	con.getBean("ob",Student.class);
System.out.println(student);
System.out.println(student.getPhoneNo());


System.out.println(student.getPhoneNo().getClass().getName());


System.out.println(student.hashCode() );
((ConfigurableApplicationContext) con).close();
	}

}
