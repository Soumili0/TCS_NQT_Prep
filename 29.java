//Find all symetric pairs in an array

import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][]=new int[n][2];
    for(int i=0;i<n;i++){
      arr[i][0]=sc.nextInt();
      arr[i][1]=sc.nextInt();
    }

    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<n;i++){
       int first = arr[i][0];
        int second = arr[i][1];
      if(map.containsKey(second) && map.get(second)==first){
        System.out.println(second+" "+" "+first);
      }
      else{
        map.put(first,second);
      }
    }
  }
}
