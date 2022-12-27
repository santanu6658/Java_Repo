/**
 * 
 */
package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HP
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println();
		B temp2=(B)context.getBean("bref");
		System.out.println(temp2.getY());
		
		 ((ConfigurableApplicationContext) context).close();
		
	}

}
