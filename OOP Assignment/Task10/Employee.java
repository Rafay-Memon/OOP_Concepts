package mypackage;
import java.util.Scanner;
class Employee
{
	int id;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter id and name: ");
		id = sc.nextInt();
		name = sc.next();
	}
	
	void show()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " +  name);
	}
}