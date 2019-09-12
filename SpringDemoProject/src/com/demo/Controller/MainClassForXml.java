package com.demo.Controller;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.logic.StudentCrud;
import com.demo.pojo.Student;

public class MainClassForXml {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student studentObject=context.getBean("studentBean", Student.class);
		System.out.println("property injection for email : " + studentObject.getTestStudentPropertiesEmail());
		
		StudentCrud crudObject=new StudentCrud();
		
		System.out.println("Student list before adding an element : ");
		System.out.println(crudObject.toString());
		
		crudObject.addStudent(studentObject);
		
		System.out.println("Student list after adding an element : ");
		System.out.println(crudObject.toString());
		
		context.close();
	}

}
