import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        Integer minElement = Collections.min(list);
        Integer maxElement = Collections.max(list);
        System.out.println("Minimum Element in the List: " + minElement);
        System.out.println("Maximum Element in the List: " + maxElement);
        scanner.close();
    }
}
