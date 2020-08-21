package com.fourteen;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
/**Given two LinkedList, we need to combine two LinkedList  in such a way that the combined
 *  aList has alternate elements of both. If one list has extra element,
 *   then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}*/
	public static void main(String[] args) {
		LinkedList <Integer> list1=new LinkedList();
		LinkedList <Integer> list2=new LinkedList();
		LinkedList <Integer> list3=new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		
		Iterator itr1 =list1.iterator();
		Iterator itr2 =list2.iterator();
		
		while(itr1.hasNext()&&itr2.hasNext()) {
			list3.add((Integer) itr1.next());
			list3.add((Integer) itr2.next());
		}
		
		while(itr1.hasNext()||itr2.hasNext()) {
			if(itr1.hasNext()) {
			list3.add((Integer) itr1.next());
			}
			else {
			list3.add((Integer) itr2.next());
			}
		}
	
		System.out.println(list3);
	}

}
