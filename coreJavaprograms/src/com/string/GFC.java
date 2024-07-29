package com.string;

import java.util.Arrays;

public class GFC {
	public static void main(String[] args)
	{
		String[] arr
			= { "The", "quick", "brown", "fox", "jumps",
				"over", "the", "lazy", "dog" };

		// converting to string
		String s = Arrays.toString(arr);
		//Arrays.sort(s);
		System.out.println(s);
		
	}
}
