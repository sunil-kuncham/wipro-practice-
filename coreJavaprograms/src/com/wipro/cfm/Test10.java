package com.wipro.cfm;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put(101,"sunil");
		m.put(null,101);
		m.put(102,"ram");
		m.put(null, null);
		//System.out.println(m);
		for(Object o:m.entrySet())
				{
			     //System.out.println(o);
			Map.Entry entry=(Map.Entry)o;
				
                 Object key=entry.getKey();
                 Object value=entry.getValue();
                 System.out.println("key:"+key+",value:"+value);
                 
                 }
		System.out.println(m.size());
		System.out.println(m.containsKey(101));
	}

}
