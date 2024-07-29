package com.wipro.jlamda;


import java.util.TreeSet;



public class Test1 {

	
	public static void main(String[] args) {
		//int compare(T o1, T o2);
		TreeSet<Student> ts = new TreeSet<Student>((x,y)-> x.getStname().compareTo(y.getStname()));
		
		Student st1 = new Student(10,"pavan");
		Student st2 = new Student(12,"sunil");
		
		Student st3 = new Student(8,"anusha");
		
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		
		System.out.println(ts);
		
		
	}
}




