//maximum product subarratin an array
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProd = arr[0];
        int minProd = arr[0];
        int ans = arr[0];

        for(int i = 1; i < n; i++) {

            // swap if negative
            if(arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i],
                    maxProd * arr[i]);

            minProd = Math.min(arr[i],
                    minProd * arr[i]);

            ans = Math.max(ans, maxProd);
        }

        System.out.println("Maximum Product = " + ans);
    }
}
