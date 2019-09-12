package com.demo.Controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Student;

public class MainClassForJavaAnnotation {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextJavaAnnotation.xml");
		Student studentObject= context.getBean("student", Student.class);
		
		System.out.println(studentObject.toString());
		
		
		context.close();
	}

}
