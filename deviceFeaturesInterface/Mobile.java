package deviceFeaturesInterface;

public class Mobile implements IFeatures {
	private String MobileNo;
	private String BrandName;
	private float Price;
	
	public Mobile()
	{
		MobileNo = "NA";
		BrandName = "NA";
		Price = 0;
	}
	
	public String getMobileNo()
	{
		return MobileNo;
	}
	
	public String getBrandName()
	{
		return BrandName;
	}
	
	public float getPrice()
	{
		return Price;
	}
	
	public Mobile(String phone, String brand, float price)
	{
		MobileNo = phone;
		BrandName = brand;
		Price = price;
	}
	
	public void GPS()
	{
		System.out.println("GPS in Mobile");
	}
	
	public String toString()
	{
		return "Mobile No = " + getMobileNo() + ", Brand Name = " + getBrandName() + ", Mobile Price = " + getPrice();
	}
}
