//count vowels consonents and the spaces
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        String s = sc.nextLine();
        int vowel =0;
        int consonent =0;
        int space =0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else if(ch>='a'&& ch<='z'){
                consonent++;
            }
            else if(ch==' '){
                space++;
            }
        }
        System.out.println("vowel"+vowel+"consonent"+consonent+"space"+space);
        
    }
}
