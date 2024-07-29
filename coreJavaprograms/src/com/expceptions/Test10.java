package com.expceptions;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter even number:");
		int number=s.nextInt();
		Test9 obj=new Test9();
		obj.checkEvennumber(number);
	}

}
