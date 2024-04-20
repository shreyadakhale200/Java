package com.BasicOperations;

import java.util.Arrays;

public class MinArray {
	
	static int FindMinArray(int[] arr)
	{
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int INT_MAX = min;
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {23,54,66,87,98};
		MinArray minArray = new MinArray();
		int PrintMin = FindMinArray(arr);
		System.out.println(PrintMin);
//		System.out.println(minArray.FindMinArray(arr));
	}

}
