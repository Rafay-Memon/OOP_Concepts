import java.util.Scanner;
class Exponential
{
	int power(int n, int p)
	{
		int ans = 1;
		for(int i=1; i <= p; i++)
		{
			ans = ans * n; 
		}
		return ans;
	}
	
	double power(double n, int p)
	{
		double ans = 1;
		for(int i=1; i <= p; i++)
		{
			ans = ans * n; 
		}
		return ans;
	}
	int power(int n)
	{
		int p = 2;
		int ans = 1;
		
		for(int i=1; i <= p; i++)
		{
			ans = ans * n; 
		}
		return ans;
	}
	public static void main(String[] args)
	{
		Exponential e = new Exponential();
		System.out.println(e.power(2.0,8));
		
	}
}