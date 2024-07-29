package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
	
	public static boolean areAnagram(String s1,String s2)
	{
		
		char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
		}
	
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter string1:");
			String s1=s.next();
			System.out.println("enter string2:");
			String s2=s.next();
			System.out.println(areAnagram(s1,s2));
			
		}
		
	}


