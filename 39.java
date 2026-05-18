//check if Array is a subset of another array or not
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        // Input elements of first array
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        // Input elements of second array
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        // Store arr1 elements in HashSet
        for (int num : arr1) {
            set.add(num);
        }

        boolean isSubset = true;

        // Check arr2 elements
        for (int num : arr2) {

            if (!set.contains(num)) {
                isSubset = false;
                break;
            }
        }

        // Output
        if (isSubset) {
            System.out.println("Subset");
        } else {
            System.out.println("Not a Subset");
        }
    }
}
