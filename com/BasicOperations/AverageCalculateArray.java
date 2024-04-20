package com.BasicOperations;

public class AverageCalculateArray {
	
	static float CalculateAverage(int[] arr)
	{
		int sum = 0;
		int average = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		average = sum / arr.length;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {10,20,30,40};
		float average = CalculateAverage(arr);
		System.out.println("Average of Array = " + average);
	}

}
