package exceptionPrograms;

public class Throw_Exception {

	public static void main(String[] args) {
		int result = PerformDivision(10, 0);
		System.out.println("Result: " + result);
	}

	public static int PerformDivision(int num1, int num2) {
		if (num1 == 0)
			throw new ArithmeticException("Division by Zero is not allowed.");
		int div = num2 / num1;
		return div;
	}

}
