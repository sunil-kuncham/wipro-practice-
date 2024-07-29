package com.wipro.jdbc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DB {

	
	public static List<Customers> getAll(){
		return Stream.of(
		new Customers(201,"sunil","sunil@gmail.com",Arrays.asList("787949","169256")),
		new Customers(202,"vasmi","vasmi@gmail.com",Arrays.asList("875949","123256")),
		new Customers(203,"pavan","pavan@gmail.com",Arrays.asList("752949","148256"))).collect(Collectors.toList());
	}
	
	
	
}
