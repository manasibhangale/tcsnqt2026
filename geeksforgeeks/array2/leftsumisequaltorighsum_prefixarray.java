package geeksforgeeks.array2;

public class leftsumisequaltorighsum_prefixarray {
    public static boolean is_equilibrium(int arr[]){
        int n=arr.length;
        int prefix[]=new int [n];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0;i < arr.length;i++) {
            int leftsum=(i==0)?0:prefix[i-1];
            int rightsum=prefix[n-1]-prefix[i];
            if (leftsum == rightsum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,3,5,2,2};
        System.out.println(is_equilibrium(arr));
    }
}
