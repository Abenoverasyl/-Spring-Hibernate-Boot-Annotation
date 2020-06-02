package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley!";
	}
}