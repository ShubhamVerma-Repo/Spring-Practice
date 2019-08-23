package com.iris.springdemo;

public class CricketCoach implements ICoach {

	private IFortuneService fortuneService;

	
	//---------------------------------		literal value injection 	-------------------------------------

	private String emailAdd;
	private String team;

	// literal value injection

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("you are in the no-arg constructor");
	}
	
	
	
	//------------------	injecting values using PROPERTIES FILE-------------------------------
	
	
	
	

	//-----------------------------		setter injection 	-----------------------------------------

	// setter injection
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("you are in the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
