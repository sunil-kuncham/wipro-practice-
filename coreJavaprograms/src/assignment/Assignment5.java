package assignment;

import java.util.HashSet;

public class Assignment5 {
	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet();
		
		hs.add("sunil");
		hs.add("pavan");
		hs.add("anusha");
		hs.add("ashok");
		hs.add("vamsi");
		hs.add("sunil");
		hs.add("anusha");
		hs.add("vamsi");
		System.out.println(hs);
		System.out.println(hs.contains("anusha"));
		
	}

}
