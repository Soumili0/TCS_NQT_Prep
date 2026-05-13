/*
A furnishing company is manufacturing a new collection of curtains.
The curtins are of two colors aqua(a) and black(b).

The curtains color is represented as a string(str) consisting of a's and b's of length n.
then they are packed int L number of curtains in each box.
The box with the maximum number of 'aqua'(a) color curtains is labelled.
The task here is to find the number of 'aqua'color curtains in the labelled box.
*/
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    int n = sc.nextInt();
    int max =0,count=0;

    for(int i=0;i<st.length();i++){
      if(i%n==0){
        max=Math.max(count,max);
        count=0;
      }else
      if(st.charAt(i)=='a'){
        count++;
      }
    }
    max = Math.max(count,max);
    System.out.println(max);
  }
}
