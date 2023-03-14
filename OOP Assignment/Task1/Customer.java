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
		Customer c = new Customer();
		c.getDetails();
		c.showDetails();
	}
}