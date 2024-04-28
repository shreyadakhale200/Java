package exceptionPrograms;

import java.util.Scanner;

public class Try_CatchBlock_Exception {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int num1;
			num1 = sc.nextInt();
			int num2;
			num2 = sc.nextInt();
			int div = num2 / num1;
			System.out.println(div);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("\n" + e.getMessage());
		}
		System.out.println("Main continues---");
	}

}
