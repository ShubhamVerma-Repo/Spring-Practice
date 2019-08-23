package com.iris.springAnnotationDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive the bean from spring container
		ICoach tennisCoach1=context.getBean("tennisCoach", ICoach.class);
		
		ICoach tennisCoach2=context.getBean("tennisCoach", ICoach.class);
		
		
		//check if these two beans are same or not
		boolean result=(tennisCoach1==tennisCoach2);
		System.out.println("\nboth the beans are same ?  "+result);
		
		System.out.println("\nmemory location for the tennisCoach1 : "+tennisCoach1);
		System.out.println("\nmemory location for the tennisCoach2 : "+tennisCoach2);
	}

}
