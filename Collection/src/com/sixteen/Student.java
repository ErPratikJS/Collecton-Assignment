package com.sixteen;

public class Student {
	int sid,totalMakrs;

	public Student(int sid, int totalMakrs) {
		this.sid = sid;
		this.totalMakrs = totalMakrs;
	}

	@Override
	public String toString() {
		return "Student [  sid=" + sid + ", totalMakrs=" + totalMakrs + "]\n";
	}
	
}
