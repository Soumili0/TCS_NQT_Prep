/*Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 
So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.
 Example 1:
Input 
mon-> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.
Output :
2    -> number of days within 13 days.
*/

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String st = sc.next();
int n = sc.nextInt();

String[]arr = {"mon","tue","wed","thu","fri","sat","sun"};
int i;
for(int i=0;i<arr.length;i++){
if(arr[i].equals(st))break;
}
int res = 1;
rem = 6-i;
n=n-rem;
if(n>0)res+=n/7;
System.out.println(res);
}

}
