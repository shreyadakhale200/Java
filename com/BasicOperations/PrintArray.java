package com.BasicOperations;

import java.util.Arrays;

public class PrintArray{
	
	int[] Print(int[] arr)
	{
		return arr;	
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,4,5};
		PrintArray obj = new PrintArray();
		System.out.println("Array = " +Arrays.toString(obj.Print(arr)));
	}

}
