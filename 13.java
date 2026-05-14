/*
A party has been organised on cruise. The party is organised for a limited time(T).
The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array.
The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
*/
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    int arr2[]=new int[n];
    for(int i=0;i<n;i++){
      arr2[i]=sc.nextInt();
    }

    int max=0,sum=0;
    for(int i=0;i<n;i++){
      sum+=(arr1[i]-arr2[i]);
      max=Math.max(max,sum);
    }
    System.out.println(max);
  }
}
