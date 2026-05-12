/*Joseph is learning digital logic subject which will be for his next semester.
He usually tries to solve unit assignment problems before the lecture. 
Today he got one tricky question. The problem statement is “A positive integer has been given as an input. 
Convert decimal value to binary representation.
Toggle all bits of it after the most significant bit including the most significant bit.
Print the positive integer value after toggling all bits”.*/
import java.util.*;
public class Main{
  public static void main(String[]args){
Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int bits = Integer.toBinaryString(n).length();
    int masks=(1<<bits)-1;
    System.out.println((n ^ masks));
    
  }
}
