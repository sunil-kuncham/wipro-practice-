package com.string;

import java.util.Scanner;
import java.io.*;

public class Reverse {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String l=s.next();
		StringBuilder l1=new StringBuilder();
		l1.append(l);
		l1.reverse();
		
		System.out.println(l1);
		
		
	}

}
