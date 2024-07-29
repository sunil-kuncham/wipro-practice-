package com.wipro.cfm;

import java.util.TreeSet;

public class Test5 {
	
	public static void main(String[] args) {
		
		//TreeSet al = new TreeSet(new StudentIdCompartor());
		TreeSet<Student> al=new TreeSet(new StudentNameCompartor());
		
		Student std1 =new Student(12,"sunil");
		Student std2 =new Student(24,"pavan");
		Student std3 =new Student(36,"nani");
		
		al.add(std1);
		al.add(std2);
		al.add(std3);
		//System.out.println(al);
		for(Student o:al)
		{
			System.out.println(o);
			//Student stu =(Student)o;
			//System.out.println(stu.getStid()+""+stu.getStname());
		}
	}

}
