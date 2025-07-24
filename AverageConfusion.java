import java.util.Scanner;

public class AverageConfusion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();

            // If number is less than 10, double it
            if (numbers[i] < 10) {
                numbers[i] *= 2;
            }

            sum += numbers[i];
        }

        double average = (double) sum / 5;
        System.out.println("Average after processing: " + average);
    }
}

