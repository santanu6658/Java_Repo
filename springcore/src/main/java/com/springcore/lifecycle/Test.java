package com.springcore.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

            AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	Samosa a=(Samosa) context.getBean("s1");
	System.out.println(a);
	 
	context.registerShutdownHook();
	 System.out.println("******************************************");
	 
	 Pepsi p1=(Pepsi) context.getBean("s2");
	 System.out.println(p1);
	 context.registerShutdownHook();
	
	((ConfigurableApplicationContext) context).close();
	 
	
	}

}
