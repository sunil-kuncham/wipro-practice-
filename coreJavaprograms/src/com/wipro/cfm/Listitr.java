package com.wipro.cfm;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listitr {
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("sunil");
	    al.add("pavan");
	    al.add("ram");
	    al.add("ashok");
	    al.add("anusha");
	    al.add("supriya");
	    al.add("vamsi");
	    
	    System.out.println(al);
	    ListIterator<String> ltr=al.listIterator();
	    while(ltr.hasNext())
	    {
	    	System.out.println(ltr.next());
	    	
	    }
	    while(ltr.hasPrevious())
	    {
	    	System.out.println(ltr.previous());
	    	
	    }
	    while(ltr.hasNext())
	    {
	    	String name=ltr.next();
	    	if(name=="Sunil") {
	    		ltr.remove();
	    	}
	    	System.out.println(al);
	    	
	    }
	    
	}

}
