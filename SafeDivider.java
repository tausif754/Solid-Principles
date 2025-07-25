import java.util.Optional;

public class SafeDivider {
    public static void main(String[] args) {
        System.out.println("Division Result 1: " + safeDivide(10, 2).orElse("Not Allowed"));
        System.out.println("Division Result 2: " + safeDivide(10, 0).orElse("Not Allowed"));
    }

    public static Optional<String> safeDivide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of(String.valueOf(a / b));
    }
}
