package exceptionPrograms;

public class TryCatch_Finally_Throws {

	public static void main(String[] args) {
		try {
			testme("2345");
			System.out.println("end of try in main");
		} catch (Exception e) {
			System.out.println("In main's catch-all");
			System.out.println(e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over....");
	}

	// method
	static void testme(String s) throws InterruptedException {
		System.out.println("in testme");
		try {
			System.out.println("Parsed int value " + Integer.parseInt(s));
			Thread.sleep(2000);
			boolean flag = true;
			if (flag) {
				return;
			}
			System.out.println("end of meth's try");
		} finally {
			System.out.println("in method's finally");
		}
		System.out.println("end of method");
	}

}
