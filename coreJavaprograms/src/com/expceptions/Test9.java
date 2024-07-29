package com.expceptions;

public class Test9 {
	public void checkEvennumber(int number)
	{
		 
		if(number%2==0)
		{
			System.out.println("Number is Even");
		}
		else {
		try{
			throw new InvalidEvenNumber();
			}
		catch(InvalidEvenNumber ie)
		{
			System.out.println("Please Enter even number only");
		}
	}
		 }
}
