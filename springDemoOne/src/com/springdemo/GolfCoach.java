package com.springdemo;

public class GolfCoach implements Coach{

	private RandomFortuneService randomFortune;
	
	// constructor with DI
	public GolfCoach(RandomFortuneService randomFortune) {
		this.randomFortune = randomFortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Golf, Thats it";
	}

	@Override
	public String getFortune() {
		return randomFortune.getFortune();
	}


}
