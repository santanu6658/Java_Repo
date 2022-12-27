package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone.xml");
//Person name=	con.getBean("name1",Person.class);
//Person name1=	(Person)con.getBean("name2");
Person name2=(Person)con.getBean("name2");

//System.out.println(name);
//System.out.println(name1);
//System.out.println(name.getName().getClass().getName());

System.out.println("++++++++++++++++++++++++++++");
System.out.println(name2.getFeestructure());
System.out.println(name2.getName());
System.out.println(name2.getProperty());
((ConfigurableApplicationContext) con).close();

}
}
