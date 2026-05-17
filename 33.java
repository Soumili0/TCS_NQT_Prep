//Rotation elements left to Right
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        // left shift
        for(int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // put first element at end
        arr[n - 1] = first;

        // print array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
