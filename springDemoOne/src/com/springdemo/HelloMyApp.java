package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMyApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());
		
		// close the context
		context.close();
	}

}
