package com.springdemo;

public class BaseballCoach implements Coach{
	
	// define private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
	
	// init-method
	public void doMyStartUpStuff() {
		System.out.println("BaseBallCoach: inside method doMyStartUpStuff");
	}
	
	// destroy-method
	public void doMyCleanUpStuff() {
		System.out.println("BaseBallCoach: inside method doMyCleanUpStuff");
	}
}
