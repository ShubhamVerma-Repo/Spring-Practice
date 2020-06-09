package com.demo.springJavaCodeDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCodeConfigurationDemo {

	public static void main(String[] args) {

		//read the spring config java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigurationClass.class);
			
		//retrieve the beans from spring container
		SwimCoach theSwimCoach=context.getBean("swimCoach", SwimCoach.class);		//swimCoach is the bean id in the javaConfigurationClass for SWIMCOACH
				
		IFortuneService theFortuneServiceBean=context.getBean("sadFortuneService", IFortuneService.class);
		
		
		
		//call the method on the bean
		System.out.println("method of the bean : "+theSwimCoach.getDailyWorkout());
		
		
		//call the method of dependency injection (IFortuneService --> SadFortuneService)
		System.out.println("method of sadFortuneService : "+theSwimCoach.getDailyFortune());
		

		
		//call the IFortuneService type bean just for TESTING from JavaConfiguration class
		System.out.println("fortuneServiceBean is used here :   "+theFortuneServiceBean.getFortune());
		
		
		//call the fields name which are injecting using properties file with java annotation 
		
		System.out.println("value of name from properties file : "+theSwimCoach.getName());
		
		System.out.println("value of email from properties file : " +theSwimCoach.getEmail());
		
		
		//close the context
		context.close();
	
		
	}

}
