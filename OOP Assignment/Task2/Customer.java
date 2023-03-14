import java.util.Scanner;
class Customer
{
	int id;
	String name;
	void getDetails()
	{
		Scanner sc = new Scanner(System.in);
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
		System.out.println("Enter details of 5 customers: ");
		Customer obj1 = new Customer();
		obj1.getDetails();
		Customer obj2 = new Customer();
		obj2.getDetails();
		Customer obj3 = new Customer();
		obj3.getDetails();
		Customer obj4 = new Customer();
		obj4.getDetails();
		Customer obj5 = new Customer();
		obj5.getDetails();
		
		System.out.println("The details of 5 customer");
		
		obj1.showDetails();
		obj2.showDetails();
		obj3.showDetails();
		obj4.showDetails();
		obj5.showDetails();
		
	}
}