import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
        List<String> uppercaseList = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowercaseList = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Uppercase List: " + uppercaseList);
        System.out.println("Lowercase List: " + lowercaseList);
        scanner.close();
    }
}