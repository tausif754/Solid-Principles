// DependencyInversionPrinciple demonstrates the Dependency Inversion Principle
// by depending on abstractions (interfaces) rather than concrete implementations.

import java.util.Scanner;

interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with Wired Keyboard");
    }
}

class WirelessKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with Wireless Keyboard");
    }
}

class Computer {
    Keyboard keyboard;

    public Computer(Keyboard k) {
        this.keyboard = k;
    }

    void input() {
        keyboard.type();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose keyboard type (wired/wireless): ");
        String choice = scanner.nextLine().toLowerCase();

        Keyboard keyboard;

        if (choice.equals("wired")) {
            keyboard = new WiredKeyboard();
        } else if (choice.equals("wireless")) {
            keyboard = new WirelessKeyboard();
        } else {
            System.out.println("Invalid choice. Defaulting to Wired Keyboard.");
            keyboard = new WiredKeyboard();
        }

        Computer computer = new Computer(keyboard);
        computer.input();

        scanner.close();
    }
}
