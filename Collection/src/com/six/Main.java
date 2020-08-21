package com.six;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
/**WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
	Map where key will be marks and value will be List of RollNos 
	where all those students who have same marks are together.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Student> hs= new HashSet();
		hs.add(new Student(1,"shiv",60));
		hs.add(new Student(2,"wer",50));
		hs.add(new Student(3,"sdfg",60));
		hs.add(new Student(4,"sfghj",60));
		hs.add(new Student(5,"shsaju",40));
		hs.add(new Student(6,"erty",50));
		hs.add(new Student(7,"erty",80));
		HashMap <Integer,ArrayList<Integer>> hm =new HashMap();
		Iterator itr =hs.iterator();
		while(itr.hasNext()) {
			Student s=(Student) itr.next();
			ArrayList <Integer> al=new ArrayList();
			if(hm.containsKey(s.marks))
			{
				al=hm.get(s.marks);
			}
			al.add(s.rollno);
			hm.put(s.marks, al);
		}
		System.out.println(hm);
	}

}
