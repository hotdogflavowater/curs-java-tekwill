package homeWork3;
import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int positiveNumber = 0;
        int negativeNumber = 0;

        while (true) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                negativeNumber++;
            } else {
                positiveNumber++;
            }

        }
        System.out.println("Number of positive numbers: " + positiveNumber);
        System.out.println("Number of negative numbers: " + negativeNumber);

    }
}