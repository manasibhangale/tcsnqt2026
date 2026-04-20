package geeksforgeeks.array2;

public class firstnegativenumberinthesubarrayofsizek {
    public static void firstnegative(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<=n-k;i++){
           boolean found=false;
           for(int j=i;j<i+k;j++){
            if(arr[j]<0){
                System.out.print(arr[j]+" ");
                found= true;
                break;
            }
        }
        if(!found){
            System.out.print("0"+" ");
        }
    }
        
        
    }
    public static void main(String args[]){
        int arr[]={1,-1,3,4,-3,-4,-7,-8};
        int k=2;
        firstnegative(arr, k);
    }
}
