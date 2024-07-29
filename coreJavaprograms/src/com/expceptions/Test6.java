package com.expceptions;

	

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter name");
		
		String name = s.nextLine();
		if(name.startsWith("su"))
		{
			try {
			throw new ArithmeticException();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("name should not start with su");
			}
		}
		else
		{
			System.out.println("welcome to " + name);
		}
	}

}
