/*
An intelligence agency has received reports about some threats.
The reports consist of numbers in a my number 'R'.
Those numbers are studied throughly and it is concluded that all digits of the number 'N' are summed up and this action is perfored 'R' number times.
The resultout is also a single digit that is yet to be deciphered.
The task here is to find the single digit sum of the given number 'N' by repeating the action 'R' number of times.
*/
import java.util.*;
public class Main{

public static int sumOfDigits(int n){
  int sum =0;
  while(n>0){
    sum+=n%10;
    n=n/10;
  }
  return sum;
}
  
  public static void main(string[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    if(r==0)
      System.out.println("0");
    else{
      int res = sumOfDigits(n)*r;
      int sum =0;
      while(true){
        while(res>0) {
          sum+=res%10;
          res=res/10;
        }

        if((sum%10)==0)
          break;
        else 
          res = sum;
      }
    }
    System.out.println(sum);
  }
}
