import java.util.Scanner;
class Temp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		double temp;
		double celsius;
		double fahrenhiet;
		System.out.println("Press 1 to convert Fahrenhiet to Celsius \n" +
						   "Press 2 to convert Celsius to Fahrenhiet."
						   );
		choice = sc.nextInt();				   
		if(choice == 1)
		{
			System.out.println("Enter temperature in Fahrenhiet: ");
			temp = sc.nextDouble();
			celsius = ((temp - 32) * 5) / 9;
			System.out.println("In Celsius: " + celsius);
		}
		else if(choice == 2)
		{
			System.out.println("Enter temperature in Celsius: ");
			temp = sc.nextDouble();
			fahrenhiet = ((temp * 9) / 5) + 32;
			System.out.println("In Fahrenhiet: " + fahrenhiet);
		}
		else
		{
			System.out.println("Invalid option.");
		}
	}
}