package com.expceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
	try {
	Scanner n=new Scanner(System.in);
	System.out.println("enter first no:");
	int fno=n.nextInt();
    System.out.println("enter second no:");
    int sno=n.nextInt();
    
    int z=fno/sno;
    System.out.println("divison of no is:"+z);
	}
	catch(RuntimeException re) {
	if(re instanceof ArithmeticException)
		System.out.println("don't print zero as denominator");
	else if(re instanceof InputMismatchException)
	System.out.println("enter only number");
	}
	System.out.println("rest of the statement get excuted");
	}
	

}
