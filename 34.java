//eqilibrium index of an array
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;

        // total sum
        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++) {

            totalSum = totalSum - arr[i];

            // check equilibrium
            if(leftSum == totalSum) {
                System.out.println("Equilibrium Index = " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Equilibrium Index");
    }
}
