package concrete_utility_client;
import java.util.Scanner;
public class ArrayClient {
	
	public static void main(String[] args) {
		
		int[] array = new int[5]; 
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("1. Accept Elements, 2. Display Elements, 3. Display sum of array elements");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			ArrayUtility.AcceptArrayElments(array);
			break;
		case 2:
			ArrayUtility.DisplayArrayElements(array);
			break;
		case 3:
			ArrayUtility.DisplaySumofArray(array);
			break;
		default:
			return;
		}		
		}
		
	}

}
