package Studentpackage_enum;

//import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		course cname;
		Student std1 = new Student(1,"Shreya",course.DBDA);
		System.out.println(std1.toString());
		if(std1.getCoursesName() == course.DAC)
		{
			System.out.println("Student Course Name = DAC");
		}

	}

}
