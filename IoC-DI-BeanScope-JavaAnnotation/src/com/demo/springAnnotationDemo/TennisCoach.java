package com.demo.springAnnotationDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component*/ 			//default bean...Spring will get register this bean by making 
						//the first letter small of the class name i.e., tennisCoach			
	
@Component("tennisCoach")			//spring automatically register this bean in spring container

/*@Scope("prototype")*/					//default scope is singletone i.e., single bean is used as a shared resourse
								//here we are giving the scope of the bean i.e., PROTOTYPE (new instance on every call)

public class TennisCoach implements ICoach {

	/*
	private IFortuneService fortuneService;	
	*/

	public TennisCoach() {
		System.out.println("you are in the default constructor of tennis coach");
	}

	
	
	//--------------------------	SETTER INJECTION	---------------------------------
	
	@Autowired	
	@Qualifier("restFortuneService")		//qualifier is used to specify the bean among more than one bean who implements the same interface
	private IFortuneService fortuneService;
		
	
	 //--------------------------	CONSTRUCTOR INJECTION	---------------------------------
	/*  
			//constructor injection is done here...Spring will scan for the bean who implements the IFortuneService interface
	@Autowired
	public TennisCoach(IFortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	*/
	
	
	
	//--------------------------	SETTER INJECTION	---------------------------------
	/*
			//setter injection is done here...Spring will scan for the bean who implements the IFortuneService interface
	@Autowired
	public void setFortuneService(IFortuneService thefortuneService)
	{
		System.out.println("you are in the setter injected method");
		fortuneService=thefortuneService;
	}
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "tennis coach using EXPLICIT BEAN ID";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}	
		
	
	//-------------------------		INIT METHOD		-----------------------------------------
		
		//code will execute after the constructor and dependencies injection
	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("\nhey do my START UP stuff");
	}
		
	
	//-------------------------		DESTROY METHOD		-----------------------------------------	
	
		//code will execute before bean is destroyed
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("\nhey do my CLEAN UP stuff");
	}
	

}
