package StudentPackageAbstractClass;

public abstract class Student {
	
	protected int StudentId;
	protected String Name;
	
	protected String Phoneno;
	protected String Address; 
	protected String Fathers_Name; 
	protected String Mothers_Name; 
	
	public String getName()
	{
		return Name;
	}
	
	public String getPhoneno()
	{
		return Phoneno;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public String getFathers_Name()
	{
		return Fathers_Name;
	}
	
	public String getMothers_Name()
	{
		return Mothers_Name;
	}
	
	protected float StudentMark1,StudentMark2,StudentMark3;
	
	public abstract float CalculatePercentage();
	
	public String toString()
	{
		return "Student ID = " + StudentId +
			   ", Student Name = " + Name + 
			   ", Student Science Marks = " + StudentMark1 + 
			   ", Student Maths Marks = " + StudentMark1 + 
			   ", Student SST Marks = " + StudentMark3;
	}
	
	public String StudentContactDetails()
	{
		return "Student Name = " + getName() + 
				", Student Phone No = " + getPhoneno() + ", Student Address = " + getAddress() + ", Student Father's Name = " + getFathers_Name() +
				", Student Mother's Name = " + getMothers_Name();
	}

	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setFathers_Name(String fathers_Name) {
		Fathers_Name = fathers_Name;
	}

	public void setMothers_Name(String mothers_Name) {
		Mothers_Name = mothers_Name;
	}
}


