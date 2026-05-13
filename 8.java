/*
an international round table conference will be held in India.
Presidents from over thw world representing their respective countries will be attending the conference.
The task is to find the possible number of ways(p) to make the N numbers sit around the circular table such that 
The precident and prime minister of India will always sit next to each other.
*/
import java.util.*;
public class Main{

  static int fact(int n){
    if(n==0 || n==1)
      return 1;

    return n * fact(n-1);
  }
  
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int ans = 2* fact(n-2);
  System.out.println(ans);
}
}
