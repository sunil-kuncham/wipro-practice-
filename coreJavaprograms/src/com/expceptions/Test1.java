package com.expceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {

		
		public static void main(String[] args) {
			try {
			Scanner s= new Scanner(System.in);
			System.out.println("enter first number:");
			int fno=s.nextInt();
			System.out.println("enter second number:");
			int sno=s.nextInt();		
			int z = fno/sno;
			System.out.println("divsion is: " + z);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("don't enter zero as denominator");
			}
			catch(InputMismatchException im )
			{
				System.out.println("enter only number");
			}
			
			System.out.println("rest statements exceuted");
		}
	}

