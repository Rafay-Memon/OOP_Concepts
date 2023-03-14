import java.util.Scanner;
class Employee
{
	int id;
	String name;
	int basic;
	
	Scanner sc = new Scanner(System.in);
	
	Employee()
	{
		System.out.println("Enter id , name , and basic: ");
		id = sc.nextInt();
		name = sc.next();
		basic = sc.nextInt();
	}
	
	void displaySalarySlip()
	{
		System.out.println("     AAAAAAAA Pvt. Ltd.");
		System.out.println("=====================================================");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic : " + basic);
		if(basic >= 5000 && basic < 10000)
		{
			System.out.println("DA(+): " + basic*0.40);
			System.out.println("HRA(+): " + basic*0.20);
			System.out.println("PF(-): " + basic*0.10);
			System.out.println(" ________________________________" );
			System.out.println("NET Salary : " + ((basic + basic*0.40 + basic*0.20) - basic*0.10));

		}
		else if(basic >= 3000 && basic < 5000)
		{
			System.out.println("DA(+): " + basic*0.30);
			System.out.println("HRA(+): " + basic*0.20);
			System.out.println("PF(-): " + basic*0.10);
			System.out.println("________________________________ ");
			System.out.println("NET Salary : " + ((basic + basic*0.30 + basic*0.20) - basic*0.10));
		}
		else if(basic < 3000 )
		{
			System.out.println("DA(+): " + basic*0.20);
			System.out.println("HRA(+): " + basic*0.10);
			System.out.println("PF(-): " + basic*0.10);
			System.out.println("________________________________ ");
			System.out.println("NET Salary : " + ((basic + basic*0.20 + basic*0.10) - basic*0.10));
		}
		else if(basic >= 10000)
		{
			System.out.println("DA(+): " + basic*0.50);
			System.out.println("HRA(+): " + basic*0.30);
			System.out.println("PF(-): " + basic*0.10);
			System.out.println("________________________________" );
			System.out.println("NET Salary : " + ((basic+basic*0.50 + basic*0.30) - basic*0.10));
		}
		System.out.println("=====================================================");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the details of 2 Employees");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("	+++++++++++++++++++++++++++++++++++		");
		System.out.println("	SALARY STATEMENT OF THE EMPLOYEES		");
		System.out.println("	+++++++++++++++++++++++++++++++++++		");
		
		e1.displaySalarySlip();
		e2.displaySalarySlip();
		
	}
}