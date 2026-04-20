package geeksforgeeks.hashmap;

public class kadans {
    public static int kadansalgo(int arr[]) {
        int maxsum = arr[0];   // handle negative case
        int currsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currsum = Math.max(arr[i], currsum + arr[i]);
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(kadansalgo(arr));  // ✅ print result
    }
}