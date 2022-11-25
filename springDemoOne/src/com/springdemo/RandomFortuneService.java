package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{


	// create a String array for random fortunes
	private String[] data = {	"Beware of the wolf in sheep's clothing",
								"Diligence is the mother of good luck",
								"The journey is the reward"};
	
	
	@Override
	public String getFortune() {
		
		Random rand = new Random();
		int index = rand.nextInt(data.length);
		return data[index];
	}

}
