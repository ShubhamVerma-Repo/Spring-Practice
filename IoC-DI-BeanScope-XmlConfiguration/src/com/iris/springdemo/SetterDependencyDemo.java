package com.iris.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependencyDemo {

	public static void main(String[] args) {

		//load the configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from container
		CricketCoach cricCoach=context.getBean("cricketCoach",CricketCoach.class);		//here CricketCoach is used instead of ICoach interface
																					//because if its ICoach then you have access to only two methods
																				//i.e., getDailyFortune and getDailyWorkout
																			//so we use CricketCoach object to get beans so that we have access to
																		//all the methods including ICoach and CricketCoach both
		
		//call methods on the beans
		System.out.println("\ndaily workout for cricketcoach : "+cricCoach.getDailyWorkout());
		
		
		//----------------- 	SETTER DEPENDENCY INJECTION is used here to call the method of the happyfortuneService class	--------------
		
		System.out.println("\ndaily fortune for criketcoach using setter dependency : "+cricCoach.getDailyFortune());
		
		
		//-----------------------------		LITERAL VALUE INJECTION		-------------------------------------
		/*
		System.out.println("\nemail address using LITERAL INJECTION : "+cricCoach.getEmailAdd());
		System.out.println("\nteam name using LITERAL INJECTION : "+cricCoach.getTeam());
		*/
		
		
		//-----------------------------		injecting values using PROPERTIES FILE	-------------------------------------

		System.out.println("\nemail address value using PROPERTIES FILE INJECTION : " + cricCoach.getEmailAdd());
		System.out.println("\nteam name value using PROPERTIES FILE INJECTION : " + cricCoach.getTeam());
		
		
		//close the context
		context.close();
	}

}
