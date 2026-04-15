package geeksforgeeks;

public class checkifarrissorted6 {
    public static boolean is_sorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;  
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        System.out.println(is_sorted(arr));
    }
}
