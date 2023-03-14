package mypackage;
import java.util.Scanner;
class PGteacher extends Employee
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
		PGteacher pg = new PGteacher();
		
		System.out.println("Enter details");
		pg.input();
		pg.inputCourse();
		
		System.out.println("The details are: ");
		pg.show();
		pg.displayCourse();
	}
	
}