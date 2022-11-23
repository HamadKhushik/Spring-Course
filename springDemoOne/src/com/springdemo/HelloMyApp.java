package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMyApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
