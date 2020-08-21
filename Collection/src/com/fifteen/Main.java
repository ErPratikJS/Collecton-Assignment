package com.fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
	/***Assume that there is already  arraylist of members of 
	 * Society Member{memberid,Wing_flatNo,name}.  
	 * Write a program which 
	 * creates Map where key is Wing_FlatNo and value is List of all  names of family members */
	public static void main(String[] args) {
		ArrayList<SocityMem> SMal =new ArrayList();
		HashMap <String,ArrayList<String>> hm = new HashMap();
		SMal.add(new SocityMem(1,"A12","bin"));
		SMal.add(new SocityMem(2,"B12","fan"));
		SMal.add(new SocityMem(3,"A12","Aan"));
		SMal.add(new SocityMem(4,"C22","Can"));
		SMal.add(new SocityMem(5,"D12","Dany"));
		SMal.add(new SocityMem(6,"A12","Andy"));
		SMal.add(new SocityMem(7,"D12","Dany2"));
		
		Iterator itr =SMal.iterator();
		while(itr.hasNext()) {
			SocityMem s=(SocityMem) itr.next();
			ArrayList<String> al=new ArrayList();
			if(hm.containsKey(s.Wing_flatNo)) {
				al=hm.get(s.Wing_flatNo);
			}
			al.add(s.name);
			hm.put(s.Wing_flatNo, al);
		}
		System.out.println(hm);
	}

}
