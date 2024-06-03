import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxUsingStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        scanner.close();
    }
}
