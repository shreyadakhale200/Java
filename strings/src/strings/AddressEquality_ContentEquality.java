package strings;

public class AddressEquality_ContentEquality {

	public static void main(String[] args) {
		int data = 100;
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = new String("Hello");
		String s4 = new String("HELLO");

		System.out.println("----------Implies Reference equaltiy----------");

		System.out.println(s1 == s2); // false - their address are different
		System.out.println(s1 == s3);// false - their address are different

		System.out.println("----------Implies Content equaltiy----------");

		System.out.println(s1.equals(s2)); // true - their content are equal
		System.out.println(s1.equals(s3)); // true - their content are not equal
		System.out.println(s1.equalsIgnoreCase(s3)); // true - their content are equal

		s1 = s2 = s3 = s4 = null;

		String s5 = "hello";
		System.out.println(s1); // null
		System.out.println(s5); // hello
		System.out.println("length "+s5.length());
		System.out.println("length "+s1.length());

	}

}
