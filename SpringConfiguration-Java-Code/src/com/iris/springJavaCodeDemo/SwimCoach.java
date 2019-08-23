package com.iris.springJavaCodeDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

	private IFortuneService fortuneService;
	
		//refer the values from properties file
					//field level injection
	@Value("${name}")
	private String name;
	
	@Value("${email}")
	private String email;
	
	
	//construction injection
		public SwimCoach(IFortuneService fortuneService)
		{
			this.fortuneService=fortuneService;
		}
		
		@Override
		public String getDailyWorkout() {
			return "daily workout : do swim regularly";
		}

		@Override
		public String getDailyFortune() {
			return fortuneService.getFortune();
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		
		
		
}
