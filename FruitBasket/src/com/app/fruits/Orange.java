package com.app.fruits;

public class Orange extends FruitBasket{
	public Orange(String Name, String color, float weight, boolean fresh)
	{
		super(Name, color, weight,fresh);
//		count++;
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sour";
	}
	
	public void Juice()
	{
		System.out.println(getName() + " Orange of weight " + getWeight() + "kg is used for creating juice !");
	}
	
	public String toString()
	{
		return super.toString();
	}
	

}
