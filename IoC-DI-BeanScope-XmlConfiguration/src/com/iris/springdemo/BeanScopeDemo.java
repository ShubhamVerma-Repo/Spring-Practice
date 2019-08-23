package com.iris.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the beans from spring container
		ICoach coach1=context.getBean("myCoach", ICoach.class);
		
		ICoach coach2=context.getBean("myCoach", ICoach.class);
		
		
		//check if they are same beans		
		boolean result=(coach1==coach2);
		System.out.println("\nboth the beans are same ?  "+result);
		
		//memory location of the beans
		System.out.println("\nmemory location for the coach1 : "+coach1);
		System.out.println("\nmemory location for the coach2 : "+coach2);
		
		
		//close the context
		context.close();
	}

}
