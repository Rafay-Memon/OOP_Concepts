import java.util.Scanner;
public class TollBooth {
    private int totalCars;
    private double totalCash;

    public TollBooth() {
        totalCars = 0;
        totalCash = 0.0;
    }

    public void payingCar() {
        totalCars++;
        totalCash += 0.50;
    }

    public void noPayCar() {
        totalCars++;
    }

    public void display() {
        System.out.println("Total cars: " + totalCars);
        System.out.println("Total cash: " + totalCash);
    }

    public static void main(String[] args) {
        TollBooth tollBooth = new TollBooth();
        Scanner scanner = new Scanner(System.in);
        char key;

        do {
            System.out.println("Press 'p' for paying car, 'n' for non-paying car, or 'e' to exit:");
            key = scanner.next().charAt(0);
            if (key == 'p') {
                tollBooth.payingCar();
            } else if (key == 'n') {
                tollBooth.noPayCar();
            }
        } while (key != 'e');

        tollBooth.display();
    }
}