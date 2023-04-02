import java.util.Scanner;
class Multiples
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		for(int i = 1; i <= 200; i++)
		{
			System.out.print(num * i + "\t");
			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
	}
}