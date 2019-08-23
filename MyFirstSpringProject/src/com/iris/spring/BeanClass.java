package com.iris.spring;

public class BeanClass 
{
	
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public void displayName()
	{
		System.out.println("hello "+studentName);
	}
	
}
