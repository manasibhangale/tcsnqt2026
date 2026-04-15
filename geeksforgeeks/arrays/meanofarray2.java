package geeksforgeeks.arrays;

public class meanofarray2 {
    public static int mean(int arr[]){
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
        }
        double average= (double)sum/count;
        return (int) Math.floor(average);
    }
    public static void main(String args[]){
        int arr[]={1,3,4,2,6,-5,-8,7};
        System.out.println(mean(arr));
    }
}
