package com.four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
/**
 * A hashmap contains information about students and his marks. 
 * Student object is key and marks is value. 
 * Write a method to create 2 hashset which will have passed students of java course 
 * and passed students of angular course. Passing marks for 
 * java is 50 
 * and passing marks for 
 * angular is 60. 
 * Student class is as follows. Student { intsid , String name, String course }*/
	public static void main(String[] args) {
		HashMap <Student,Integer> hs =new HashMap();
		hs.put(new Student(1,"Pratik","java"),83);
		hs.put(new Student(1,"Pratik s","Angular"),53);
		hs.put(new Student(1,"SS","java"),63);
		hs.put(new Student(1,"AA","Angular"),83);
		hs.put(new Student(1,"ASDF","Angular"),63);
		hs.put(new Student(1,"QWER","java"),41);
		//System.out.println(hs);
		HashSet <Student> java= new HashSet();
		HashSet <Student> angular= new HashSet();
		
		Set s =hs.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry m =(Entry) itr.next();
			Student stud = (Student) m.getKey();
			int marks = (int) m.getValue();
			if(stud.course.equalsIgnoreCase("java")&& marks>=50) {
				java.add(stud);
			}
			if(stud.course.equalsIgnoreCase("angular")&& marks>=60) {
				angular.add(stud);
			}
		}
	
		System.out.println(java);
		System.out.println("_______________________");
		System.out.println(angular);
	}

}
