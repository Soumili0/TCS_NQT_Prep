/*
given an integer array of size n the task is
to find the count of elements whose value
is greater than all of its priorier elements
*/
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int ans = Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<n;i++){
      if(arr[i] >ans){
        ans= arr[i];
        count++;
      }
    }
    System.out.println(count);
  }
}
