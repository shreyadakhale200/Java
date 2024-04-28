package strings;

public class StringOperations {
	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s); // Hello
		String s1 = s;
		System.out.println(s1); // Hello
		String s2 = "World"; 
		s1.concat(" we live in ");
		System.out.println(s1); // Hello
		System.out.println(s2); // World
		
		s2 += " we live in";
		System.out.println(s2); // World we live in
		
		System.out.println(s2.toUpperCase()); // WORLD WE LIVE IN
		System.out.println(s1.toLowerCase()); // hello
		
		System.out.println(s2.substring(2)); // rld we live in
		System.out.println(s2.substring(0, 7)); // World w
		System.out.println(s2.subSequence(1, 5)); // orld
		
		System.out.println(s2.replace('W', 'S'));
		System.out.println(s2.equalsIgnoreCase(s1));		
	}
}
