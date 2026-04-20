
package geeksforgeeks.hashmap;
import java.util.*;

public class frequency {
    public static void freq(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Build result for 1 to N
        int result[] = new int[n];
        for(int i = 1; i <= n; i++){
            result[i - 1] = map.getOrDefault(i, 0);
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,2,5};
        int n = 5;
        freq(arr, n);
    }
}