package com.wipro.cfm;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
	
	public static void main(String[] args) {
		
		
		
		
		Map<Integer,Student> m = new HashMap();
		
		
		m.put(10, new Student(78,"sunil"));
		m.put(11, new Student(100,"ram"));
		m.put(12, new Student(45,"pavan"));
		m.put(8, new Student(101,"rk"));
		System.out.println(m);
		
		
		for(Map.Entry<Integer,Student> me: m.entrySet())
		{
			System.out.println(me.getKey() + "==> " + me.getValue().getStname() + "==> " + me.getValue().getStid());
			
		}
		
	}

}

