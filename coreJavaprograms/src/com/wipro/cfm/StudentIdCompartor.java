package com.wipro.cfm;

import java.util.Comparator;

public class StudentIdCompartor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student std1=(Student)o1;
		Student std2=(Student)o2;
		
		return std2.getStid().compareTo(std1.getStid());
		
		
	}

}
