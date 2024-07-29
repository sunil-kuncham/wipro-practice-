package com.expceptions;

public class Test5 {
	public static void main(String[] args)
	{
		Test4 obj=new Test4();
		try {
			obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("enter correct vaule");
		}
	}

}
