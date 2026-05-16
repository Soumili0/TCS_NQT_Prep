import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // size of array
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // new element input
        int newElement = sc.nextInt();

        // create new array
        int newArr[] = new int[n + 1];

        // copy old array
        for(int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }

        // add new element
        newArr[n] = newElement;

        // print new array
        for(int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
