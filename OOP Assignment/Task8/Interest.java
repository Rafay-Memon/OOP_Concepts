class Interest extends Bank
{
	double simpleInterest(double p, double t)
	{
		double r = 0.05;
		return p * r * t;
	}
	
	public static void main(String[] args)
	{
		Interest i1 = new Interest();
		
		System.out.println("Simple interest of bank1 on saving account is: " + i1.simpleInterest(100.0,1.0));
		System.out.println("Simple interest of bank2 on saving account is: " + i1.simpleInterest(100.0,2.0));
	}
}