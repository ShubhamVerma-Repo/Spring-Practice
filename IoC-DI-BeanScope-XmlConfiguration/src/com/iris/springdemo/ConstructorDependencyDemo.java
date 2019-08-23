package com.iris.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDependencyDemo {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		ICoach coach=context.getBean("myCoach", ICoach.class);	//baseball class	//here ICoach interface is used to get bean
																				//because ICoach have the below listed method and common for all 
																			//classes who so ever implement the ICoach interface
		
		ICoach coach1=context.getBean("myCoach1", ICoach.class);	//track class	//here ICoach interface is used to get bean
																				//because ICoach have the below listed method and common for all 
																			//classes who so ever implement the ICoach interface
		
		//call methods on the bean
		System.out.println("\ndaily workout of the baseball caoch : "+coach.getDailyWorkout()+"\n");
		
		//output coming by construction injection (baseball caoch)
		System.out.println("daily fortune of baseball coach using construction injection : "+ coach.getDailyFortune()+"\n");
		
		
		System.out.println("daily workout of the track caoch : "+coach1.getDailyWorkout()+"\n");	
		
		//output coming by construction injection (track coach)
		System.out.println("daily fortune of track coach using construction injection : "+ coach1.getDailyFortune()+"\n");
		
		
		//close the context
		context.close();
	}

}
