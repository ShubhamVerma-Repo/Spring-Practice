package com.iris.springdemo;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	//constructor injection using config file
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		//call the method of the happyfortuneservice class using the dependency injection
		return fortuneService.getFortune();
	}
}