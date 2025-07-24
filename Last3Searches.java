import java.util.ArrayDeque;
import java.util.Scanner;

public class Last3Searches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> searchHistory = new ArrayDeque<>();

        System.out.println("Enter search terms (type 'exit' to stop):");

        while (true) {
            String search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            // If 3 terms already stored, remove the oldest (front)
            if (searchHistory.size() == 3) {
                searchHistory.removeFirst();
            }

            // Add new search term at the end
            searchHistory.addLast(search);

            // Display current search history
            System.out.println("Current search history: " + searchHistory);
        }
    }
}
