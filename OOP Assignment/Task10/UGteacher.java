package mypackage;
import java.util.Scanner;
class UGteacher extends Employee
{
	String course;
	Scanner sc = new Scanner(System.in);
	
	void inputCourse()
	{
		System.out.println("Enter the course");
		course = sc.next();
	}
	
	void displayCourse()
	{
		System.out.println("Course: " + course);
	}
	
	public static void main(String[] args)
	{
		UGteacher ug = new UGteacher();
		
		System.out.println("Enter details");
		ug.input();
		ug.inputCourse();
		
		System.out.println("The details are: ");
		ug.show();
		ug.displayCourse();
	}
	
}