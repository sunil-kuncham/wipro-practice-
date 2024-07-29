package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
			al.add(10);
			al.add(40);
			al.add(30);
			al.add(10);
			al.add(70);
			al.add(60);
			al.add(50);
			al.add(80);
			al.add(100);
			al.add(90);
			
		
		System.out.println(al);
		
		int min=al.get(0);
		int max=al.get(0);
		int n=al.size();
		
			for (int i = 1; i < n; i++) { 
	            if (al.get(i) < min) { 
	                min = al.get(i); 
	            } 
	        } 
			for (int i = 1; i < n; i++) { 
	            if (al.get(i) > max) { 
	                max = al.get(i); 
	            } 
	        } 
			Collections.sort(al);
			//Collections.sort(al, Collections.reverseOrder());
			
			
			System.out.println(al);
			System.out.println("maximum number in arraylist is"+max);
			System.out.println("maximum number in arraylist is"+min);
		}
	
	
	
		
		
	}


