package concrete_utility_client;
import java.util.Scanner;
public class ArrayUtility {
	
	public static void AcceptArrayElments(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void DisplayArrayElements(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void DisplaySumofArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array elements is : " + sum);
	}
}
