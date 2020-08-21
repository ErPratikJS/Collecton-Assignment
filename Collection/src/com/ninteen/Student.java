package com.ninteen;

public class Student {
/***There is a HashSet which has student objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)
*/
	int studid;
	String name, qualification;
	int yearOfpassing;
	boolean placed;
	public Student(int studid, String name, String qualification, int yearOfpassing, boolean placed) {
		
		this.studid = studid;
		this.name = name;
		this.qualification = qualification;
		this.yearOfpassing = yearOfpassing;
		this.placed = placed;
	}
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", qualification=" + qualification + ", yearOfpassing="
				+ yearOfpassing + ", placed=" + placed + "]";
	}
	
	

}
