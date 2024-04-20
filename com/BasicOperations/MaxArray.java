package com.BasicOperations;

import java.util.Arrays;

public class MaxArray {
	
	int Print(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int INT_MIN = max;
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {10,20,39,47,52};
		MaxArray obj = new MaxArray();
		System.out.println("array = "+obj.Print(arr));
	}

}
