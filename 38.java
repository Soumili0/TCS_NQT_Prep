//search an element in an array
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        int target = sc.nextInt();

        int index = -1;

        // Search element
        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // Output
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
