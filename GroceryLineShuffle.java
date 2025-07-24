import java.util.ArrayDeque;
import java.util.Scanner;

public class GroceryLineShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.println("Enter 5 customer names:");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();

            // Even length → front, Odd → end
            if (name.length() % 2 == 0) {
                queue.addFirst(name);
            } else {
                queue.addLast(name);
            }
        }

        System.out.println("Serving order:");
        for (String customer : queue) {
            System.out.println(customer);
        }
    }
}
