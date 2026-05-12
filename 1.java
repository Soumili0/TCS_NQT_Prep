/* A chocolate factory is packing chocolates into the packets.
The chocolate packets here represent an array of N number of integer values.
The task is to find the empty packets(0) of chocolates and push it to the end of the conveyor belt(array) */
import java.util.*;
class Main {
    public static void main(String[] args) {
       // System.out.println("Start small. Ship something.");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       
       int j=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0)
           {
               arr[j]=arr[i];
               j++;
           }
       }
           while(j<n){
               arr[j]=0;
               j++;
           }
       
       
       for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
       }
    }
}
