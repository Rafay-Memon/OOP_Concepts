import java.util.Scanner;

public class ScientificCalculator {

    private static final double PI = 3.14159265358979323846;

    public static double calculateSin(double angleInDegrees) {
        double angleInRadians = angleInDegrees * (PI / 180);
        double term = angleInRadians;
        double sum = term;

        for (int i = 1; i <= 10; i++) {
            term = (-1 * term * angleInRadians * angleInRadians) / ((2 * i) * (2 * i + 1));
            sum += term;
        }

        return sum;
    }

    public static double calculateCos(double angleInDegrees) {
        double angleInRadians = angleInDegrees * (PI / 180);
        double term = 1;
        double sum = term;

        for (int i = 1; i <= 10; i++) {
            term = (-1 * term * angleInRadians * angleInRadians) / ((2 * i - 1) * (2 * i));
            sum += term;
        }

        return sum;
    }

    public static double calculateTan(double angleInDegrees) {
        double sin = calculateSin(angleInDegrees);
        double cos = calculateCos(angleInDegrees);

        return sin / cos;
    }

    public static double[] calculateSumAvgMaxMin(double[] numbers) {
        double sum = 0;
        double max = numbers[0];
        double min = numbers[0];

        for (double number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        double avg = sum / numbers.length;

        return new double[] {sum, avg, max, min};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int size;
		double[] arr;
		double angleInDegrees;
		int choice;
		
		System.out.println("1. Calculate sin");
		System.out.println("2. Calculate cos");
		System.out.println("3. Calculate tan");
		System.out.println("4. Calculate  SumAvgMinMax of an array");
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.print("Enter angle in degrees: ");
				angleInDegrees = sc.nextDouble();
				System.out.println("Sin(" + angleInDegrees + ") = " + calculateSin(angleInDegrees));
				break;
			case 2:
				System.out.print("Enter angle in degrees: ");
				angleInDegrees = sc.nextDouble();
				System.out.println("Cos(" + angleInDegrees + ") = " + calculateCos(angleInDegrees));
				break;
			case 3:
				System.out.print("Enter angle in degrees: ");
				angleInDegrees = sc.nextDouble();
				System.out.println("Tan(" + angleInDegrees + ") = " + calculateTan(angleInDegrees));
			case 4:
				System.out.println("How many values you want to put: ");
				size = sc.nextInt();
				System.out.println("Enter values:");
				arr = new double[size];
				for(int i = 0; i < arr.length; i++)
				{
					arr[i] = sc.nextDouble();
				}
				double[] results = calculateSumAvgMaxMin(arr);
				System.out.println("Sum: " + results[0]);
				System.out.println("Average: " + results[1]);
				System.out.println("Max: " + results[2]);
				System.out.println("Min: " + results[3]);
				break;
		}

    }
}