package com.fifteen;

public class SocityMem {
/***Assume that there is already  arraylist of members of 
 * Society Member{memberid,Wing_flatNo,name}.  
 * Write a program which 
 * creates Map where key is Wing_FlatNo and value is List of all  names of family members */
	int memberid;
	String Wing_flatNo;
	String name;
	public SocityMem(int memberid, String wing_flatNo, String name) {
		
		this.memberid = memberid;
		Wing_flatNo = wing_flatNo;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "SocityMem [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}
	

}
