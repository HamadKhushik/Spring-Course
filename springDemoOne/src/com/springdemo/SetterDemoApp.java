package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//Coach myCoach = context.getBean("myCricketCoach", Coach.class);
		CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		
		// close the context
		context.close();
	}

}
