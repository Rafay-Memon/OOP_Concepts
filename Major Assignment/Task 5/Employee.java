import java.util.Scanner;
class Employee
{
	int empno;
	float salary;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter employee id: ");
		this.empno = sc.nextInt();
		System.out.println("Enter employee salary: ");
		this.salary = sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("Emp no: " + this.empno);
		System.out.println("Emp salary: " + this.salary);
	}
	public static void main(String[] args)
	{
		Employee[] e = new Employee[3];
		System.out.println("Enter the details of " + e.length + " employees");
		for(int i = 0; i < e.length; i++)
		{
			e[i] = new Employee();
			System.out.println("Employee " + (i + 1));
			e[i].input();
		}
		System.out.println("The details of " + e.length + " employees are: ");
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Employee " + (i + 1));
			e[i].display();
		}
	}
}
