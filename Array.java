package com.phase.one;

import java.util.*;

public class Array {
	


	public static void main(String[] args)
	{
		System.out.println("One Dimensional Array");
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter the array element size : ");
		size=scanner.nextInt();
		int []array= new int[size];
		System.out.print("Enter the element of the array : " );
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Two Dimensional Array");
	    int row;
	    System.out.println("Enter the row size : ");
	    row=scanner.nextInt();
	    int col;
	    System.out.println("Enter the Column size : ");
	    col=scanner.nextInt();
	    int[][] array1= new int[row][col];
	    System.out.print("Enter the elements of the array : ");
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		array1[i][j]=scanner.nextInt();
	    	}
	    }
	    System.out.println("Elements of the array are: ");
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		System.out.print(array1[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	    
	    
		
	}
	
}


