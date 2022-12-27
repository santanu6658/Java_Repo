package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/config.xml");
	Person p=(Person) context.getBean("person");
	Addition add=(Addition) context.getBean("add");
	add.doSum();
	System.out.println(p);
	 ((ConfigurableApplicationContext) context).close();
	}

}
