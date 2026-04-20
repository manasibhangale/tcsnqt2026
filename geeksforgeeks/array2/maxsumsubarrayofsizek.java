package geeksforgeeks.array2;

public class maxsumsubarrayofsizek {

    public static int maxsubarrsumofsizek(int arr[], int k){
        int n = arr.length;

        // Step 1: first window
        int currsum = 0;
        for (int i = 0; i < k; i++){
            currsum += arr[i];
        }

        int maxsum = currsum;

        // Step 2: slide window
        for (int i = k; i < n; i++){
            currsum = currsum + arr[i] - arr[i - k];
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40};
        int k = 2;
        System.out.println(maxsubarrsumofsizek(arr, k)); // 70
    }
}