package exceptionPrograms;

import ClassCast_Exceptions.Throwable_ParentClass;
import ClassCast_Exceptions.Exception_Childclass;
import ClassCast_Exceptions.Runtime_Childclass; // Import the correct class
import java.lang.ClassCastException.*;

public class Exceptions {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
//			String s = null;
//			s.length();

//			int a = 3;
//			int b = 0;
//			@SuppressWarnings("unused")
//			int q = a / b;

//			Throwable_ParentClass t = new Throwable_ParentClass(1, " null");
//			Exception_Childclass ec = new Runtime_Childclass(2,"null");

//			Class Cast Exception
//			try {
//				@SuppressWarnings("unused")
//				Mango mango = (Mango) fb1;
//			} catch (ClassCastException cex) {
//				cex.printStackTrace();
//			}
//			finally {
//				System.out.println("in finally class");
//			}

//			Exception_Childclass e = new Runtime_Childclass();
//			 Exception_Childclass exceptionObj = new Runtime_Childclass(1, "Runtime Exception");

//			int[] arr = new int[10];
//			System.out.println(arr[10]);

			String[] s = new String[2];
			System.out.println(s[2]);

		} catch (NullPointerException nexp) {
			nexp.printStackTrace();
		} catch (ArithmeticException aexp) {
			aexp.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aiexp) {
			aiexp.printStackTrace();
		} catch (StringIndexOutOfBoundsException sexp) {
			sexp.printStackTrace();
		}
	}

}
