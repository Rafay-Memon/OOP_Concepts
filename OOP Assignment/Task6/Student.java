import java.util.Scanner;
class Student{
	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	void getStudent()
	{
		System.out.println("Enter id and name: ");
		id = sc.nextInt();
		name = sc.next();
	}
	void displayStudent()
	{
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
}