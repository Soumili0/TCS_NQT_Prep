// sort an array according to the order defined by another array
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of arr1
        int n = sc.nextInt();
        int arr1[] = new int[n];

        // Input elements of arr1
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of arr2
        int m = sc.nextInt();
        int arr2[] = new int[m];

        // Input elements of arr2
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of arr1 elements
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print according to arr2 order
        for (int num : arr2) {

            if (map.containsKey(num)) {

                int freq = map.get(num);

                for (int i = 0; i < freq; i++) {
                    System.out.print(num + " ");
                }

                map.remove(num);
            }
        }

        // Store remaining elements
        List<Integer> remaining = new ArrayList<>();

        for (int key : map.keySet()) {

            int freq = map.get(key);

            for (int i = 0; i < freq; i++) {
                remaining.add(key);
            }
        }

        // Sort remaining elements
        Collections.sort(remaining);

        // Print remaining elements
        for (int num : remaining) {
            System.out.print(num + " ");
        }
    }
}
