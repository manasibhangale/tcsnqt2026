/*largest number in array */
public class question6 {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallest(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]={10,20,100,80,90,101,86,65};
        System.out.println("the largest number is: "+largest(arr));
        System.out.println("the smallest number is: "+smallest(arr));
    }
}
