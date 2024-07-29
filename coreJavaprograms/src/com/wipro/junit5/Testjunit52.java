package com.wipro.junit5;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testjunit52 {

	
	private static Calculator obj = null;
	
	@BeforeClass
	public static void init()
	{
		obj=new Calculator();
	}
	
	
	@Test
    public void testAdd()
    {
    	
    	int actualResult = obj.sum(10,20);
    	int expectedResult = 30;
    	assertEquals(expectedResult, actualResult);
    }
	
	
	@Test
	public void testMul()
	{
		
		
		int actualResult = obj.mul(10,200);
		int expectedResult = 2000;
		assertEquals(expectedResult, actualResult);
	}
		
		@AfterClass
		public static void destroy()
		{
			obj=null;
		}
		
	}



