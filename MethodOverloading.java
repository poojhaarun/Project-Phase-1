package com.phase.one;

public class MethodOverloading {
	public void Calculate(int length, int breadth) {
		System.out.println("Area of Rectangle : " + (length * breadth));

	}

	public void Calculate(double radius) {
		System.out.println("Area of Circle : " + (3.14) * (radius * radius));
	}

	public void Calculate(double num1, double num2) {
		System.out.println("The Sum of Two number :" + (num1 + num2));
	}

	public static void main(String args[]) {
		MethodOverloading ob = new MethodOverloading();
		ob.Calculate(4);
		ob.Calculate(1, 2);
		ob.Calculate(4.3, 28.7);
	}

}