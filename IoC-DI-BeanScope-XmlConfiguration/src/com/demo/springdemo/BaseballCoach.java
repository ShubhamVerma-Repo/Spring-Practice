package com.demo.springdemo;

public class BaseballCoach implements ICoach {

	private IFortuneService fortuneService;
	
	public BaseballCoach(){
		
	}
	
	
	//constructor injection using config file
	public BaseballCoach(IFortuneService theFortuneServce)
	{
		fortuneService=theFortuneServce;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use fortuneService to get a fortune
		//call the method of the happyfortuneservice class using the dependency injection 
		return fortuneService.getFortune();
	}
}
