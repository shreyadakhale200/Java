import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		declaring variables
		int num1,factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate the factorial = ");
		num1 = sc.nextInt();
		
		for(int count = num1;count >= 1;count--)
		{
			factorial = factorial*count;
		}
		System.out.println("The factorial of " + num1 + " is " + factorial);
		sc.close();

	}

}
