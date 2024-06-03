import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArrayToCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        String[] array = new String[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }
        Collection<String> collection = Arrays.asList(array);
        System.out.println("Elements in the Collection:");
        for (String item : collection) {
            System.out.println(item);
        }
        scanner.close();
    }
}
