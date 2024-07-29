package com.example.calculate;
import com.example.shapes.Circle;

public class Calculate {
	public static void main(String[] args)
	{
		Circle circle=new Circle(2.5);
		double area = circle.area();
		System.out.println("Area of circle is:"+area);
	}

}
