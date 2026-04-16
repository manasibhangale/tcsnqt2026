package hashing.hashset;
import java.util.*;

public class maxsubarraysum0 {
    public static int length(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            // IMPORTANT FIX
            if (sum == 0) {
                len = j + 1;
            }

            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        return len;
    }

    public static void main(String args[]) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int result = length(arr);
        System.out.println("largest subarray sum as zero is : " + result);
    }
}