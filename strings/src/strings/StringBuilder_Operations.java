package strings;

import java.util.Date;

public class StringBuilder_Operations {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1.length() + " " + sb1.capacity()); // 5 21
		// capacity of StringBuilder is 16 +
		//	 System.out.println(sb1.length() + " " + sb1.capacity()); // 5 21
		// length = (hello) = 5 + 16 = 21
		
		StringBuilder sb2 = sb1.append("123.456 ");
		System.out.println(sb1); // hello 123.456
		System.out.println(sb2); // hello 123.456
		
		System.out.println(sb1 == sb2); // true
		sb1.append(true).	append(8888).append(45.67f).append(new Date());
		System.out.println(sb1); //hello123.456 true888845.67Sun Apr 28 23:26:04 IST 2024
		System.out.println("length = " + sb1.length() + ", Capacity = " + sb1.capacity() + " of sb1"); // length = 54, Capacity = 90 of sb1
		
		sb1.insert(0, new char[] {'a','b','c','d'}, 0, 4); //abcdhello123.456 true888845.67Sun Apr 28 23:29:33 IST 2024
		System.out.println(sb1);
		System.out.println("length = " + sb1.length() + ", Capacity = " + sb1.capacity() + " of sb1"); // length = 58, Capacity = 90 of sb1
		
		//delete characters
		sb1.delete(0, sb1.length());
		System.out.println("After Delete" + sb1); // whole string is deleted
		System.out.println("length = " + sb1.length() + ", Capacity = " + sb1.capacity() + " of sb1"); // length = 0, Capacity = 90 of sb1
		
		sb1.trimToSize();
		System.out.println("length = " + sb1.length() + ", Capacity = " + sb1.capacity() + " of sb1"); // length = 0, Capacity = 0 of sb1
		
		
		
		
		
	}

}
