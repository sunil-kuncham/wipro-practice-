package com.wipro.cfm;
import java.util.SortedMap;
import java.util.TreeMap;


public class Test12 {
		public static void main(String[] args) {
			
			//create the object for SortedMap
			
			SortedMap<Integer,Student> sm = new TreeMap();
			
			sm.put(100,new Student(1,"rk"));
			sm.put(300,new Student(-3,"smith"));
			sm.put(200,new Student(22,"john"));
			
			System.out.println(sm);
			System.out.println(sm.firstKey());
			System.out.println(sm.lastKey());
			SortedMap<Integer, Student> tailMap = sm.tailMap(300);
			System.out.println(tailMap);
			SortedMap<Integer, Student> headMap = sm.headMap(300);
			System.out.println(headMap);
		}
	}

