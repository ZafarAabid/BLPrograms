package com.bridgelabz.simpleDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee object = (Employee) context.getBean("emp");
		System.out.println(object.toString());
	}
}
