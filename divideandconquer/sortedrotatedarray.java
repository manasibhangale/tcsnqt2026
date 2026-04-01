package divideandconquer;

public class sortedrotatedarray {
    public static int sorted_rotated(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //line 1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return sorted_rotated(arr,tar,si,mid-1);
            }else{
                return sorted_rotated(arr,tar,mid+1,ei);
            }
        }
        //line 2
        else{
            if(arr[mid]<=tar && tar<=ei){
                return sorted_rotated(arr,tar,mid+1,ei);
            }else{
                return sorted_rotated(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,3,7,6,2};
        int tar=3;
        int tarIdx=sorted_rotated(arr,tar,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
