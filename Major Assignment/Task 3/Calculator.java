import java.util.Scanner;
class Calculator
{
	int add(int a, int b)
	{
		return a + b;
	}
	int sub(int a, int b)
	{
		return a - b;
	}
	int mul(int a, int b)
	{
		return a * b;
	}
	double div(double a , double b)
	{
		return a / b;
	}
	public static void main(String[] args)
	{
		char choice;
		int num1;
		int num2;
		char op;
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		do
		{
			System.out.print("Enter first number, operator and second number: ");
			num1 = sc.nextInt();
			op = sc.next().charAt(0);
			num2 = sc.nextInt();
			
			switch(op)
			{
				case '+':
					System.out.println("Answer = " + c.add(num1,num2));
					break;
				case '-':
					System.out.println("Answer = " + c.sub(num1,num2));
					break;
				case '*':
					System.out.println("Answer = " + c.mul(num1,num2));
					break;
				case '/':
					System.out.println("Answer = " + c.div(Double.valueOf(num1),Double.valueOf(num2)));
					break;
				default:
					System.out.println("Invalid operator!");
					break;
			}
			System.out.print("Do Another(y/n)? ");
			choice = sc.next().charAt(0);
		}
		while(choice == 'y');
		
	}
}