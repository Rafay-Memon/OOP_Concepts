import java.util.Scanner;
class Customer
{
	int id;
	String name;
	
	Scanner sc = new Scanner(System.in);
	
	Customer()
	{
		System.out.println("Enter your id: ");
		id = sc.nextInt();
		System.out.println("Enter your name: ");
		name = sc.next();
		
	}
	
	void showDetails()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the details of 5 customer");
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		
		System.out.println("The details of 5 customer");
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		c4.showDetails();
		c5.showDetails();
	}
}