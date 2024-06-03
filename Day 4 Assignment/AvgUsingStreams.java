import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgUsingStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        double sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = sum / n;
        System.out.println("Average: " + average);
        scanner.close();
    }
}
