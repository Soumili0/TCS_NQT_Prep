// remove spaces
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
            if(ch !=' ') {
                result = result + ch;
            }
        }
        
        System.out.println("String after removing spaces: " + result);
    }
}
