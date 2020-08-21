package com.ninteen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	/***There is a HashSet which has student objects. Create two arraylists from this
	hashset. In one arraylist called ‘placedStudents’ insert all students who have
	been placed and in another arraylist ‘unplacedStudents’
	Student class--Fields
	studid, Name, Qualification, yearOfpassing, placed(true/false)
	*/
	public static void main(String[] args) {
		HashSet <Student> hs = new  HashSet();
		hs.add(new Student(1,"Pratik","BE",2019,false));
		hs.add(new Student(2,"Dinesh","BE",2019,true));
		hs.add(new Student(3,"Shital","MCA",2010,true));
		hs.add(new Student(4,"Kiran","BE",2017,false));
		hs.add(new Student(5,"Gauri","BE",2019,false));
		ArrayList <Student> placedStudents= new ArrayList();
		ArrayList <Student> unplacedStudents= new ArrayList();
		
		Iterator itr =hs.iterator();
		while(itr.hasNext()) {
			Student s=(Student) itr.next();
			if(s.placed)
			{
				placedStudents.add(s);
			}
			else {
				unplacedStudents.add(s);
			}
		}
		System.out.println(placedStudents);
		System.out.println(unplacedStudents);
	}

}
