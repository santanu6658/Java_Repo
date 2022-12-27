package com.springcore.auto.atwire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/atwire/autorewire.xml");

Emp emp1=context.getBean("emp1",Emp.class);
	System.out.println(emp1);
	((ConfigurableApplicationContext) context).close();
}
}
