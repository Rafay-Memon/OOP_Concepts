import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);
	static int id = 1001;
	int age;
	String name;

	Student()
	{
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	}
	
	void displayInfo()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		id++;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		System.out.println("Details of 5 students: ");
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
		s4.displayInfo();
		s5.displayInfo();
	}
}