package exceptionPrograms;

public class Checked_Exception2 {
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Before");
		Thread.sleep(5000);
		System.out.println("After");
	}
}
