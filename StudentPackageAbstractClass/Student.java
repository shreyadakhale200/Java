package StudentPackageAbstractClass;

public abstract class Student {
	
	private int StudentId;
	private String Name;
	
	private String Phoneno;
	private String Address; 
	private String Fathers_Name; 
	private String Mothers_Name; 
	private float StudentMark1,StudentMark2,StudentMark3;
	
	public Student()
	{
		StudentId = 0;
		Name = "NA";
		StudentMark1 = 0;
		StudentMark2 = 0;
		StudentMark3 = 0;
		Phoneno = "NA";
		Address = "NA"; 
		Fathers_Name = "NA"; 
		Mothers_Name = "NA";
	}
	
	public Student(int StudentId,String Name,float StudentMark1,float StudentMark2, float StudentMark3,String Phoneno,String Address,String Fathers_Name,String Mothers_Name)
	{
		this.StudentId = StudentId;
		this.Name = Name;
		this.StudentMark1 = StudentMark1;
		this.StudentMark2 = StudentMark2;
		this.StudentMark3 = StudentMark3;
		this.Phoneno = Phoneno;
		this.Address = Address; 
		this.Fathers_Name = Fathers_Name; 
		this.Mothers_Name = Mothers_Name;
	}
	
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
		
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public float getStudentMark1() {
		return StudentMark1;
	}

	public void setStudentMark1(float studentMark1) {
		StudentMark1 = studentMark1;
	}

	public float getStudentMark2() {
		return StudentMark2;
	}

	public void setStudentMark2(float studentMark2) {
		StudentMark2 = studentMark2;
	}

	public float getStudentMark3() {
		return StudentMark3;
	}

	public void setStudentMark3(float studentMark3) {
		StudentMark3 = studentMark3;
	}

	public void setName(String name) {
		Name = name;
	}

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


