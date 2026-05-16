// Remove duplicate from the unsorted array
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int j = 0;

        for(int i = 0; i < n - 1; i++) {

            if(arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        // last element
        arr[j] = arr[n - 1];
        j++;

        // print unique elements
        for(int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // print unique elements
        for(int x : set) {
            System.out.print(x + " ");
        }
    }
}
*/
