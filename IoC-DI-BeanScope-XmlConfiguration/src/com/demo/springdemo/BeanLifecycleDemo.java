package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context=new  ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve the beans from spring container
		BeanLifecycleHooks coach1=context.getBean("beanLifecycle", BeanLifecycleHooks.class);
		
		System.out.println("\n"+coach1.beanLifecycleMethod());
		
		//close the context
		context.close();
	}

}
