package recurssion;

public class arrayissorted {
    public static Boolean is_sorted_arr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return is_sorted_arr(arr,i+1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,8,7};
        System.out.println(is_sorted_arr(arr,0));
    }
}
