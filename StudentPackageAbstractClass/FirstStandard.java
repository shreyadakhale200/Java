package StudentPackageAbstractClass;

public class FirstStandard extends Student{
	
	public FirstStandard(int id,String name, float marks1, float marks2, float marks3, String Phone, String address, String Father, String Mother)
	{
		super(id,name,marks1,marks2,marks3,Phone,address,Father,Mother);
//		setStudentId(id);
//		setName(name);
//		setStudentMark1(marks3);
//		setStudentMark2(marks2);
//		setStudentMark3(marks3);
//		setPhoneno(Phone);
//		setAddress(address);
//		setFathers_Name(Father);
//		setMothers_Name(Mother);
		
	}
	
	public FirstStandard()
	{
		super();
	}

	@Override
	public float CalculatePercentage() {
		float total = getStudentMark1() + getStudentMark2() + getStudentMark3();
		float percentage = (total/300)*100;
		return percentage;
	}
	
	public float getCalculaterPercentage()
	{
		return CalculatePercentage();
	}
	
	
	
	public String toString()
	{
		return super.toString() + ", " + " Student Percentage = " +  ", " + getCalculaterPercentage() + ", " +
				super.StudentContactDetails();
	}
	
}