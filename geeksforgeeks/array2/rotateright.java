package geeksforgeeks.array2;

public class rotateright {

    // Reverse helper
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right rotate by d steps
    public static void rightRotate(int arr[], int d) {

        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        d = d % n;

        if (d == 0) return;

        reverse(arr, n - d, n - 1); // last d
        reverse(arr, 0, n - d - 1); // first part
        reverse(arr, 0, n - 1);     // whole array
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;

        rightRotate(arr, d);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}