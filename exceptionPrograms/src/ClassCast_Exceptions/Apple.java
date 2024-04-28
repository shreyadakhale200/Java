package ClassCast_Exceptions;

public class Apple extends FruitBasket {
	private final static int Price;
	static {
		Price = 20;
	}

	public Apple(String Name, String color, float weight, boolean fresh) {
		super(Name, color, weight, fresh, Price);
//		count++;
	}

	public int getPrice() {
		return Price;
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet n Sour";
	}

	public void Jam() {
		System.out.println(getName() + " Apple is used for making Jam !");
	}

	public String toString() {
		return super.toString();
	}
}
