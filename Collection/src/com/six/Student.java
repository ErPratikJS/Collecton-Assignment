package com.six;

public class Student {

	int rollno ; 
	String name ; 
	int marks;
	public Student(int rollno, String name, int marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student rollno=" + rollno + ", name=" + name + ", marks=" + marks +"\n";
	}
	
	
}
