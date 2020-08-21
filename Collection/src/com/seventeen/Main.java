package com.seventeen;



import java.util.ArrayList;
import java.util.HashMap;

public class Main {
/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al = new ArrayList();
		al.add("A+2");
		al.add("B+12");
		al.add("DD+5");
		al.add("D+4");
		HashMap <String,Integer> hm =new HashMap();
		
		for(int i=0;i<=al.size()-1;i++)
		{
			String  s =al.get(i);
			String S1[] =s.split("\\+");
			hm.put(S1[0], Integer.parseInt(S1[1]));
		}
		System.out.println(hm);
		
	}

}
