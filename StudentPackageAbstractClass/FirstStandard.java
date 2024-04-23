package StudentPackageAbstractClass;

public class FirstStandard extends Student{
	
	public FirstStandard(int id,String name, float marks1, float marks2, float marks3, String Phone, String address, String Father, String Mother)
	{
		this.Address = address;
		this.Phoneno = Phone;
		this.Fathers_Name = Father;
		this.Mothers_Name = Mother;
		this.StudentId = id;
		this.Name = name;
		this.StudentMark1 = marks1;
		StudentMark2 = marks2;
		StudentMark3 = marks3;
	}

	@Override
	public float CalculatePercentage() {
		float total = StudentMark1 + StudentMark2 + StudentMark3;
		float percentage = (total/300)*100;
		return percentage;
	}
	
	public float getCalculaterPercentage()
	{
		return CalculatePercentage();
	}
	
	public String toString()
	{
		return super.toString() + ", " + " Student Percentage = " + getCalculaterPercentage() + 
				super.StudentContactDetails();
	}
	
}