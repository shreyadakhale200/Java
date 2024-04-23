package StudentPackageAbstractClass;

public abstract class Student {
	
	protected int StudentId;
	protected String Name;
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
}


