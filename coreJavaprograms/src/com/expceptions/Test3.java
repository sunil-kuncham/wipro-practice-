package com.expceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {

	
	public static void main(String[] args) {
		
		try {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter first no:");
		int fno = s.nextInt();
		
		System.out.println("enter second no:");
		int sno = s.nextInt();
		
		
		int z = fno/sno;
		System.out.println("divsion is: " + z);
		}
		catch(RuntimeException re)
		{
			if(re instanceof ArithmeticException)
			{
				System.out.println("dont enter zero as a denominator");
			}
			//else if(re instanceof InputMismatchException)
			//{
				//System.out.println("please pass only numeric values");
			//}
		}
		
		finally
		{
			System.out.println("finally block gets executed always");
		}
		
		System.out.println("rest statements exceuted");
	}
}
