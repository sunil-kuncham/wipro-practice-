package com.wipro.jlamda;

public interface L1 {
	
	
   void sum(int x,int y);
   
  default void sub(int x,int y) {
	  System.out.println(x-y);
  }
	

}
