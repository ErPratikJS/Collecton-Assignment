package com.three;

import java.util.Collections;
import java.util.LinkedList;

public class Ques {
/*Given a linked list of integers , find out number of missing elements in linked list. 
 * E.g. list contains { 2 , 3, 7} missing elements are 4, 5, 6. 
 * If list contains { 3 , 13 , 7 , 2 } . missing
		elements are 4,5,6,8,9,10,11,12 and so on.
		 Write a logic which will work for any list.*/
	public static void main(String[] args) {
		LinkedList<Integer> l =  new LinkedList();
		l.add(4);
		l.add(2);
		l.add(10);
		l.add(12);
		System.out.println("list Contains "+l);
		Collections.sort(l);
		int first = l.get(0);
		int last = l.get(l.size()-1);
		for(int i=first;i<=last;i++)
		{
			if(!l.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
