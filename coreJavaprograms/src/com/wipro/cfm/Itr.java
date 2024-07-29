package com.wipro.cfm;

import java.util.ArrayList;
import java.util.Iterator;
public class Itr {
		public static void main(String[] args) {
			
			ArrayList<Integer> al =new ArrayList<Integer>();
			for(int i=1;i<=15;i++)
			{
				
				al.add(i);
			}
			
			System.out.println(al);
			Iterator<Integer> itr =al.iterator();
			while(itr.hasNext())
			{
				
				int x=itr.next();
				if(x%2!=0)
				{
					System.out.println(itr.next());
				}
				
			}
			
		}

	}


