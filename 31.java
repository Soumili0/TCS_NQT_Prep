//replace all elements by their rank
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // copy array
        int temp[] = arr.clone();

        // sort copied array
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // assign ranks
        for(int i = 0; i < n; i++) {

            if(!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        // replace with rank
        for(int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        // print result
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
/*
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rank[] = new int[n];

        for(int i = 0; i < n; i++) {

            int r = 1;

            for(int j = 0; j < n; j++) {

                if(arr[j] < arr[i]) {
                    r++;
                }
            }

            rank[i] = r;
        }

        // print ranks
        for(int x : rank) {
            System.out.print(x + " ");
        }
    }
}
*/
