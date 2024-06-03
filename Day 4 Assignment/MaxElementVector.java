import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class MaxElementVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        System.out.print("Enter the number of elements in the Vector: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            vector.add(element);
        }
        Integer maxElement = Collections.max(vector);
        System.out.println("Maximum Element in the Vector: " + maxElement);
        scanner.close();
    }
}
