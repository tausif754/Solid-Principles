import java.util.LinkedList;
import java.util.Scanner;

public class RecentAppMemory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> apps = new LinkedList<>();

        System.out.println("Open 5 apps (duplicates will move to top):");

        for (int i = 0; i < 5; i++) {
            String app = scanner.nextLine();

            // If app already opened, remove it
            if (apps.contains(app)) {
                apps.remove(app);
            }

            // Move to top (front)
            apps.addFirst(app);
        }

        System.out.println("Final App List (Most Recent on Top): " + apps);
    }
}
