package com.Twole;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
/***Create a Map<String,String> where key is adharno  and value is voted casted to which party
 * (eg. BJP,ShivSena,NCP,Congress,Other) 
 * .From this create new map such that KEY is party name and value is count of votes casted */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap <String,String> hm =new HashMap();
			HashMap <String,Integer> result =new HashMap();
			hm.put("A001","BJP");
			hm.put("A002","Congress");
			hm.put("A003","ShiveSena");
			hm.put("A004","NCP");
			hm.put("A005","Other");
			hm.put("A006","BJP");
			hm.put("A007","Congress");
			hm.put("A008","ShiveSena");
			hm.put("A009","NCP");
			hm.put("A010","BJP");
			hm.put("A011","ShiveSena");
			hm.put("A012","ShiveSena");
			
			Set s=hm.entrySet();
			Iterator itr =s.iterator();
			while(itr.hasNext()) {
				int cnt=0;
				Map.Entry m=(Entry) itr.next();
				String val =(String) m.getValue();
				String key = (String) m.getKey();
				if(result.containsKey(val)) {
					cnt=result.get(val);
				}
				else {
					cnt=0;
				}
				cnt=cnt+1;
				result.put(val, cnt);
			}
			
			System.out.println(result);
	}

}
