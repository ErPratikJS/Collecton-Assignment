package com.eighteen;

import java.util.ArrayList;

public class Main {
/*An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern*/
	
	public static int Show (char c , ArrayList al1) {
		int n=0;
		for(int i=0;i<=al1.size()-1;i++)
		{
			String  s =(String) al1.get(i);
			String S1[] =s.split("\\+");
			String c1=c+"";
			if(S1[0].equals(c1))
			{
				n= Integer.parseInt(S1[1]);
			}
		}
		return n;
		
	}
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList();
		al.add("A+2");
		al.add("B+12");
		al.add("DD+5");
		al.add("D+4");
		
		System.out.println(Show('D',al));
	}

}
