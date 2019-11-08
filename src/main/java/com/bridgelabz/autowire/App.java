package com.bridgelabz.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start!");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee object = (Employee) context.getBean("empl");
		System.out.println(object.toString());
	}
}
