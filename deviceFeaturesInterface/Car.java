package deviceFeaturesInterface;

public class Car implements IFeatures{
	private int CarPlateNo;
	private String Model;
	private int Price;
	
	public Car()
	{
		CarPlateNo = 0;
		Model = "NA";
		Price = 0;
	}
	
	public int getCarPlateNo() {
		return CarPlateNo;
	}

	public void setCarPlateNo(int carPlateNo) {
		CarPlateNo = carPlateNo;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Car(int CarPlateNo,String Model,int Price)
	{
		this.CarPlateNo = CarPlateNo;
		this.Model = Model;
		this.Price = Price;
	}
	
	public void GPS()
	{
		System.out.println("Car has GPS");
	}
	
	public String toString()
	{
		return "Plate No : " + getCarPlateNo() + 
			   ", Car Model : " + getModel() + 
			   ", Car Price : " + getPrice();
	}
	
	

}
