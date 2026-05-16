// Rotate array by k elements
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    int k = sc.nextInt();
    k=k%n;
    int ans[]=new int[n];
    for(int i=0;i<n;i++){
      ans[(k+i)%n]=arr[i];
  }

    for(int i=0;i<n;i++){
      system.out.println(ans[i]);
    }
}
