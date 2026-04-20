
package geeksforgeeks.hashmap;
import java.util.*;
public class ReplacebyRank {
    public static void main(String[] args) {
        int arr[] = {40, 10, 20, 30, 20};

        int n = arr.length;

        // Step 1: Copy and sort array
        int temp[] = arr.clone();
        Arrays.sort(temp);

        // Step 2: Assign rank
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        // Step 3: Replace elements with rank
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        // Output
        System.out.println(Arrays.toString(arr));
    }
}