/*
second smallest and second largest
*/
import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest = arr[i];
            }
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest = arr[i];
            }
        }
        int ans =(secondlargest==Integer.MIN_VALUE)?-1:secondlargest;
        int ans1=(secondsmallest==Integer.MAX_VALUE)?-1:secondsmallest;
        System.out.println(ans);
        System.out.println(ans1);
    }
}
