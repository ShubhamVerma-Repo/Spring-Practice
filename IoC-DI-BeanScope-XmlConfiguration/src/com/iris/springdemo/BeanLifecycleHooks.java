package com.iris.springdemo;

public class BeanLifecycleHooks{

	//add an init method
	public void doMyStartUpStuff()
	{
		System.out.println("you are in :  doMyStartUpStuff !");
	}
	
	
	//any method define in this class
	public String beanLifecycleMethod()
	{
		return "you are in the beanLifecycle method";
	}
	
	//add a destroy method
	public void doMyCleanUpStuff()
	{
		System.out.println("you are in :  doMyCleanUpStuff !");
	}
	
}
