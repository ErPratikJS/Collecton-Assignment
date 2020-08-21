package com.sixteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	/***Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
	 * Create a Set<Student> Student{sid,totalmarks}  from the list and 
	 * sort the set in descending order of totalmarks*/
	public static void main(String[] args) {
		ArrayList<Test> Tal =new ArrayList<Test>();
		int m1[]= {67,54,67,23,45};
		Tal.add(new Test(101,1,m1));
		int m3[]= {62,63,37,63,45};
		Tal.add(new Test(101,1,m3));
		int[] m2= {22,44,47,43,55};
		Tal.add(new Test(101,1,m2));
		int[] m4= {64,54,37,63,65};
		Tal.add(new Test(101,1,m4));
		//System.out.println(Tal);
		
		TreeSet <Student> ts = new TreeSet(new MarksComp());
		Iterator itr =Tal.iterator();
		while(itr.hasNext()) {
			Test t=(Test) itr.next();
			int marks[]=t.marks;
			int total=0;
			for(int i=0;i<=marks.length-1;i++) {
				total=total+marks[i];
			}
			ts.add(new Student(t.sid,total));
		}
		System.out.println(ts);
	}

}
