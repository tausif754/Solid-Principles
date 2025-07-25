@FunctionalInterface
interface MessagePrinter {
    void print(String message);
}

public class GreetingPrinter {
    public static void main(String[] args) {
        greet(msg -> System.out.println("Hello, " + msg + "!"), "World");
    }

    public static void greet(MessagePrinter printer, String message) {
        printer.print(message);
    }
}
