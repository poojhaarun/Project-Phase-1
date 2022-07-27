package com.phase.one;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter the value of num: ");
		num=sc.nextInt();
		double a,b;
		a=num;
		System.out.println("Implicit TypeCasting");
		System.out.println("After Typecasting : "+ a);
		b=num+5.6;
		System.out.println("After Typecasting : "+ b);
		System.out.println("Explicit TypeCasting");
		double c;
		System.out.print("Enter the value of c : ");
		c=sc.nextDouble();
		int d=(int)c;
		System.out.println("After TypeCasting : "+ d);
		int e;
		System.out.print("Enter the value of e: ");
		e=sc.nextInt();
		char f=(char)e;
		System.out.println("After Typecasting : "+ c);
		
	}

}
