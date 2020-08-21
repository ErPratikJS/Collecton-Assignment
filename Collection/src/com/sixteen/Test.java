package com.sixteen;

import java.util.Arrays;

public class Test {
/***Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
 * Create a Set<Student> Student{sid,totalmarks}  from the list and 
 * sort the set in descending order of totalmarks*/
	int tid,sid;
	int marks[];
	public Test(int tid, int sid, int[] marks) {
		
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
