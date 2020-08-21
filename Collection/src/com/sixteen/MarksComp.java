package com.sixteen;

import java.util.Comparator;

public class MarksComp implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s2.totalMakrs-s1.totalMakrs;
	}

}
