package com.expceptions;

public class Test7 {
	
	public void checkProductWeight(int weight) {
		
		if(weight>100) {
			System.out.println("Product is vaild");
		}
		else {
			try {
				
				throw new InvalidProductException();
			}
			catch(InvalidProductException ie)
			{
				System.out.println("please check product weight, it must be greater than 100kgs");
			}
			
		}
	}

}
