
package assignment;

import java.util.Scanner;

public class Assignment1 {

    

    public static void main(String[] args){
        try {
        	Scanner s=new Scanner(System.in);
        	System.out.println("enter first number̥");
        	String a=s.nextLine();
        	System.out.println("enter second number̥");      	
        	String b=s.nextLine();
            int num1 =  Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            int z = num1 / num2;
            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("don't enter zero in denominator");
        } catch (NumberFormatException e) {
            System.out.println(" Invalid input.");
        }
    }
    
    
    
}