package com.wipro.jdbc;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test8 {
	
	public static void main(String[] args) {
		
		List<String> al=Arrays.asList("sunil","pavan","ashok","anusha","supriya");
		
	List<String> filternames=al.stream().filter(x-> x.startsWith("s")).collect(Collectors.toList());
	
	System.out.println(filternames);
	List<String> uppercase=al.stream().map(x-> x.toUpperCase()).collect(Collectors.toList());
	System.out.println(uppercase);
	List<String> asscendingorder=al.stream().sorted().collect(Collectors.toList());
	System.out.println(asscendingorder);
	List<String> descendingorder=al.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
	System.out.println(descendingorder);
      //al.stream().sorted().forEach(x-> System.out.println(x));
	List<Integer> l= Arrays.asList(8,2,5,4,6,3,1,7,9,9,2);
	Optional<Integer> max=l.stream().max((x,y)-> x.compareTo(y));
	max.ifPresent(Value->System.out.println(Value));
	l.stream().min(Comparator.naturalOrder()).ifPresent(value-> System.out.println(value));

	List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
	System.out.println(l1);
	List<Integer> l2=l.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
	System.out.println(l2);
	
	l.stream().reduce((x,y)->x+y).ifPresent(x->System.out.println(x));
	List<Integer>  distinct=l.stream().distinct().collect(Collectors.toList());
	System.out.println(distinct);
	
	List<Customers> Customers =DB.getAll();
	//System.out.println(Customers);
	List<String> Email=Customers.stream().map(x-> x.getEmail()).collect(Collectors.toList());
	System.out.println(Email);
	List<String> name=Customers.stream().map(x-> x.getName()).collect(Collectors.toList());
	System.out.println(name);
	List<String> phonenumbers=Customers.stream().flatMap(x-> x.getPhonenumbers().stream()).collect(Collectors.toList());
	System.out.println(phonenumbers);
	
	}

}
