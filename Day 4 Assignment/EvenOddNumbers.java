import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        int sumEven = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        int sumOdd = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        scanner.close();
    }
}