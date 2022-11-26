package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean form spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on it
		System.out.println(myCoach.getFortune());
		
		// close the container
		context.close();
	}

}
