package com.phase.one;

public class constructor {

	double rad;
	public constructor()
	{
		
	}
	public constructor(int m)
	{
		rad= (m*m);
	    
	}
	public  constructor(int l,int w)
	{
		rad=(l*w);
		
	}
	public  constructor(double r)
	{
	   rad = (3.14 *(r*r));
		
	}
	public void display(int x)
	{
		constructor ob = new constructor(x);
		System.out.println(ob.rad);
	}
	public void display(int l1,int w1)
	{
		constructor ob = new constructor(l1,w1);
		System.out.println(ob.rad);
	}
	public void display(double e)
	{
		constructor ob = new constructor(e);
		System.out.println(ob.rad);
	}
	public double calculate(int dia1,int dia2)
	{
		double res;
		res=((dia1*dia2)/2);
		return res;
	}
	
	public static void main(String[] args)
	{
		constructor con = new constructor();
		con.display(6);
		con.display(3,6);
		con.display(4.0);
		System.out.println(con.calculate(3, 7));
		
	}
}


