package com.demo.Controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.logic.StudentCrud;
import com.demo.pojo.Student;

public class MainClassForJavaAnnotation {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextJavaAnnotation.xml");
		Student studentObject= context.getBean("student", Student.class);
		studentObject.setStudentName("Atul");
		System.out.println(studentObject.toString());
		
		
		StudentCrud crudObject=new StudentCrud();
		crudObject.addStudent(studentObject);		
		System.out.println(studentObject.toString());
		
		
		/*
		 * 
		 * TESTING
		 * 
		 * 
		Student newStudentObject=new Student();
		newStudentObject.setStudentName("shubham");
		System.out.println("new Student object : " + newStudentObject.toString());		//give address NULL since this is the normal object used to call
		*/
		
		/*
		 * 
		 *TESTING OF AUTOWIRING 
		 * 
		 * 
		studentObject.setStudentName("Shubham");
		
		TestClass testObject=context.getBean("testClass", TestClass.class);
		System.out.println(" Test class------------- " +testObject);
		
		
		testObject.student.setStudentName("Ashutosh");
		System.out.println("student object ----------" + studentObject.toString());
		
		System.out.println("new object of Test class "+testObject.newStudent.getStudentName());
		*/
		
		
		context.close();
	}

}
