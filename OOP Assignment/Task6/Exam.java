import java.util.Scanner;
class Exam extends Student
{
	int sub1;
	int sub2;
	int sub3;
	Scanner sc = new Scanner(System.in);
	
	void getMarks()
	{
		System.out.println("Enter marks in sub1,sub2, and sub3");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}
	
	void showMarks()
	{
		System.out.println("Sub 1: " + sub1);
		System.out.println("Sub 2: " + sub2);
		System.out.println("Sub 3: " + sub3);
	}
	
	public static void main(String[] args)
	{
		Exam[] obj = new Exam[3];
		System.out.println("Enter the details of " + obj.length + " students");
		for(int i = 0; i < obj.length; i++)
		{
			obj[i] = new Exam();
			obj[i].getStudent();
			obj[i].getMarks();
		}
		System.out.println("Details are: ");
		for(int i = 0; i < obj.length; i++)
		{
			obj[i].displayStudent();
			obj[i].showMarks();
		}
	}
}