package com.iris.spring;

public class BeanClass 
{
	
	private String studentName;
	private int val1;
	private int val2;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	public void displayName()
	{
		System.out.println("hello "+studentName);
	}
	
	public int sum() {
		return val1 + val2;
	}
	
}
