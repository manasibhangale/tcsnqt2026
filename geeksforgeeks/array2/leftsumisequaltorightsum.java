/*
Check if there exists an index where
sum of elements on left = sum of elements on right */
package geeksforgeeks.array2;

public class leftsumisequaltorightsum {
    
    public static boolean is_equilibrium(int arr[]){
        if (arr == null || arr.length == 0) return false;
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum-=arr[i];//rightsum
            if(totalsum==leftsum){
                return true;
            }
            leftsum+=arr[i];
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,3,5,2,2};
        System.out.println(is_equilibrium(arr));
    }
}
