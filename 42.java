//remove all the vowels from a String
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String result = "";
        
        str = str.toLowerCase();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // keep only non-vowels
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result = result + ch;
            }
        }
        
        System.out.println("String after removing vowels: " + result);
    }
}
