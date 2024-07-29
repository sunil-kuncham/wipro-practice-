package com.wipro.cfm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class Test3 {
	public static void main(String[] args) {
		Set s=new HashSet();               
		
		s.add(80);
		s.add(80);
		s.add("Sunil");
		s.add(null);
		s.add(null);
		s.add(80.5);
		System.out.println(s);
		
		
		Set s1=new LinkedHashSet();
		s1.add(80);
		s1.add(80);
		s1.add("Sunil");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		Set s2 =new TreeSet();
		s2.add("Anu");
		s2.add("pavan");
		s2.add("Sunil");
		s2.add("10");
		//s2.add(10);
		//s2.add(null);
		//s2.add(null);
		System.out.println(s2);
		
		SortedSet s3=new TreeSet();
		
		s3.add(7);
		s3.add(2);
		s3.add(3);
		s3.add(4);
		s3.add(5);
		s3.add(6);
		s3.add(1);
		System.out.println(s3);
		System.out.println(s3.first());
		System.out.println(s3.last());
		System.out.println(s3.subSet(2,7));
		System.out.println(s3.tailSet(3));
		System.out.println(s3.headSet(3));
	}

}
