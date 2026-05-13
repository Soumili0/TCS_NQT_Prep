/*
A super market maintains a pricing format for all its products.
A value N is printed on each product. When the scanner reads the value N on the item,the product of all the digits in the value N is the price of the item.
The task here is to design the s/w such that given the code of any item N the product(multiplication) of the digits of value should be compute(price).
*/
import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res =1;
    while(n>0){
      res*res(n%10);
      n=n/10;
    }
    System.out.println(res);
  }
}
