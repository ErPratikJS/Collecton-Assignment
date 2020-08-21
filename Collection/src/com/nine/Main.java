package com.nine;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
/**Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. 
So create an arraylist of 5 Emp and print all Employee along with their Manager name.*/
	public static void main(String[] args) {
		ArrayList <Emp> al =new ArrayList();
		al.add(new Emp("BoSS",1,0));
		al.add(new Emp("Manager",2,1));
		al.add(new Emp("HR",3,1));
		al.add(new Emp("Emp1",4,2));
		al.add(new Emp("Emp2",5,2));
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			Emp e=(Emp) itr.next();
			String ename=e.name;
			int mid=e.mgrid;
			Iterator itr1 =al.iterator();
			while(itr1.hasNext()) {
				Emp e1=(Emp) itr1.next();
				if(mid==e1.eid)
				{
					System.out.println(ename+"=>"+e1.name);
				}
			}
			
		}
	}

}
