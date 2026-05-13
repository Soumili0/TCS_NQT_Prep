/*
Particulate matters are the bigger contributors to Delhi pollution. 
The main reason behind the increase in the concentration of PMs include vehicle emission. 
By applying odd-even concept for all types of vehicles,
the vehicles with the odd last digit in the registration number will be allowed on roads
on odd dates and those with even last digit will be allowed on even dates.
Given an integer array a[], containing the last digit of the registration number of N vehicles travelling on a date D, 
write a program to calculate the total fine collected by the traffic police department from the vehicles violating the rules.
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt(); // date
        int x = sc.nextInt(); // fine amount

        int countEven = 0, countOdd = 0;

        // Count even and odd vehicles
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }

        // If date is odd, even vehicles violate
        if (d % 2 != 0) {

            if (countEven == 0) {
                System.out.println("0");
            } else {
                System.out.println(countEven * x);
            }

        }
        // If date is even, odd vehicles violate
        else {

            if (countOdd == 0) {
                System.out.println("0");
            } else {
                System.out.println(countOdd * x);
            }
        }
    }
}
