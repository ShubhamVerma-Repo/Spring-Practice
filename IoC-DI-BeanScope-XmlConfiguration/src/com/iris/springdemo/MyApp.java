package com.iris.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//create the object
		//variable reference to an INTERFACE 
		ICoach coachObject1=new BaseballCoach();
		ICoach coachObject2=new TrackCoach();
		
		//use the object
		
		System.out.println(coachObject1.getDailyWorkout());
		System.out.println(coachObject2.getDailyWorkout());
		
	}

}
