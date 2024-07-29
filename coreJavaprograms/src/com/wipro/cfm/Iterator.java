package com.wipro.cfm;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator {
	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=1;i<=15;i++)
		{
			
			al.add(i);
		}
		
		System.out.println(al);
		Iterator<Integer> itr =al.iterator();
	}

}
