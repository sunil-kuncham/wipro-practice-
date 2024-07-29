package com.wipro.cfm;

import java.util.Comparator;

public class StudentNameCompartor implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//Student std1=(Student)o1;
		//Student std2 =(Student)o2;
		return o2.getStname().compareTo(o1.getStname());
	}

}
