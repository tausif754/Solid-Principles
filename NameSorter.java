import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tausif", "Ahmad", "Danish", "Raghib", "Saba");

        names.sort((n1, n2) -> n1.compareTo(n2));  // Using lambda

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}
