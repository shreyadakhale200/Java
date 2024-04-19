import java.util.Scanner;
public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; //creating the reference
		
		arr = new int[5];
		Scanner userinput = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements of the array = ");
			arr[i] = userinput.nextInt();
			
		}
		int sum= 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("The sum is = " + sum);
		userinput.close();
	}

}
