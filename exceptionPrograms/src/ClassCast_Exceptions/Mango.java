package ClassCast_Exceptions;

public class Mango extends FruitBasket{
	private static final int Price = 30;
	public Mango(String Name, String color, float weight, boolean fresh)
	{
		super(Name,color,weight,fresh,Price);
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}
	
	public void Pulp()
	{
		System.out.println(getName() + " Mango of " + getColor() + " color is used for creating pulp !");
	}
	
	public String toString()
	{
		return super.toString();
	}
	

}
