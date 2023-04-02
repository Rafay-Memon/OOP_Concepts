import java.util.Scanner;
class Fraction
{
	String add(int a, int b, int c, int d)
	{
		return String.valueOf((a*d + b*c)) + "/"  + String.valueOf(b*d);
	}
	String sub(int a, int b, int c, int d)
	{
		return String.valueOf((a*d - b*c)) + "/"  + String.valueOf(b*d);
	}
	String mul(int a, int b, int c, int d)
	{
		return String.valueOf(a*c) + "/"  + String.valueOf(b*d);
	}
	String div(int a, int b, int c, int d)
	{
		return String.valueOf(a*d) + "/"  + String.valueOf(b*c);
	}
	
	public static void main(String[] args)
	{
		char choice;
		do
		{
			String frac1;
			String frac2;
			String input; 
			int numerator1;
			int numerator2;
			int denominator1;
			int denominator2;
			String operator;
			Scanner sc = new Scanner(System.in);
			Fraction fr = new Fraction();
			System.out.println("Enter fraction1, operator , and fraction2:");
			input = sc.nextLine();
			
			String[] fraction = input.split(" ");
			frac1 = fraction[0];
			operator = fraction[1];
			frac2 = fraction[2];
			String[] fraction1 = frac1.split("/");
			String[] fraction2 = frac2.split("/");
			numerator1 = Integer.parseInt(fraction1[0]);
			denominator1 = Integer.parseInt(fraction1[1]);
			numerator2 = Integer.parseInt(fraction2[0]);
			denominator2 = Integer.parseInt(fraction2[1]);
			
			switch(operator)
			{
				case "+":
					System.out.println("Addition = " + fr.add(numerator1,denominator1,numerator2,denominator2));
					break;
				case "-":
					System.out.println("Subtraction = " + fr.sub(numerator1,denominator1,numerator2,denominator2));
					break;
				case "*":
					System.out.println("Multiplication = " + fr.mul(numerator1,denominator1,numerator2,denominator2));
					break;
				case "/":
					System.out.println("Division = " + fr.div(numerator1,denominator1,numerator2,denominator2));
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			System.out.println("Do another(y/n?)");
			choice = sc.next().charAt(0);
		}
		while(choice == 'y');
	}
}