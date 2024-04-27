package com.app.fruits;

public abstract class FruitBasket {
	private String Name;
	private float weight;
	private String color;
	private boolean fresh;

	public String getName() {
		return Name;
	}

	public float getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
	

	public FruitBasket(String Name, String color, float weight,boolean fresh) {
		this.Name = Name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}

	public abstract String taste();

	@Override
	public String toString()
	{
		return "\n" 
				+ "Fruit Name = " + getName() + 
			   "\nFruit Color = " + getColor() + 
			   "\nFruit Weight = " + getWeight();
	}

	public boolean getFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
}
