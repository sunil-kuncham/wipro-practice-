package com.wipro.cfm;

	import java.util.ArrayList;
	import java.util.List;

	public class Test2 {
		
		 public static void main(String[] args) {
			 List l = new ArrayList();
			 
				
				  l.add(Integer.valueOf(31)); 
				  l.add(new String("sunil"));
				  l.add(Boolean.valueOf(true));
				  l.add(Character.valueOf('a')); 
				  l.add(Integer.valueOf(31));
				 
			 
			 
			 System.out.println(l);
			 System.out.println(l.get(4));
			 System.out.println(l.size());
			 System.out.println(l.contains("ram"));
			 System.out.println(l.indexOf(null));
			 System.out.println(l.isEmpty());
			 
			 l.remove(3);
			 System.out.println(l);
			
			 
			
			 
			 
			 
			 
		}

	}

