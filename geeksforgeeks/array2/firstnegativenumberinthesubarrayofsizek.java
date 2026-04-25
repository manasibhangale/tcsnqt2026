package geeksforgeeks.array2;

public class firstnegativenumberinthesubarrayofsizek {
    public static void firstnegative(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<=n-k;i++){//goes till -7 only
           boolean found=false;
           for(int j=i;j<i+k;j++){//makes a subarray of size k
            if(arr[j]<0){//checks if the number is negative
                System.out.print(arr[j]+" ");//if it is negative it prints it
                found= true;
                break;
            }
        }
        if(!found){//if not negative print 0
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
