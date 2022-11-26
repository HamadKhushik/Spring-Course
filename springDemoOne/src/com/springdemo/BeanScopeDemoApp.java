package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean form spring container
		RandomFortuneService myCoach = context.getBean("myRandomFortune", RandomFortuneService.class);
		
		RandomFortuneService alphaCoach = context.getBean("myRandomFortune", RandomFortuneService.class);
		
		// check if they are same beans
		boolean same = (myCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + same);
		
		System.out.println("\nMemory address of the myCoach is: " + myCoach);
		
		System.out.println("\nMemory address of the alphaCoach is: " + alphaCoach);
		
		// close the container
		context.close();
	}

}
