package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpingApp {

	public static void main(String[] args) {
		
		// load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean
		Coach myCoach = context.getBean("myGolfCoach", GolfCoach.class);
		
		// call methods on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
	}

}
