package com.app.fruits;

import java.util.Scanner;

public class UtilityClassFruitBasket {

	public static void acceptFruitBasket(FruitBasket[] fb, int size) {
		try {Scanner sc = new Scanner(System.in);
			int count = 0;
			while (count < size) {
				System.out.println("1. Mango, 2. Orange, 3. Apple, 4. Checkout");
				int choice = sc.nextInt();
				if(choice == 4)
				break;
	
				System.out.println("Enter Fruit Name: ");
				String name = sc.next();
	
				System.out.println("Enter Fruit Color: ");
				String color = sc.next();
	
				System.out.println("Enter weight of the fruit: ");
				float weight = sc.nextFloat();
	
//				System.out.println("Enter true if Fruit is Fresh, else enter false if Fruit is stale: ");
//	            boolean fresh = Boolean.parseBoolean(sc.next());

//	            if (!fresh) {
//	                System.out.println("Sorry for the inconvenience. You can buy one more.");
//	                size++; // Increase size if the freshness is false
//	                continue;
//	            }
				int Price = 0;				
				switch (choice) {
				case 1:
					
					fb[count] = new Mango(name, color, weight,true);
					break;
				case 2:
					fb[count] = new Orange(name, color, weight, true);
					break;
				case 3:
					fb[count] = new Apple(name, color, weight,true);
					break;
				case 4:
					return;
				}
				count++;
				if (choice == 4)
					break;
			}
		}catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(" ");
		}
		}

	public static void displayFruits(FruitBasket[] fb) {
//		for (FruitBasket fruit : fb) {
//			if (fruit != null) {
//				System.out.println(fruit);
//			}
		for(int i=0;i<fb.length;i++)
		{
			if(fb[i] != null)
			{
				
			System.out.println(fb[i]);
			if(fb[i] instanceof Mango)
			{
				((Mango)fb[i]).Pulp();
			}
			if(fb[i] instanceof Orange)
			{
				((Orange)fb[i]).Juice();
			}
			if(fb[i] instanceof Apple)
			{
				((Apple)fb[i]).Jam();
			}
		}
		}
		
	}
	
		public static void Recipes(FruitBasket[] fb)
		{
			for(int i=0;i<fb.length;i++)
			{
				if(fb[i] instanceof Mango)
				{
					((Mango)fb[i]).Pulp();
				}
				if(fb[i] instanceof Orange)
				{
					((Orange)fb[i]).Juice();
				}
				if(fb[i] instanceof Apple)
				{
					((Apple)fb[i]).Jam();
				}
			}
		}
}

// size = 3
