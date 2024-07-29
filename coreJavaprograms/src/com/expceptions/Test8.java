package com.expceptions;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("product weight is:");
		int weight =s.nextInt();
		Test7 obj=new Test7();
		obj.checkProductWeight(weight);
		
	}

}
