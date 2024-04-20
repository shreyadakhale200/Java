package com.BasicOperations;

import java.util.Arrays;

public class SelectionSort {

	int[] SortArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{102,340,540,653};
		SelectionSort ss = new SelectionSort();
		System.out.println(Arrays.toString(ss.SortArray(arr)));

	}

}
