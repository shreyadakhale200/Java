package com.app.fruits;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number of fruits = ");
		int no = sc.nextInt();
		FruitBasket[] fb = new FruitBasket[no];

		FruitBasket fb1 = new Apple("Kashmiri", "Red", 3, true);

//		Class Cast Exception
//		try {
//			@SuppressWarnings("unused")
//			Mango mango = (Mango) fb1;
//		} catch (ClassCastException cex) {
//			cex.printStackTrace();
//		}
//		finally {
//			System.out.println("in finally class");
//		}

		while (true) {
			System.out.println("1. Purchase Fruit, 2. Complete Purchase");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				UtilityClassFruitBasket.acceptFruitBasket(fb, no);
				break;

			case 2:
				System.out.println("\nYour Purchase List is : ");
				UtilityClassFruitBasket.displayFruits(fb);
				System.out.println("Thank you For Purchasing !! Please Come again");
				return;
//			case 3:
//				System.out.println("Recipes using Fruits");
//				
			}
		}

	}

}
