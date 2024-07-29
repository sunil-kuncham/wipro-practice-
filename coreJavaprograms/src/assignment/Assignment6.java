package assignment;

import java.util.LinkedList;
import java.util.ListIterator;



public class Assignment6 {
public static void main(String[] args) {
	
	LinkedList<Students> al=new LinkedList<Students>();
	
	Students std1 =new Students(123,"sunil",'a');
	Students std2 =new Students(245,"pavan",'b');
	Students std3 =new Students(368,"nani",'b');
	Students std4 =new Students(512,"sunil",'c');
	
	al.add(std1);
	al.add(std2);
	al.add(std3);
	al.add(std4);
	al.add(new Students(143,"ram",'A'));
	System.out.println(al);
	ListIterator<Students> itr=al.listIterator();
	while(itr.hasNext())
	{
		Students student=itr.next();
		if(student.getStid()==123) {
			itr.remove();
			System.out.println(al);
		}
		
	}
	while(itr.hasNext())
	{
		Students student=itr.next();
		if(student.getStname().equalsIgnoreCase("pavan")) {
			itr.next();
			System.out.println(student);
		}
		
	}
}
}
