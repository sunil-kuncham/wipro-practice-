package com.wipro.cfm;

import java.util.TreeSet;

public class Test7 {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts =new TreeSet();
		
		for(int i=1;i<=10;i++)
		{
			ts.add(i);
		}
		//ts.add("sunil");
		//System.out.println(ts);
		ts.add(52);
		for(Integer o:ts)
		{
			if(o%2==0) {
			System.out.println(o);
			}
		}
	}

}
