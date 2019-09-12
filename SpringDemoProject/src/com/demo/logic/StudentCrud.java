package com.demo.logic;

import java.util.*;
import com.demo.pojo.Student;

public class StudentCrud {
	
	Map<Integer, Student> studentMap=new HashMap<>();

	public String addStudent(Student student) {
		if(!studentMap.containsKey(student.getStudentRoll())) {
			studentMap.put(student.getStudentRoll(), student);
			return "New Student inserted successfully !";
		}
		else {
			return "Student already exists !";
		}
	}
	
	@Override
	public String toString() {
		return "StudentCrud [studentMap=" + studentMap + "]";
	}
}
