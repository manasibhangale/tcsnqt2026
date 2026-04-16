/*For array:

[1, 2, 3, 4, 5, 6, 7], d = 2

Steps:

Reverse first d → [2,1,3,4,5,6,7]
Reverse remaining → [2,1,7,6,5,4,3]
Reverse whole → [3,4,5,6,7,1,2]
rotate left the array d steps */
package geeksforgeeks.array2;

public class rotateleft {
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void leftrotate(int arr[],int d){
        if(arr==null || arr.length==0)return ;
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int d =2;
        leftrotate(arr, d);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

    }
}
