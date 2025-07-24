import java.util.Scanner;
import java.util.Stack;

public class UndoStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> commandStack = new Stack<>();

        System.out.println("Enter 3 commands:");
        for (int i = 0; i < 3; i++) {
            String command = scanner.nextLine();
            commandStack.push(command);
        }

        System.out.println("Current stack: " + commandStack);

        // Undo last command
        String undoneCommand = commandStack.pop();
        System.out.println("Undone command: " + undoneCommand);

        // Redo by re-adding it in reverse
        String reversed = new StringBuilder(undoneCommand).reverse().toString();
        commandStack.push(reversed);

        System.out.println("Stack after redo (reversed): " + commandStack);
    }
}
