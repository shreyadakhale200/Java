package exceptionPrograms;

public class TryCatch_Finally {

	static void testme(String s) {
		try {
			System.out.println("in testme");
			System.out.println("Parse int value " + Integer.parseInt(s));
			System.out.println("end of meth's try");
		} finally {
			System.out.println("in method's finally");
		}
		System.out.println("end of method");
	}

	public static void main(String[] args) {
		try {
			testme("12345");
			System.out.println("end of try in main");
		} catch (Exception e) {
			System.out.println("In main catch");
			System.out.println();
		}
		finally {			
			System.out.println("In main's finally");
		}
		System.out.println("main over ....");
	}
}
