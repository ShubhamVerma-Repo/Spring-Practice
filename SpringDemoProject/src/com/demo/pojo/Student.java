package com.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private String studentName;
	private int studentAge;
	private int studentRoll;
	private StudentAddress studentAddress;
	
	private String testStudentPropertiesEmail;
	
	public Student() {
		this.studentRoll += 1;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getTestStudentPropertiesEmail() {
		return testStudentPropertiesEmail;
	}

	public void setTestStudentPropertiesEmail(String testStudentPropertiesEmail) {
		this.testStudentPropertiesEmail = testStudentPropertiesEmail;
	}
	
	@Override
	public String toString() {
		return " [studentName=" + studentName + ", studentAge=" + studentAge + ", studentRoll=" + studentRoll
				+ ", studentAddress=" + studentAddress + "]";
	}

}
