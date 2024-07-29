package assignment;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class Assignment7 {
public static void main(String[] args)
{
	
   TreeMap<String,Integer> tm=new TreeMap<String,Integer>(Collections.reverseOrder());
   
   tm.put("sunil", 89);
   tm.put("pavan", 95);
   tm.put("ram", 96);
   tm.put("ashok", 53);
   tm.put("pavan", 65);
System.out.println(tm);

Set s=tm.entrySet();
Iterator itr=s.iterator();
while(itr.hasNext())
{
	Map.Entry<String,Integer> me = (Map.Entry)itr.next(); 
    System.out.print(me.getKey() + ": "); 
    System.out.println(me.getValue()); 
} 	
}



}

