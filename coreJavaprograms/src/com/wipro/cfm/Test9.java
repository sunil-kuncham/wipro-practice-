package com.wipro.cfm;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap();
		
		m.put(21, "sunil");
		m.put(22,"pavan");
		m.put(23,"ram");
		m.put(null, "siva");
		
		System.out.println(m);
		
			for(Map.Entry<Integer,String> entry:m.entrySet())
			{
				System.out.println("Key:"+entry.getKey()+",Value"+entry.getValue());
			}
	
		
		
	}
	

}
