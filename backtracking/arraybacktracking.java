package backtracking;
public class arraybacktracking {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void backtrackarr(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);//prints the first arr ie :{1,2,3,4,5}
            return;
        }
        arr[i]=val;
        backtrackarr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        backtrackarr(arr,0,1);
        printArr(arr);//prints the backtracked array ie: {-1,0,1,2,3}
    }
}
