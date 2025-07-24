import java.util.LinkedList;
import java.util.Scanner;

public class ReversedTaskQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> taskList = new LinkedList<>();

        System.out.println("Enter 4 tasks:");

        for (int i = 0; i < 4; i++) {
            String task = scanner.nextLine();

            // Add to front if ends with '!'
            if (task.endsWith("!")) {
                taskList.addFirst(task);
            } else {
                taskList.addLast(task);
            }
        }

        // Print in reverse order
        System.out.println("Tasks in reverse order:");
        for (int i = taskList.size() - 1; i >= 0; i--) {
            System.out.println(taskList.get(i));
        }
    }
}
