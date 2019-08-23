package com.iris.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		ICoach tennisCoach=context.getBean("tennisCoach",ICoach.class);	//use the EXPLICIT bean id for the TENNISCOACH class
		
		//ICoach tennisCoach1=context.getBean("tennisCoach", ICoach.class);	//use the default bean id for the TENNISCOACH class
		
		//call the method on bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		
		
		//--------------------------	CONSTRUCTOR INJECTION	---------------------------------
		
		/*
		//call the new method includes the CONSTRUCTOR INJECTION
		System.out.println("constructor injected mehtod : " +tennisCoach.getDailyFortune());
		*/
		
		
		//--------------------------	SETTER INJECTION	---------------------------------
		
		/*
		//call the new method includes the SETTER INJECTION
		System.out.println("setter injected mehtod : " +tennisCoach.getDailyFortune());
		*/
				
		
		//--------------------------	FIELD INJECTION	---------------------------------
		
		//get the field directly from the TennisCoach class using FIELD INJECTION
		System.out.println("field injected mehtod : " +tennisCoach.getDailyFortune());
		
		
		//close the bean
		context.close();
		
		
	}

}
