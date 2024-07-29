package com.wipro.cfm;

import java.util.TreeSet;

public class Test6 {
	public static void main(String[] args) {
		
		TreeSet ts =new TreeSet();
		
		for(int i=1;i<=10;i++)
		{
			ts.add(i);
		}
		//System.out.println(ts);
		
		for(Object o:ts)
		{
			if((Integer)o%2==0) {
			System.out.println(o);
			}
		}
	}

}
