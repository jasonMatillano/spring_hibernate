package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 min in batting practice";
	}
}
