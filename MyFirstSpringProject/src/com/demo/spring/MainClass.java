package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanClass beanClassObject= context.getBean("studentBean", BeanClass.class);
		beanClassObject.displayName();
		System.out.println("sum of two numbers : "+beanClassObject.sum());
		
		TempClass tempClassObject=context.getBean("tempBean", TempClass.class);
		System.out.println(tempClassObject.getTempVar());
		
		context.close();
	}

}
