package com.wipro.junit5.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.wipro.junit5.Calculator;


public class TestCalculator {
private static Calculator obj = null;
	
	@BeforeAll
    public static void setUp()
     {
		obj = new Calculator();
     }
	
	
	@Test
	void testSum() {
		
		
		//Calculator obj = new Calculator();
		int actualValue = obj.sum(3, 4);
		
		assertEquals(7, actualValue);
	}
	
	@Test
	void testMul()
	{
		//Calculator obj = new Calculator();
		int actualValue = obj.mul(3, 4);
		assertEquals(12, actualValue);
	}
	
	@AfterAll
	public static void destroy()
	{
		obj = null;
	}
	

}
