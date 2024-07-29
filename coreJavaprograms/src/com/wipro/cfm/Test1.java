package com.wipro.cfm;

import java.util.List;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args)
	{
		List l= new LinkedList();
		;
		l.add(23);
		 l.add("sunil");
		   l.add(true);
		 l.add('s');
		 l.add(null);
		 l.add(23);
		 
		 System.out.println(l);
		 System.out.println(l.get(2));
		 System.out.println(l.size());
		 System.out.println(l.contains("ram"));
		 System.out.println(l.indexOf(null));
		 
		 l.set(0,1);
		 l.remove(3);
		 System.out.println(l);
		
	}

}
