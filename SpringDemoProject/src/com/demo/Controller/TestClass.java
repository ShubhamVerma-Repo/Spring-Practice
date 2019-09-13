package com.demo.Controller;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Student;

@Component
public class TestClass {
	
	/*
	 * All the 3 annotations are used for dependency injection but
	 * @Autowired is of Spring framework and search bean in this order by Type -> Qualifier -> Name
	 * @Inject is of Java and search bean in this order by Type -> Qualifier -> Name
	 * @Resource is of Java and search bean in this order by Name -> Type -> Qualifier
	 *  
	*/
	
	@Autowired
	Student student;
	
/*	@Inject
	Student student;*/
	
	/*@Resource
	Student student;*/
	
	
	Student newStudent;

	@Override
	public String toString() {
		return "TestClass [student=" + student + "]";
	}
	
}
