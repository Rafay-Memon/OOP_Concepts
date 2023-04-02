import java.util.Scanner;
class Distance
{
	int distance;
	String unit;
	String conversionUnit;
	double conversion;
	Scanner sc = new Scanner(System.in);
	boolean wrong = false;
	void distanceDetails()
	{
		System.out.println("Enter the distance: ");
		this.distance = sc.nextInt();
		System.out.println("Enter the measurement unit of provided distance:(inches,milimeter,kilometer)?");
		this.unit = sc.next();
		System.out.println("You want to convert this distance into(inches,milimeter,kilometer)? ");
		this.conversionUnit = sc.next();
		switch(unit)
		{
			case "inches":
				switch(conversionUnit)
				{
					case "inches":
						this.conversion = this.distance;
						break;
					case "milimeter":
						this.conversion = this.distance * 25.4;
						break;
					case "kilometer":
						this.conversion = this.distance * 2.54e-5;
						break;
					default:
						System.out.println("Invalid choice, please try again");
						wrong = true;
						break;
				}
				break;
			case "milimeter":
				switch(conversionUnit)
				{
					case "inches":
						this.conversion = this.distance * 0.0393701;
						break;
					case "milimeter":
						this.conversion = this.distance;
						break;
					case "kilometer":
						this.conversion = this.distance * 1e-6;
						break;
					default:
						System.out.println("Invalid choice, please try again");
						wrong = true;
						break;
				}
				break;
			case "kilometer":
				switch(conversionUnit)
				{
					case "inches":
						this.conversion = this.distance * 39370.1;
						break;
					case "milimeter":
						this.conversion = this.distance * 1000000;
						break;
					case "kilometer":
						this.conversion = this.distance;
						break;
					default:
						System.out.println("Invalid choice, please try again");
						wrong = true;
						break;
				}
				break;
			default :
				System.out.println("Invalid choice, please try again");
				wrong = true;
				break;
		}
	}
	void display()
	{
		System.out.println("You provided: " + this.distance + " " + this.unit);
		System.out.println("After conversion: " + this.conversion + " " + this.conversionUnit);
	}
	public static void main(String[] args)
	{
		Distance d = new Distance();
		do
		{
			d.wrong = false;
			d.distanceDetails();
		}
		while(d.wrong == true);
		d.display();
	}
}