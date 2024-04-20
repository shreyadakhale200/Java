
public class FibonacciCommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 1;
		
		// fibonnaci series 0 1 1 2 3 5 8
		
		if(args.length==0)
		{
			System.out.println("No Arguments are passed");
		}
		else
		{
			int num = Integer.parseInt(args[0]);
			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			int sum = 0;
			for(int i=3;i<=num;i++)
			{
				sum = num1 + num2;
				System.out.print(sum + " ");
				num1 = num2;
				num2 = sum;
			}
		}
	}

}
