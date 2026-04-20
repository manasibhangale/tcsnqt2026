//output 3
package geeksforgeeks.hashmap;
import java.util.*;

class nonrepeatingelements {
    public static void repeat(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print non-repeating elements
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {-1, -1, 2, 2, 3};
        repeat(arr);  // ✅ You forgot to call the function
    }
}