import java.util.Scanner;

public class Addnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variables
		int num1=0,num2=0,result=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		num1 = in.nextInt();

		System.out.println("Enter number 2 : ");
		num2 = in.nextInt();
		
		result = num1 + num2;
		
		System.out.println("Sum of numbers are " + result);
		
		in.close();
		
	}

}
