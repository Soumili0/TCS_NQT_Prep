// sorting by the frequency
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // sort by frequency
        Arrays.sort(arr, (a, b) -> {

            int freqA = map.get(a);
            int freqB = map.get(b);

            // higher frequency first
            if(freqA != freqB) {
                return freqB - freqA;
            }

            // smaller element first
            return a - b;
        });

        // print array
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
